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

}
