package org.launchcode.java.studios.quiz;

/**
 * Created by KyleLaptop on 3/20/2017.
 */
public class TrueFalse extends MultiChoice {
    //question that presents 2 options, and you check one, uses radio buttons
    //fields


    //constructors
    public TrueFalse (String name, String pregunta, int points, String answer) {
        super(name, pregunta, points, 2);
        addPossibleAnswers("True");
        addPossibleAnswers("False");
        if (answer.equalsIgnoreCase("true")){
            this.correctAnswers.add("True");
        }
        else if (answer.equalsIgnoreCase("false")) {
            this.correctAnswers.add("False");
        }
        else {
            addCorrectAnswers("Paradox");
        }//!what should the else case be?
    }



}
