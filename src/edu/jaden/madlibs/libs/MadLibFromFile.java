package edu.jaden.madlibs.libs;

import edu.jaden.madlibs.InputType;
import edu.jaden.madlibs.MadLib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Jaden-Laptop on 9/27/2016.
 */
public class MadLibFromFile extends MadLib {

    public MadLibFromFile(String pathToFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String currentLine;

            boolean readingBlanks = true;
            this.unformattedStory = "";

            while ((currentLine = br.readLine()) != null) {
                if (currentLine.charAt(0) == '#') continue;

                if (currentLine.equalsIgnoreCase("**STORY**")) {
                    readingBlanks = false;
                    continue;
                }

                if (readingBlanks) {
                    switch (currentLine) {
                        case "Adjective":
                            this.addNewBlank(InputType.Adjective);
                            break;
                        case "Noun":
                            this.addNewBlank(InputType.Noun);
                            break;
                        case "Number":
                            this.addNewBlank(InputType.Number);
                            break;
                        case "Place":
                            this.addNewBlank(InputType.Place);
                            break;
                        case "PluralNoun":
                            this.addNewBlank(InputType.PluralNoun);
                            break;
                        case "Verb":
                            this.addNewBlank(InputType.Verb);
                            break;
                        case "Adverb":
                            this.addNewBlank(InputType.Adverb);
                            break;
                        case "VerbEndingInED":
                            this.addNewBlank(InputType.VerbEndingInED);
                            break;
                        case "VerbEndingInING":
                            this.addNewBlank(InputType.VerbEndingInING);
                            break;
                        case "BodyPart":
                            this.addNewBlank(InputType.BodyPart);
                            break;
                        case "PersonInRoom":
                            this.addNewBlank(InputType.PersonInRoom);
                            break;
                        case "Relative":
                            this.addNewBlank(InputType.Relative);
                            break;
                        default:
                            System.err.println("Error parsing MadLib file: Invalid inputType '"+currentLine+"'");
                    }
                }
                else {
                    unformattedStory += currentLine + "\n";
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
