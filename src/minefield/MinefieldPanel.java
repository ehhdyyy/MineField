package minefield;

import java.awt.*;
import javax.swing.*;
import mvc.*;

public class MinefieldPanel extends AppPanel {
    private JButton nwButton;
    private JButton nButton;
    private JButton neButton;
    private JButton wButton;
    private JButton eButton;
    private JButton swButton;
    private JButton sButton;
    private JButton seButton;

    public MinefieldPanel(AppFactory factory) {
        super(factory);

        nwButton = new JButton("NW");
        nwButton.addActionListener(this);
        controlPanel.add(nwButton);

        nButton = new JButton("N");
        nButton.addActionListener(this);
        controlPanel.add(nButton);

        neButton = new JButton("NE");
        neButton.addActionListener(this);
        controlPanel.add(neButton);

        wButton = new JButton("W");
        wButton.addActionListener(this);
        controlPanel.add(wButton);

        eButton = new JButton("E");
        eButton.addActionListener(this);
        controlPanel.add(eButton);

        swButton = new JButton("SW");
        swButton.addActionListener(this);
        controlPanel.add(swButton);

        sButton = new JButton("S");
        sButton.addActionListener(this);
        controlPanel.add(sButton);

        seButton = new JButton("SE");
        seButton.addActionListener(this);
        controlPanel.add(seButton);

    }

    public static void main(String[] args) {
        AppFactory factory = new MinefieldFactory();
        AppPanel panel = new MinefieldPanel(factory);
        panel.display();
    }

}
