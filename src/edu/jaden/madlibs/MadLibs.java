package edu.jaden.madlibs;

import edu.jaden.madlibs.libs.GenericMadLib;
import edu.jaden.madlibs.libs.MadLibFromFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Jaden-Laptop on 9/27/2016.
 */
public class MadLibs {

    public static MadLibs instance;

    public boolean running = true;

    private BufferedReader br;

    public MadLibs() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void run() {
        while (running) {
            processSelection(queryUserFromSelectionMenu());
        }
    }

    public String getInput() {
        String out = "";
        try {
            out = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return out;
    }

    public void processSelection(int s) {
        MadLib m;
        switch (s) {
            case 1:
                m = new GenericMadLib();
                break;
            case 2:
                System.out.print("Path to MadLib: ");
                String path = getInput();
                m = new MadLibFromFile(path);
                break;
            case 3:
                System.out.println("Thank you for participating in MadLibs! Bye!");
                running = false;
                return;
            default:
                System.out.println("Invalid selection.");
                return;
        }
        if (m != null) {
            System.out.println("Please fill out the following:");
            m.queryUserToFillBlanks();
            System.out.println("Here is your story...\n");
            m.outputFinalStory();
        }
    }

    public int queryUserFromSelectionMenu() {
        System.out.println("-----------------------------------");
        System.out.println("Welcome to MadLibs, have fun!");
        System.out.println("Make a selection from the following:");
        System.out.println("1-The Short Sentence");
        System.out.println("2-Select MadLib from file");
        System.out.println("3-Quit");
        System.out.print("Select (1-3): ");
        int in = -1;
        try {
            in = Integer.parseInt(getInput());
        } catch (NumberFormatException e) {}
        return in;
    }

    public static void main(String[] args) {
        instance = new MadLibs();
        instance.run();
    }

}
