package minefield;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import mvc.*;

public class Minefield extends Model {
    public static final int percentMined = 5;
    private final List<Player> path;
    private boolean isMine;
    private boolean isRevealed;
    private int nearbyMines;

    public Minefield() {
        path = new ArrayList<>();
        isMine = false;
        isRevealed = false;
        nearbyMines = nearbyMines;
    }

    public List<Player> getPath() {
        return path;
    }

    public Player getCurrPos() {
        return path.get(path.size() - 1);
    }

    private void placeMines() {
        Random rand = new Random();

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
