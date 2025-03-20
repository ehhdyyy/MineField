package minefield;

import mvc.*;
import java.awt.*;

import javax.swing.*;

public class MinefieldView extends View {

    int cols = 20;
    int rows = 20;
    int tileSize = 12;
    Player player;
    int playerRow;
    int playerCol;

    public void setModel(Model newModel) {
        super.setModel(newModel);
        // initView();
        this.player = ((Minefield) newModel).getPlayer();
        repaint();
    }

    public MinefieldView(Minefield m) {
        super(m);
        this.player = m.getPlayer();
        this.playerRow = player.getRow();
        this.playerCol = player.getCol();

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        playerRow = player.getRow();
        playerCol = player.getCol();

        g.setFont(new Font("Tahoma", Font.BOLD, 10));
        Minefield minefield = (Minefield) model;
        Tile[][] field = minefield.getField();

        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int colIndex = 0; colIndex < cols; colIndex++) {
                drawTile(g, field[rowIndex][colIndex], rowIndex, colIndex);
            }
        }

    }

    public void drawTile(Graphics g, Tile tile, int row, int col) {
        int x = row * tileSize;
        int y = col * tileSize;
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(x, y, tileSize, tileSize);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, tileSize, tileSize);

        if (tile.getIsGoal()) {
            g.setColor(Color.GREEN);
            g.drawRect(x, y, tileSize, tileSize);
        }
        // if (tile.getIsMine()) {  //CHECKS WHERE MINE IS 
        //     g.setColor(Color.RED);
        //     g.fillRect(x, y, tileSize, tileSize);
        // }

        if (playerRow == row && playerCol == col) {
            g.setColor(Color.YELLOW);
        }

        if (tile.getReveal()) {
            g.drawString(Integer.toString(tile.getNearbyMines()), x + tileSize / 3, y + tileSize / 2 + 4);
            g.setColor(Color.white);
            g.drawRect(x, y, tileSize, tileSize);
        } else {
            g.drawString("?", x + tileSize / 3, y + tileSize / 2 + 4);
        }
        repaint();
    }

}
