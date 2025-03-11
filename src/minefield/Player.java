package minefield;

public class Player {
    private int row;
    private int col;
    private int nearbyMines;
    private boolean isRevealed;

    public Player(int row, int col, int nearbyMines, boolean isRevealed){
        this.row = row;
        this.col = col;
        this.nearbyMines = nearbyMines;
        this.isRevealed = isRevealed;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }

    public int getNearbyMines(){
        return nearbyMines;
    }

    public boolean isRevealed(){
        return isRevealed;
    }
}
