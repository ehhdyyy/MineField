package minefield;

public class Tile {
    private boolean isMine;
    private boolean isRevealed;
    private int nearbyMines;
    private boolean isStart;
    private boolean isGoal;
    
    public Tile(){
        this.isMine = false;
        this.isRevealed = false;
        this.nearbyMines = 0;
        this.isStart = false;
        this.isGoal = false;
    }

    public boolean getIsMine(){
        return isMine;
    }

    public void setIsMine(){
        isMine = true;
    }

    public boolean getIsStart(){
        return isStart;
    }

    public void setIsStart(){
        isStart = true;
    }

    public boolean getIsGoal(){
        return isGoal;
    }

    public void setIsGoal(){
        isGoal = true;
    }

    public boolean reveal(){
        if(isMine){
            throw new IndexOutOfBoundsException("You stepped on a Mine!");
        }
        else{
            isRevealed = true;
        }
        return isRevealed;
    }

    public void setNearbyMines(){
        nearbyMines += 1;
    }
}