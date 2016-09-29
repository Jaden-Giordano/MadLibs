package edu.jaden.madlibs;

/**
 * Created by Jaden-Laptop on 9/27/2016.
 */
public class Blank {

    public InputType type;
    public String answer;

    public Blank(InputType type) {
        this.type = type;
    }

    public boolean isFilled() {
        return answer != null;
    }

    public void fill(String answer) {
        this.answer = answer;
    }

}
