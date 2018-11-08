package Model.Articals;

import Model.Manager;
import Model.State;

public class BarelyRead extends State {
    public int readed;

    public BarelyRead(Manager manager) {
        super(manager);
        readed = 0;
    }

    @Override
    public void read() {
        readed++;
        if (readed == 3)
            manager.setLiteReader(readed);
    }
}
