package com.okan.old;

/**
 * Created by levent on 5/6/15.
 */
public class Lesson {

    private String name;
    private int midterm1;
    private int midterm2;
    private int finalExam;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMidterm1() {
        return midterm1;
    }

    public void setMidterm1(int midterm1) {
        this.midterm1 = midterm1;
    }

    public int getMidterm2() {
        return midterm2;
    }

    public void setMidterm2(int midterm2) {
        this.midterm2 = midterm2;
    }

    public int getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(int finalExam) {
        this.finalExam = finalExam;
    }

    public int getScore() {

        float result = 0;

        result = (float) this.midterm1 * 25 / 100 +
                (float) this.midterm2 * 25 / 100 +
                (float) this.finalExam * 50 / 100;


        return (int) result;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
