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
        initializeTiles();
        makeStartTile();
        makeGoalTile();
        placeMines();
    }

    public List<Tile> getPath() {
        return path;
    }

    public Tile[][] getField(){
        return field;
    }

    public Tile getCurrPos() {
        return path.get(path.size() - 1);
    }

    public void initializeTiles(){
        for(int i =0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                field[i][j] = new Tile();
            }
        }
    }

    public void makeStartTile(){
        start = field[0][0];
        start.setIsStart();
    }

    public void makeGoalTile(){
        goal = field[19][19];
        goal.setIsGoal();
    }

    private void placeMines() {
        Random rand = new Random();
        int amtMined = 0;
        Tile nearbyTile;
        
        while(amtMined < 400 * ((double)percentMined/100)){
            int col = rand.nextInt(20);
            int row = rand.nextInt(20);
            Tile tile = field[row][col];

            if(!tile.getIsMine() && !tile.getIsGoal() && !tile.getIsStart()){
                tile.setIsMine();
                System.out.println("-------------- \nMine " + amtMined + " on tile: " + row + " " + col);
                for (int i = row - 1; i <= row + 1; i++) {
                    for(int j = col - 1; j <= col + 1; j++){
                        if(i < 0 || i > 19 || j < 0 || j > 19){
                            continue;
                        }
                        if(i == row && j == col){
                            continue;
                        }
                        
                        nearbyTile = field[i][j];
                        nearbyTile.setNearbyMines();
                        System.out.println("Tile near mine: " + i + " " + j);
                        System.out.println("Nearby Tile Mine Count: " + nearbyTile.getNearbyMines());
                    }
                }
                amtMined++;
            }
        }
    }

    

}
