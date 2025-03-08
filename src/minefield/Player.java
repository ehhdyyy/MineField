package minefield;

public class Player {
    private int x;
    private int y;
    private int nearbyMines;
    private boolean isRevealed;

    public Player(int x, int y, int nearbyMines, boolean isRevealed){
        this.x = x;
        this.y = y;
        this.nearbyMines = nearbyMines;
        this.isRevealed = isRevealed;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getNearbyMines(){
        return nearbyMines;
    }

    public boolean isRevealed(){
        return isRevealed;
    }
}
