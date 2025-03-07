package rock_paper_scissior_app;
// frontend

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rockpaperscissiorgui extends JFrame implements ActionListener {
    // player buttons
    JButton rockbutton, paperbutton, scissiorbutton;

    // computer choice label
    JLabel computerchoice;

    // backend object
    rockpaperscissior rockpaperscissior;

    // player and computer score labels
    JLabel playerscorelabel, computerscorelabel;

    public rockpaperscissiorgui() {
        // basic construction of the framework
        super("ROCK PAPER SCISSORS"); // TITLE OF THE FRAMEWORK

        // size of the GUI
        setSize(450, 573);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // center the GUI window on the screen
        setLocationRelativeTo(null);

        // initialize the backend object
        rockpaperscissior = new rockpaperscissior();

        // add GUI components
        addguicomponent();
    }

    private void addguicomponent() {
        // Add computer score label
        computerscorelabel = new JLabel("COMPUTER: 0");
        computerscorelabel.setBounds(0, 43, 450, 30);
        computerscorelabel.setFont(new Font("Dialog", Font.BOLD, 23));
        computerscorelabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(computerscorelabel);

        // Add computer choice label
        computerchoice = new JLabel("?");
        computerchoice.setBounds(175, 118, 98, 81);
        computerchoice.setFont(new Font("Dialog", Font.PLAIN, 18));
        computerchoice.setHorizontalAlignment(SwingConstants.CENTER);
        computerchoice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(computerchoice);

        // Add player score label
        playerscorelabel = new JLabel("PLAYER: 0");
        playerscorelabel.setBounds(0, 317, 450, 30);
        playerscorelabel.setFont(new Font("Dialog", Font.BOLD, 26));
        playerscorelabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(playerscorelabel);

        // Create buttons for player choices
        rockbutton = new JButton("ROCK");
        rockbutton.setBounds(40, 387, 105, 81);
        rockbutton.setFont(new Font("Dialog", Font.PLAIN, 18));
        rockbutton.setActionCommand("rock");
        rockbutton.addActionListener(this);
        add(rockbutton);

        paperbutton = new JButton("PAPER");
        paperbutton.setBounds(165, 387, 105, 81);
        paperbutton.setFont(new Font("Dialog", Font.PLAIN, 18));
        paperbutton.setActionCommand("paper");
        paperbutton.addActionListener(this);
        add(paperbutton);

        scissiorbutton = new JButton("SCISSOR");
        scissiorbutton.setBounds(285, 387, 105, 81);
        scissiorbutton.setFont(new Font("Dialog", Font.PLAIN, 18));
        scissiorbutton.setActionCommand("scissors");
        scissiorbutton.addActionListener(this);
        add(scissiorbutton);
    }

    // Show result in a dialog box
    private void showResultDialog(String message) {
        JDialog resultDialog = new JDialog(this, "Result", true);
        resultDialog.setSize(227, 124);
        resultDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        resultDialog.setResizable(false);

        JLabel resultLabel = new JLabel(message);
        resultLabel.setFont(new Font("Dialog", Font.BOLD, 18));
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resultDialog.add(resultLabel, BorderLayout.CENTER);

        JButton tryAgainButton = new JButton("Try again");
        tryAgainButton.addActionListener(e -> {
            // Reset the choices and scores
            computerchoice.setText("?");
            resultDialog.dispose();
        });
        resultDialog.add(tryAgainButton, BorderLayout.SOUTH);
        resultDialog.setLocationRelativeTo(this);
        resultDialog.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String playerChoice = e.getActionCommand();
        // Play the game and store the result
        String result = rockpaperscissior.play(playerChoice);

        // Update the computer's choice on the screen
        computerchoice.setText(rockpaperscissior.getComputerChoice().toUpperCase());

        // Update scores
        playerscorelabel.setText("PLAYER: " + rockpaperscissior.getPlayerscore());
        computerscorelabel.setText("COMPUTER: " + rockpaperscissior.getComputerscore());

        // Show the result in a dialog
        showResultDialog(result);
    }
}
