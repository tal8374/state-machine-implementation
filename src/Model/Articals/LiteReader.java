package Model.Articals;

import Model.Manager;
import Model.State;

public class LiteReader extends State {
    public int readed;

    public LiteReader(Manager manager) {
        super(manager);
        readed = 3;
    }

    @Override
    public void read() {
        readed++;
        if(readed == 8)
            manager.setReasercher(readed);
    }

    @Override
    public String status(String text) {
        return "*"+ text+"*";
    }
}
