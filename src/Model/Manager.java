package Model;

import Model.Articals.BarelyRead;
import Model.Articals.LiteReader;
import Model.Articals.Researcher;
import Model.ExamStatus.*;
import Model.Forum.ActivelyPost;
import Model.Forum.BarelyPost;
import Model.Quizes.AnswerQuiz;
import Model.Quizes.NotAnswer;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    BarelyRead bearlyReader;
    LiteReader liteRead;
    Researcher reasercher;
    ExcellentScore excellentScore;
    FailedExam failedExam;
    CannotExam cannotExam;
    CanExam canExam;
    PassScore passScore;
    BarelyPost barelyPostState;
    ActivelyPost activelyPostState;
    AnswerQuiz answerQuiz;
    NotAnswer notAnswer;
    State currStateRead;
    State currStateExam;
    State currStateFroum;
    State currStateQuiz;
    List<State> currStates;

    public Manager() {
        bearlyReader = new BarelyRead(this);
        liteRead = new LiteReader(this);
        reasercher = new Researcher(this);
        excellentScore = new ExcellentScore(this);
        failedExam = new FailedExam(this);
        cannotExam = new CannotExam(this);
        canExam = new CanExam(this);
        passScore = new PassScore(this);
        barelyPostState = new BarelyPost(this);
        activelyPostState = new ActivelyPost(this);
        answerQuiz = new AnswerQuiz(this);
        notAnswer = new NotAnswer(this);
        currStateRead = bearlyReader;
        currStateExam = cannotExam;
        currStateFroum = barelyPostState;
        currStateQuiz = notAnswer;
        currStates = new ArrayList<>();
        currStates.add(notAnswer);
        currStates.add(bearlyReader);
        currStates.add(barelyPostState);
        currStates.add(cannotExam);
    }

    public void excuteCommand(String command, String arg) {
        switch (command) {
            case "exam":
                int score = Integer.parseInt(arg);
                currStateRead.exam(score);
                currStateExam.exam(score);
                currStateFroum.exam(score);
                currStateQuiz.exam(score);
                break;
            case "read":
                currStateQuiz.read();
                currStateRead.read();
                currStateFroum.read();
                currStateExam.read();
                break;
            case "post":
                currStateQuiz.post(arg);
                currStateRead.post(arg);
                currStateFroum.post(arg);
                currStateExam.post(arg);
                break;
            case "answer":
                currStateQuiz.anwser();
                currStateRead.anwser();
                currStateFroum.anwser();
                currStateExam.anwser();
                break;
            case "next_week":
                currStateQuiz.next_week();
                currStateRead.next_week();
                currStateFroum.next_week();
                currStateExam.next_week();
                break;
            case "status":
                arg = currStateRead.status(arg);
                arg = currStateFroum.status(arg);
                arg = currStateQuiz.status(arg);
                arg = currStateExam.status(arg);
                System.out.println(arg);
                break;
            default:
                System.out.println("Illegal command");
        }
    }

    public void setLiteReader(int readed) {
        System.out.println("enter LiteReader state");
        liteRead.readed = readed;
        currStateRead = liteRead;
    }

    public void setReasercher(int readed) {
        System.out.println("enter Researcher state");
        reasercher.readed = readed;
        currStateRead = reasercher;
    }

    public void setFailedExam() {
        System.out.println("enter FailedExam state");
        currStateExam = failedExam;
    }

    public void setPassScore() {
        System.out.println("enter PassScore state");
        currStateExam = passScore;
    }

    public void setExcellentScore() {
        System.out.println("enter ExcellentScore state");
        currStateExam = excellentScore;
    }

    public void setAnswerQuiz(int quiz_num) {
        System.out.println("enter AnswerQuiz state");
        currStateQuiz = answerQuiz;
    }

    public void setNotAnswer() {
        System.out.println("enter NotAnswer state");
        currStateQuiz = notAnswer;
    }

    public void setCanExam() {
        System.out.println("enter CanExam state");
        currStateExam = canExam;
    }

    public void setActivelyPost(int post_count) {
        System.out.println("enter ActivelyPost state");
        activelyPostState.post_count = post_count;
        currStateQuiz = activelyPostState;
    }

    public void setBarelyPost(int post_count) {
        System.out.println("enter BarelyPost state");
        barelyPostState.post_count = post_count;
        currStateQuiz = barelyPostState;
    }
}
