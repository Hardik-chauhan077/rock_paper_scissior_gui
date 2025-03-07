package rock_paper_scissior_app;

import javax.swing.*;

public class app {
    public static void main(String[] args) {
        // Create and run the GUI in a separate thread
        SwingUtilities.invokeLater(() -> {
            rockpaperscissiorgui rockpaperscissiorGUI = new rockpaperscissiorgui();
            rockpaperscissiorGUI.setVisible(true);  // Display the GUI
        });
    }
}
