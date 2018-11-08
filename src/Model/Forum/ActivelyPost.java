package Model.Forum;

import Model.Manager;
import Model.State;

public class ActivelyPost extends State {
    public int post_count;

    public ActivelyPost(Manager manager) {
        super(manager);
        post_count = 2;
    }

    @Override
    public void post(String text) {
        post_count++;
    }

    @Override
    public void next_week() {
        post_count = 0;
        manager.setBarelyPost(post_count);
    }

    @Override
    public String status(String text) {
        return text + "(active)";
    }
}
