package mvc;

public interface AppFactory {

    public String getTitle();

    public String[] getHelp();

    public String about();

    public Model makeModel();

    public View makeView(Model m);

    public String[] getEditCommands();
}
