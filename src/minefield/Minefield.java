package minefield;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import mvc.*;

public class Minefield extends Model {
    private static final int percentMined = 5;
    private final List<Tile> path;
    private final Tile[][] field;
    public Tile start;
    public Tile goal;

    public Minefield() {
        path = new ArrayList<>();
        field = new Tile[20][20];
    }

    public List<Tile> getPath() {
        return path;
    }

    public Tile getCurrPos() {
        return path.get(path.size() - 1);
    }

    public Tile makeStartTile(){
        start = field[0][0];
        start.setIsStart();
        return start;
    }

    public Tile MakeGoalTile(){
        goal = field[20][20];
        goal.setIsGoal();
        return goal;
    }

    private void placeMines() {
        Random rand = new Random();
        int amtMined = 0;

        while(amtMined < 10){
            Tile tile = field[rand.nextInt(0, 20)][rand.nextInt(0, 20)];
            if(!tile.getIsMine() && !tile.getIsGoal() && !tile.getIsStart()){
                tile.setIsMine();
                amtMined++;
            }
        }
    }

    @Override
    protected boolean getUnsavedChanges() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUnsavedChanges'");
    }

    @Override
    protected String getFileName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFileName'");
    }

    @Override
    protected void setFileName(String fName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFileName'");
    }

    @Override
    protected void setUnsavedChanges(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setUnsavedChanges'");
    }

    @Override
    protected void unsubscribe(AppPanel appPanel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'unsubscribe'");
    }

    @Override
    protected void subscribe(AppPanel appPanel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subscribe'");
    }

    @Override
    protected void changed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changed'");
    }

}
