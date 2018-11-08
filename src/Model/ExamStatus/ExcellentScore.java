package Model.ExamStatus;

import Model.Manager;
import Model.State;

public class ExcellentScore extends State
{
    public ExcellentScore(Manager manager) {
        super(manager);
    }

    @Override
    public String status(String text) {
        return "^^^" + text + "^^^";
    }
}
