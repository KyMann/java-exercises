package org.launchcode.java.studios.quiz;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by KyleLaptop on 3/20/2017.
 */
public class Checkbox extends Question {
    //question that provides answers and allows you to check the correct ones
    //fields
    private String answer;
    private int boxCount;
    protected ArrayList<String> possibleAnswers = new ArrayList<>();
    protected ArrayList<String> correctAnswers = new ArrayList<>();


    //constructors
    public Checkbox (String name, String pregunta, int points, String answer, int boxes) {
        super(name, pregunta, points);
        this.answer = answer;
        this.boxCount = boxes;
    }

    public Checkbox (String name, String pregunta, int points, int boxes) {
        super(name, pregunta, points);
        this.boxCount = boxes;
    }
    //getters and setters

    //methods
    public void addPossibleAnswers(String badanswer) {
        this.possibleAnswers.add(badanswer);
    }

    public void addCorrectAnswers(String correctanswer) {
        this.possibleAnswers.add(correctanswer);
        this.correctAnswers.add(correctanswer);
    }

    public void askQuestion() {
        System.out.println(getQuestionText());
        for (String prompt : possibleAnswers) {
            JCheckBox button = new JCheckBox(prompt);
        }
        //wait
        //return user's selection - String? Arraylist<String>?
        ArrayList<String> givenAnswers = new ArrayList<>();
    }
    public void grade() {

    }
}
