package rock_paper_scissior_app;

import javax.swing.*;

// backend
public class app {
    public static void main(String[] args) {

        // we creting the thred that  run the our gui
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                rock_paper_scissor_app.rockpaperscissiorgui rockpapersisgui = new rock_paper_scissor_app.rockpaperscissiorgui(); // object that run in the  thread

                // display the gui
                rockpapersisgui.setVisible(true);
            }
        });

    }
}
