package minefield;

import mvc.*;

public class Commands extends Command {

    private DIRECTION direction;
    private Minefield minefield;
    private Player player;

    public Commands(Minefield minefield, DIRECTION direction) {
        this.minefield = minefield;
        this.direction = direction;
        this.player = minefield.getPlayer();
    }

    @Override
    protected void execute() {
        switch (direction) {
            case NW:
                System.out.println("Going northwest");
                player.movePlayer(-1, -1);

                System.out.println("Player pos: " + player.getRow() + "  " + player.getCol());
                break;
            case N:
                System.out.println("Going north");
                player.movePlayer(0, -1);
                System.out.println("Player pos: " + player.getRow() + "  " + player.getCol());
                break;
            case NE:
                System.out.println("Going northeast");
                player.movePlayer(1, -1);
                System.out.println("Player pos: " + player.getRow() + "  " + player.getCol());
                break;
            case W:
                System.out.println("Going west");
                player.movePlayer(-1, 0);
                System.out.println("Player pos: " + player.getRow() + "  " + player.getCol());
                break;
            case E:
                System.out.println("Going east");
                player.movePlayer(1, 0);
                System.out.println("Player pos: " + player.getRow() + "  " + player.getCol());
                break;
            case SW:
                System.out.println("Going southwest");
                player.movePlayer(-1, 1);
                System.out.println("Player pos: " + player.getRow() + "  " + player.getCol());
                break;
            case S:
                System.out.println("Going south");
                player.movePlayer(0, 1);
                System.out.println("Player pos: " + player.getRow() + "  " + player.getCol());
                break;
            case SE:
                System.out.println("Going southeast");
                player.movePlayer(1, 1);
                System.out.println("Player pos: " + player.getRow() + "  " + player.getCol());
                break;

            default:
                break;
        }
    }

}
