package minefield;

import mvc.*;
import java.awt.*;

public class MinefieldView extends View {

    int cols = 20;
    int rows = 20;

    public void setModel(Model newModel) {
        super.setModel(newModel);
        // initView();
        repaint();
    }

    public MinefieldView(Minefield m) {
        super(m);
    }

    @Override
    public void paintComponent(Graphics g) {
        setBackground(Color.DARK_GRAY);
        super.paintComponent(g);

        int width = (250 / cols);
        int height = (250 / rows);

        g.setColor(Color.black);

        // Draw vertical lines
        for (int i = 0; i <= cols; i++) {
            int x = width * i;
            g.drawLine(x, 0, x, height * rows);
        }

        // Draw horizontal lines
        for (int i = 0; i <= rows; i++) {
            int y = height * i;
            g.drawLine(0, y, width * cols, y);
        }
    }

}
