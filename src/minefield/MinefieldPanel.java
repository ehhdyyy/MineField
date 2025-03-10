package minefield;

import java.awt.*;
import javax.swing.*;
import mvc.*;

public class MinefieldPanel extends AppPanel {

    public MinefieldPanel(AppFactory factory) {
        super(factory);

    }

    public static void main(String[] args) {
        AppFactory factory = new MinefieldFactory();
        AppPanel panel = new MinefieldPanel(factory);
        panel.display();
    }

}
