package minefield;

import java.io.Serializable;

import mvc.*;

public class Player implements Serializable{
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

    public void setRow(int newRow){
        this.row = newRow;
    }

    public void setCol(int newCol){
        this.col = newCol;
    }
}
