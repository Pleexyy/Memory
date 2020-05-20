import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MainPanel extends JPanel {
    /**
    	 *
    	 */
    private static final long serialVersionUID = 49806579188664019L;
    private BorderLayout borderLayout;
    private Game game;

    public MainPanel() throws IOException {
        borderLayout = new BorderLayout(1, 1);
        setLayout(borderLayout);
        game = new Game();
        add(game);
        borderLayout.addLayoutComponent(game, BorderLayout.CENTER);
    }
}