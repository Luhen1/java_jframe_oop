import java.awt.*;

import javax.swing.*;

public class MainFrame extends JFrame {
    public void initialize() {
        setTitle("Welcome");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}