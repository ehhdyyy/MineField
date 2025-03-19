package minefield;

import javax.rmi.CORBA.Util;
import javax.swing.text.Utilities;
import mvc.*;

public class Player {
    private int row;
    private int col;
    private Minefield minefield;
    private Tile[][] field;
    private Tile tile;

    public Player(Minefield minefield, int row, int col) {
        this.row = row;
        this.col = col;
        this.minefield = minefield;
        field = minefield.getField();
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void movePlayer(int x, int y) {
        int newRow = this.row + x;
        int newCol = this.col + y;

        if (newRow < 0 || newRow > 19 || newCol < 0 || newCol > 19) {
            mvc.Utilities.inform("You moved out of bounds!");
            return;
        }

        tile = field[newRow][newCol];

        if (tile.getIsMine()) {
            mvc.Utilities.inform("You stepped on a mine!");
            return;
        }

        if (tile.getIsGoal()) {
            mvc.Utilities.inform("You reached the goal!");
        }

        this.row = newRow;
        this.col = newCol;
        tile.reveal();
    }
}
