package edu.jaden.madlibs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jaden-Laptop on 9/27/2016.
 */
public class MadLib {

    protected List<Blank> blanks;
    protected String unformattedStory;

    public MadLib() {
        this.blanks = new ArrayList<Blank>();
    }

    public void queryUserToFillBlanks() {
        for (Blank i : blanks) {
            System.out.print(i.type.name() + ": ");
            i.fill(MadLibs.instance.getInput());
        }
    }

    public void outputFinalStory() {
        String[] answers = new String[blanks.size()];
        for (int i = 0; i < blanks.size(); i++) {
            answers[i] = blanks.get(i).answer;
        }
        System.out.printf(unformattedStory+"\n", answers);
    }

    public void addNewBlank(InputType inputType) {
        this.blanks.add(new Blank(inputType));
    }

    public void setUnformattedStory(String ufStory) {
        this.unformattedStory = ufStory;
    }
}
