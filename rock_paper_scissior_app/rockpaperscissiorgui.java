package rock_paper_scissor_app;
// frontend

// library for GUI
import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rockpaperscissiorgui extends JFrame {
    // player button
    JButton rockbutton,paperbutton,scissiorbutton;

    // computer choice
    JLabel computerchoice;
    public rockpaperscissiorgui() {

        // basic construction of the framework

        super("ROCK PAPER SCISSOR"); // TITLE OF THE FRAMEWORK

        // size of the GUI like tkinter in Python
        setSize(450, 573);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // LOAD THE GUI IN THE CENTER OF SCREEN
        setLocationRelativeTo(null);

        // add GUI components like button and other
        addguicomponent();
    }

    private void addguicomponent() {
        JLabel computerscore = new JLabel("COMPUTER: 0");

        // set button alignment, we can say that like x, y, z
        computerscore.setBounds(0, 43, 450, 30);

        // set the font to bold and text size big
        computerscore.setFont(new Font("Dialog", Font.BOLD, 23));
        computerscore.setHorizontalAlignment(SwingConstants.CENTER);

        // add to the GUI
        add(computerscore);

        // add computer choice
        JLabel computerchoice = new JLabel("?");
        computerchoice.setBounds(175, 118, 98, 81); // size of the button
        computerchoice.setFont(new Font("Dialog", Font.PLAIN, 18)); // change the font of the button
        computerchoice.setHorizontalAlignment(SwingConstants.CENTER); // arrange the button in the center

        computerchoice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(computerchoice);

        // create the user score label
        JLabel playerscorelabel = new JLabel("PLAYER: 0");
        playerscorelabel.setBounds(0, 317, 450, 30); // corrected the width
        playerscorelabel.setFont(new Font("Dialog", Font.BOLD, 26));
        playerscorelabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(playerscorelabel);

        // player button by gui
        rockbutton = new JButton("ROCK");
        rockbutton.setBounds(40,387,105,81);

        rockbutton.setFont(new Font("dislogue",Font.PLAIN,18)); // button size and font
        add(rockbutton);

        // paper button
        paperbutton = new JButton("PAPER");
        paperbutton.setBounds(165,387,105,81);
        rockbutton.setFont(new Font("dialogue",Font.PLAIN,18)); // button size and font
        add(paperbutton);

        // scissior button
        scissiorbutton = new JButton("SCISSOR");
        scissiorbutton.setBounds(285,387,105,54);
        scissiorbutton.setFont(new Font("dialogue",Font.PLAIN,18)); // button size and font
        add(scissiorbutton);
        Showdialouge("text messege");

    }

    // show a dialuge box  in result s declare who win who loose
    private  void Showdialouge(String message){ // function
        JDialog resultdialog = new JDialog(this, "Result",true);
        resultdialog.setSize(227,124);
        resultdialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        resultdialog.setResizable(false);


        // messege  for result in the box
        JLabel resultLevel = new JLabel(message);
        resultLevel.setFont(new Font("Dialogue",Font.BOLD,18));
        resultLevel.setHorizontalAlignment(SwingConstants.CENTER);
        resultdialog.add(resultLevel,BorderLayout.CENTER);

        // try again button
        JButton tryAgainButton = new JButton("Try again");
        tryAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Your code to handle the button click
                // reset the computer choice and the user choice  now the game will run
                computerchoice.setText("?");

                // close the dialogue box
                resultdialog.dispose();
            }
        });
        resultdialog.add(tryAgainButton,BorderLayout.SOUTH);
        resultdialog.setLocationRelativeTo(this);
        resultdialog.setVisible(true);



    }
}
