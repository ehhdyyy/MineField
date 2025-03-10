package minefield;

public class Tile {
    private boolean isMine;
    private boolean isRevealed;
    private int nearbyMines;
    
    public Tile(){
        this.isMine = false;
        this.isRevealed = false;
        this.nearbyMines = 0;
    }

    public boolean reveal(){
        if(isMine){
            throw Exception;
        }
        else{
            isRevealed = true;
        }
        return isRevealed;
    }

    public int nearby(int row, int col){
        for (int i = row -1; i < row + 1; i++) {
            for(int j = col -1; j < col + 1; j++){
                if(isMine){
                    nearbyMines++;
                }
            }
        }
        return nearbyMines;
    }
}