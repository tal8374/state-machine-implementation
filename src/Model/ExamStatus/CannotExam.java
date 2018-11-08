package Model.ExamStatus;

import Model.Manager;
import Model.State;

public class CannotExam extends State {
    public CannotExam(Manager manager) {
        super(manager);
    }

    @Override
    public void read() {
        manager.setCanExam();
    }
}
