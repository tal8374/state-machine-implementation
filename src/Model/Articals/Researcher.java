package Model.Articals;

import Model.Manager;
import Model.State;

public class Researcher extends State {
    public int readed;

    public Researcher(Manager manager) {
        super(manager);
        readed = 8;
    }

    @Override
    public void read() {
        if (readed < 10)
            readed++;
    }

    @Override
    public String status(String text) {
        return "**" + text + "**";
    }
}
