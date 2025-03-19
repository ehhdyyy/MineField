package minefield;

import mvc.*;

public class MoveCommand extends Command {
    private Heading heading;
    private Model model;

    public MoveCommand(Model model, Heading heading) {
        super(model);
        this.heading = heading;
    }

    public void execute() {
        Minefield minefield = (Minefield) model;
        minefield.move(heading);
    }

}
