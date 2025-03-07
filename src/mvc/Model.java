package mvc;

import java.io.Serializable;

public abstract class Model extends Publisher implements Serializable {

    protected abstract boolean getUnsavedChanges();

    protected abstract String getFileName();

    protected abstract void setFileName(String fName);

    protected abstract void setUnsavedChanges(boolean b);

    protected abstract void unsubscribe(AppPanel appPanel);

    protected abstract void subscribe(AppPanel appPanel);

    protected abstract void changed();

}
