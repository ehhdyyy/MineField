package minefield;

import java.util.Random;
import mvc.*;

public class Minefield extends Model {
    private static final int percentMined = 5;
    private final Tile[][] field;
    public Tile start;
    public Tile goal;
    public Tile tile;
    public Player player;
    public boolean gameOver;

    public Minefield() {
        field = new Tile[20][20];
        this.player = new Player(this, 0, 0);
        gameOver = false;
        initializeTiles();
        makeStartTile();
        makeGoalTile();
        placeMines();
    }

    public Tile[][] getField() {
        return field;
    }

    public Player getPlayer() {
        return player;
    }

    public void initializeTiles() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                field[i][j] = new Tile();
            }
        }
    }

    public void makeStartTile() {
        start = field[0][0];
        start.setIsStart();
        start.reveal();
    }

    public void makeGoalTile() {
        goal = field[19][19];
        goal.setIsGoal();
    }

    private void placeMines() {
        Random rand = new Random();
        int amtMined = 0;
        Tile nearbyTile;

        while (amtMined < 400 * ((double) percentMined / 100)) {
            int col = rand.nextInt(20);
            int row = rand.nextInt(20);
            Tile tile = field[row][col];

            if (!tile.getIsMine() && !tile.getIsGoal() && !tile.getIsStart()) {
                tile.setIsMine();
                for (int i = row - 1; i <= row + 1; i++) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        if (i < 0 || i > 19 || j < 0 || j > 19) {
                            continue;
                        }
                        if (i == row && j == col) {
                            continue;
                        }

                        nearbyTile = field[i][j];
                        nearbyTile.setNearbyMines();
                    }
                }
                amtMined++;
            }
        }
    }

    public void revealMines(){
        Tile tile;
        for(int i = 0 ; i < 20; i++){
            for(int j = 0; j < 20; j++){
                tile = field[i][j];
                if(tile.getIsMine()){
                    tile.reveal();
                }
            }
        }
    }

    public void movePlayer(int rowAmt, int colAmt) throws Exception {

        if(gameOver){
            throw new Exception("Game over!");
        }
        int newRow = player.getRow() + rowAmt;
        int newCol = player.getCol() + colAmt;

        if (newRow < 0 || newRow > 19 || newCol < 0 || newCol > 19) {
            throw new IllegalArgumentException("You have moved out of Bounds!");
        }

        Tile tile = field[newRow][newCol];

        if (tile.getIsMine()) {
            player.setRow(newRow);
            player.setCol(newCol);
            Utilities.inform("You stepped on a mine!");
            gameOver = true;
            revealMines();
            throw new Exception("Game over! You cannot move anymore!");
        }

        if (tile.getIsGoal()) {
            player.setRow(newRow);
            player.setCol(newCol);
            Utilities.inform("You reached the goal!");
            gameOver = true;
            revealMines();
            throw new Exception("Congrats");
        }

        player.setRow(newRow);
        player.setCol(newCol);
        tile.reveal();

    }
}
