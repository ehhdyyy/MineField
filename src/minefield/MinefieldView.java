package minefield;

import mvc.*;
import java.awt.*;

import javax.swing.*;

public class MinefieldView extends View {

    int cols = 20;
    int rows = 20;
    int tileSize = 12;
    JPanel gridPanel = new JPanel(new GridLayout(rows,cols));
    JLabel[][] gridLabels = new JLabel[rows][cols];
    
    int playerRow = 0;
    int playerCol = 0;


    public void setModel(Model newModel) {
        super.setModel(newModel);
        // initView();
        repaint();
    }

    public MinefieldView(Minefield m) {
        super(m);

    }

    public void movePlayer(int newRow, int newCol){
        gridLabels[playerRow][playerCol].setBackground(Color.lightGray);

        playerRow = newRow;
        playerCol = newCol;

        gridLabels[playerRow][playerCol].setBackground(Color.yellow);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 8));
        Minefield minefield = (Minefield) model;
        Tile[][] field = minefield.getField();
        
        for(int rowIndex = 0; rowIndex < rows; rowIndex++){
            for(int colIndex = 0; colIndex < cols; colIndex++){
                drawTile(g, field[rowIndex][colIndex], rowIndex, colIndex);    
            }
        }

    }

    public void drawTile(Graphics g, Tile tile, int row, int col){
        int x = row * tileSize;
        int y = col * tileSize;
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(x, y, tileSize, tileSize);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, tileSize, tileSize);

        if(tile.getIsGoal()){
            g.setColor(Color.GREEN);
            g.drawRect(x,y,tileSize,tileSize);
        }
        if(tile.getIsMine()){
            g.setColor(Color.RED);
            g.fillRect(x,y,tileSize,tileSize);
        }
    
        if(!tile.getReveal()){
            g.drawString(Integer.toString(tile.getNearbyMines()), x + tileSize / 3, y + tileSize / 2 + 5);
        }else{
            g.drawString(Integer.toString(tile.getNearbyMines()), x + tileSize / 3, y + tileSize / 2 + 5);
        }

            
    }

}
