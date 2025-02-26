package rock_paper_scissior_app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class rockpaperscissior extends JFrame implements ActionListener {
    // All the choices that the computer can choose
    private static final String[] choices = {"rock", "paper", "scissors"};

    public String getComputerChoice() {
        return computerChoice;
    }

    public int getComputerscore() {
        return computerscore;
    }

    // It stores the computer choice
    private String computerChoice;

    // Store the score that
    private int computerscore;

    public int getPlayerscore() {
        return playerscore;
    }

    // Store the player score;
    private int playerscore;

    private Random random; // It gives random value to the user

    public rockpaperscissior() {
        random = new Random();
    }

    // This is the method where the player chooses rock, paper, or scissors
    public String play(String playerChoice) {
        // The computer randomly selects a choice
        computerChoice = choices[random.nextInt(choices.length)];

        // Determine the result of the game
        String result;
        if (computerChoice.equals("rock")) {
            if (playerChoice.equals("paper")) {
                result = "player wins:";
                playerscore++;
            } else if (playerChoice.equals("scissior")) {
                result = "computer wins:";
                computerscore++;
            } else {
                result = "draw:";
            }
        } else if (computerChoice.equals("paper")) {
            if (playerChoice.equals("scissior")) {
                result = "player wins:";
                playerscore++;
            } else if (playerChoice.equals("rock")) {
                result = "computer wins:";
                computerscore++;
            } else {
                result = "draw:";
            }
        } else {
            if (playerChoice.equals("rock")) {
                result = "player wins:";
                playerscore++;
            } else if (playerChoice.equals("paper")) {
                result = "computer wins:";
                computerscore++;
            } else {
                result = "draw:";
            }
        }

        return result;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}

