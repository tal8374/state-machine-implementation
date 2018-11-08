package Model.ExamStatus;

import Model.Manager;
import Model.State;

public class CanExam extends State
{
    public CanExam(Manager manager) {
        super(manager);
    }

    @Override
    public void exam(int score) {
        if (score < 56) manager.setFailedExam();
        else if (score < 90) manager.setPassScore();
        else manager.setExcellentScore();
    }
}
