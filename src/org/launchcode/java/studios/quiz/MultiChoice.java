package org.launchcode.java.studios.quiz;

import java.util.ArrayList;

/**
 * Created by KyleLaptop on 3/20/2017.
 */
public class MultiChoice extends Checkbox {
    //checkbox that uses radio buttons - only one can be chosen
    //fields

    //constructors
    public MultiChoice (String name, String pregunta, int points, String answer, int boxes) {
        super(name, pregunta, points, answer, boxes);
    }
   public MultiChoice (String name, String pregunta, int points, int boxes) {
        super(name, pregunta, points, boxes);
   }
    //getters and setters

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }



    //methods
    public void askQuestion() {
        //display question
        //for each entry in possibleAnswers, create and display a radiobutton next to the answer
        //wait
        //return user's selection - String?
    }

}
