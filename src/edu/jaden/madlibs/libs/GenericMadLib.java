package edu.jaden.madlibs.libs;

import edu.jaden.madlibs.Blank;
import edu.jaden.madlibs.InputType;
import edu.jaden.madlibs.MadLib;

/**
 * Created by Jaden-Laptop on 9/27/2016.
 */
public class GenericMadLib extends MadLib {

    public GenericMadLib() {
        super();

        this.blanks.add(new Blank(InputType.Adjective));
        this.blanks.add(new Blank(InputType.Noun));

        this.unformattedStory = "The %s %s went to the store";
    }

}
