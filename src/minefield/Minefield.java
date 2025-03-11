package minefield;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import mvc.*;

public class Minefield extends Model {
    public static final int percentMined = 5;
    private final List<Tile> path;
    private int SIZE = 20;

    public Minefield() {
        path = new ArrayList<>();
        Tile[][] field = new Tile[SIZE][SIZE];
    }

    public List<Tile> getPath() {
        return path;
    }

    public Tile getCurrPos() {
        return path.get(path.size() - 1);
    }

    private static void placeMines() {
        Random rand = new Random();
        int minesPlaced = 0;

        while (minesPlaced < 10) {
            int row = random.nextInt(SIZE);
            int col = random.nextInt(SIZE);
            if (Tile[row][col].getIsMine()) {
                Tile.getIsMine() = true;
                minesPlaced++;
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
