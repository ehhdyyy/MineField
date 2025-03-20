package minefield;

import mvc.*;

public class Commands extends Command {

    private DIRECTION direction;

    public Commands(Model model, DIRECTION direction) {
        super(model);
        this.direction = direction;    
    }

    @Override
    public void execute() throws Exception{
        Minefield minefield = (Minefield) model;

        switch (direction) {
            case NW:
                minefield.movePlayer(-1, -1);
                break;
            case N:
                minefield.movePlayer(0, -1);
                break;
            case NE:
                minefield.movePlayer(1, -1);
                break;
            case W:
                minefield.movePlayer(-1, 0);
                break;
            case E:
                minefield.movePlayer(1, 0);
                break;
            case SW:
                minefield.movePlayer(-1, 1);
                break;
            case S:
                minefield.movePlayer(0, 1);
                break;
            case SE:
                minefield.movePlayer(1, 1);
                break;

            default:
                throw new Exception("Invalid direction");
                
        }
    }

}
