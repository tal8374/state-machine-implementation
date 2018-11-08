package Model.Quizes;

import Model.Manager;
import Model.State;

public class AnswerQuiz extends State
{
    public AnswerQuiz(Manager manager) {
        super(manager);
    }

    public void answerQuiz(int quiz_num){
        manager.setNotAnswer();
    }

}
