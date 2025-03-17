package minefield;

import mvc.*;

public class Player {
    private int row;
    private int col;
    private Minefield minefield;
    private Tile[][] field;
    private Tile tile;

    public Player(Minefield minefield, int row, int col) {
        this.minefield = minefield;
        this.row = row;
        this.col = col;
        field = minefield.getField();
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void movePlayer(int rowAmt, int colAmt) {
        tile = field[this.row][this.col];
        int newRow = this.row + rowAmt;
        int newCol = this.col + colAmt;

        if (newRow < 0 || newRow > 19 || newCol < 0 || newCol > 19) {
            Utilities.inform("Player cannot move out of bounds!");
            return;
        }
        tile = field[newRow][newCol];

        if (tile.getIsMine()) {
            this.row = newRow;
            this.col = newCol;
            Utilities.inform("You stepped on a mine!");
            return;
        }

        if (tile.getIsGoal()) {
            this.row = newRow;
            this.col = newCol;
            Utilities.inform("You won!");
        }

        this.row = newRow;
        this.col = newCol;
        tile.reveal();

    }
}
