package minefield;

import java.awt.*;
import javax.swing.*;
import mvc.*;

public class MinefieldPanel extends AppPanel {

    public MinefieldPanel(AppFactory factory) {
        super(factory);
        controlPanel.setLayout(new GridLayout(4, 2));

        for (String command : factory.getEditCommands()) {
            JPanel p = new JPanel();
            JButton button = new JButton(command);
            button.addActionListener(this);
            p.add(button);
            controlPanel.add(p);
        }

    }

    public static void main(String[] args) {
        AppFactory factory = new MinefieldFactory();
        AppPanel panel = new MinefieldPanel(factory);
        panel.display();
    }

}
