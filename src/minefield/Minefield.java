package minefield;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import mvc.*;

public class Minefield extends Model {
    private static final int percentMined = 5;
    private Player player;
    private final Tile[][] field;
    public Tile start;
    public Tile goal;

    public Minefield() {
        field = new Tile[20][20];
        this.player = player;
    }

    public void move(Heading heading) {
        try {
            switch (heading) {
                case "N": {
                    player.movePlayer(0, -1);
                    break;
                }

                case "E": {
                    player.movePlayer(1, 0);
                    break;
                }

                case "W": {
                    player.movePlayer(-1, 0);
                    break;
                }

                case "S": {
                    player.movePlayer(0, 1);
                    break;
                }

                case "NE": {
                    player.movePlayer(1, -1);
                    break;
                }

                case "NW": {
                    player.movePlayer(-1, -1);
                    break;
                }

                case "SE": {
                    player.movePlayer(1, 1);
                    break;
                }

                case "SW": {
                    player.movePlayer(-1, 1);
                    break;
                }

                default: {
                }
            }
        }

        catch (Exception e) {
            Utilities.error(e);
        }
    }

    public Tile[][] getField() {
        return field;
    }

    public Tile makeStartTile() {
        start = field[0][0];
        start.setIsStart();
        return start;
    }

    public Tile MakeGoalTile() {
        goal = field[19][19];
        goal.setIsGoal();
        return goal;
    }

    private void placeMines() {
        Random rand = new Random();
        int amtMined = 0;
        Tile nearbyTile;

        while (amtMined < 400 * (percentMined / 100)) {
            int col = rand.nextInt(20);
            int row = rand.nextInt(20);
            Tile tile = field[col][row];
            if (!tile.getIsMine() && !tile.getIsGoal() && !tile.getIsStart()) {
                tile.setIsMine();
                for (int i = row - 1; i <= row + 1; i++) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        if (field[i][j] != null) {
                            nearbyTile = field[i][j];
                            nearbyTile.setNearbyMines();
                        } else {
                            continue;
                        }
                    }
                }
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
