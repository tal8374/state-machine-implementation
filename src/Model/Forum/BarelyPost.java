package Model.Forum;

import Model.Manager;
import Model.State;

public class BarelyPost extends State {
    public int post_count;

    public BarelyPost(Manager manager) {
        super(manager);
        post_count = 0;
    }

    @Override
    public void next_week() {
        post_count = 0;
    }

    @Override
    public void post(String text) {
        post_count++;
        if (post_count > 1)
            manager.setActivelyPost(post_count);
    }
}
