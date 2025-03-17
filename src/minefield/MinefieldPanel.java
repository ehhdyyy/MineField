package minefield;

import java.awt.*;
import java.awt.event.ActionEvent;

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

    @Override
    public void actionPerformed(ActionEvent ae) {
        super.actionPerformed(ae);

        try {
            DIRECTION direction = DIRECTION.valueOf(ae.getActionCommand());
            Minefield minefield = (Minefield) model;

            Commands command = new Commands(minefield, direction);
            command.execute();

        } catch (Exception e) {
            handleException(e);
        }

    }

    public static void main(String[] args) {
        AppFactory factory = new MinefieldFactory();
        AppPanel panel = new MinefieldPanel(factory);
        panel.display();
    }

}
