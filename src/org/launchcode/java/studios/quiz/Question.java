package org.launchcode.java.studios.quiz;

/**
 * Created by KyleLaptop on 3/20/2017.
 */
public abstract class Question {
    //fields--------------------------------
    private final String name;
    private String questionText;
    private int points;
    private Boolean graded = Boolean.FALSE;

    //constructors-------------------------------------------
    public Question (String name, String pregunta, int points) {
        this.name = name;
        this.questionText = pregunta;
        this.points = points;
    }

    //getters and setters----------------------------
    public String getName() {
        return name;
    }
    public String getQuestionText() {
        return questionText;
    }
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }

    public Boolean getGraded() {
        return graded;
    }

    //methods
    public void Graded(Boolean graded) {
        this.graded = Boolean.TRUE;
    }

}
