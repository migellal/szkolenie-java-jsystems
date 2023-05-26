package dzien5.okienka;

import javax.swing.*;
import java.awt.*;

public class PierwszeOkienko extends JFrame {

    public static void main(String[] args) {
        new PierwszeOkienko();
    }

    public PierwszeOkienko() throws HeadlessException {
        super("Moje pierwsze okienko");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 200);

        JPanel jPanel = new JPanel(null);
        add(jPanel);

        JLabel jLabel = new JLabel("jestem tekstem");
        jLabel.setBounds(5,5, 300, 50);
        jPanel.add(jLabel);

    }
}
