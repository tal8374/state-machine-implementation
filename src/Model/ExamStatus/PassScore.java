package Model.ExamStatus;

import Model.Manager;
import Model.State;

public class PassScore extends State
{
    public PassScore(Manager manager) {
        super(manager);
    }

    @Override
    public String status(String text) {
        return text + " :)";
    }
}
