package rock_paper_scissior_app;

import java.util.Random;

public class rockpaperscissior {
    // All the choices that the computer can choose
    private static final String[] choices = {"rock", "paper", "scissors"};

    private String computerChoice;  // Stores the computer choice
    private int computerscore;      // Store the computer score
    private int playerscore;        // Store the player score
    private Random random;          // Random generator for computer's choice

    public rockpaperscissior() {
        random = new Random();
        computerscore = 0;
        playerscore = 0;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public int getComputerscore() {
        return computerscore;
    }

    public int getPlayerscore() {
        return playerscore;
    }

    // This method determines the result of the game
    public String play(String playerChoice) {
        // The computer randomly selects a choice
        computerChoice = choices[random.nextInt(choices.length)];

        // Determine the result of the game
        String result;
        if (computerChoice.equals("rock")) {
            if (playerChoice.equals("paper")) {
                result = "Player wins!";
                playerscore++;
            } else if (playerChoice.equals("scissors")) {
                result = "Computer wins!";
                computerscore++;
            } else {
                result = "It's a draw!";
            }
        } else if (computerChoice.equals("paper")) {
            if (playerChoice.equals("scissors")) {
                result = "Player wins!";
                playerscore++;
            } else if (playerChoice.equals("rock")) {
                result = "Computer wins!";
                computerscore++;
            } else {
                result = "It's a draw!";
            }
        } else { // computerChoice.equals("scissors")
            if (playerChoice.equals("rock")) {
                result = "Player wins!";
                playerscore++;
            } else if (playerChoice.equals("paper")) {
                result = "Computer wins!";
                computerscore++;
            } else {
                result = "It's a draw!";
            }
        }

        return result;
    }
}
