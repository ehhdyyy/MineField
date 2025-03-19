package minefield;

import javax.rmi.CORBA.Util;
import javax.swing.text.Utilities;
import mvc.*;

public class Player {
    private int row;
    private int col;

    public Player(Minefield minefield, int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setRow(int newRow) {
        this.row = newRow;
    }

    public void setCol(int newCol) {
        this.col = newCol;
    }
}
