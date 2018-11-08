package Model;

public abstract class State {
    protected Manager manager;

    public State(Manager manager) {
        this.manager = manager;
    }

    public void exam(int score){}

    public void read(){}

    public void post(String text){}

    public void anwser(){}

    public void next_week(){}

    public String status(String text){
        return text;
    }
}
