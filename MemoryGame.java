import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MemoryGame extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static final int WINDOW_WIDTH = 900;
    private static final int WINDOW_HEIGHT = 900;

    private MainPanel mainPanel;

    public MemoryGame() throws IOException {

        setSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Mémory");

        mainPanel = new MainPanel();

        add(mainPanel);

        setVisible(true);
    }
}