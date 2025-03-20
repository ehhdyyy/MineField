package minefield;

import mvc.*;

public class MinefieldFactory implements AppFactory {

    @Override
    public String getTitle() {
        return "Mine Field";
    }

    @Override
    public String[] getHelp() {
        return new String[] {
                "Click a button to move that direction",
        };
    }

    @Override
    public String about() {
        return "Mine Field by Team 8 CS151 Section 3";
    }

    @Override
    public Model makeModel() {
        return new Minefield();
    }

    @Override
    public View makeView(Model m) {
        return new MinefieldView((Minefield) m);
    }

    @Override
    public String[] getEditCommands() {
        return new String[] {
                "NW",
                "N",
                "NE",
                "W",
                "E",
                "SW",
                "S",
                "SE",
        };
    }

    public Command makeEditCommand(Model model, String type, Object source) {
        DIRECTION direction = null;
        switch(type){
            case "NW":
                direction = DIRECTION.NW;
                break;
            case "N":
                direction = DIRECTION.N;
                break;
            case "NE":
                direction = DIRECTION.NE;
                break;
            case "W":
                direction = DIRECTION.W;
                break;
            case "E":
                direction = DIRECTION.E;
                break;
            case "SW":
                direction = DIRECTION.NE;
                break;
            case "S":
                direction = DIRECTION.S;
                break;
            case "SE":
                direction = DIRECTION.SE;
                break;
            
        }
        if(direction != null){
            return new Commands(model,direction);
        }
        return null;
    }

}
