import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

public class Game extends JPanel implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Random random;
    private ImageIcon ImageIcon;

    private String[] cards = { "as-coeur.png", "as-carreau.png", "roi-trefle.png", "roi-carreau.png", "dix-carreau.png",
            "dix-trefle.png", "dame-carreau", "dame-refle" };

    public Game() throws IOException {
        // setBackground(Color.BLACK);

        GridLayout layout = new GridLayout(4, 4, 5, 5);
        setLayout(layout);

        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // cards = new Card[4][4];
        randomizer();
        setCards();

    }

    public void setCards() {
        JLabel labels[] = new JLabel[(cards.length * 2)];

        for (int i = 0; i < cards.length / 4; i++) {
            for (int j = 0; j < cards.length / 2 ; j++) {
                labels[i] = new JLabel(ImageIcon = new ImageIcon("cards/" + cards[i]));
                labels[j] = new JLabel(ImageIcon = new ImageIcon("cards/" + cards[j]));
                add(labels[i]);
                add(labels[j]);
         }
        }
    }

    // public void setCards() {
    //     JLabel labels[] = new JLabel[(cards.length*2)];

    //     for (int i = 0; i < cards.length; i++) {
    //         labels[i] = new JLabel(ImageIcon = new ImageIcon("cards/" + cards[i]));
    //         add(labels[i]);
    //     }
    // }

    public void randomizer() {
        random = new Random();
        for (int i = 0; i < cards.length/2; i++) {
            int pos = random.nextInt(cards.length);
            String temp = cards[i];
            cards[i] = cards[pos];
            cards[pos] = temp;
        }
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub

    }

}