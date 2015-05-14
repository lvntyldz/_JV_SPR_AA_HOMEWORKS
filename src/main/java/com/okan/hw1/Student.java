package com.okan.hw1;

/**
 * Created by levent on 5/10/15.
 */
public class Student {
    public int id; //   ogrenci no
    public int midterm1; // vize 1
    public int midterm2; // vize 2
    public int exam; // final

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getExam() {
        return exam;
    }

    public void setExam(int exam) {
        this.exam = exam;
    }

    @Override
    public String toString() {
        return "\nÖğrenci No :" + getId() +
                "\nVize1 :" + getMidterm1() +
                "\nVize2 :" + getMidterm2() +
                "\nFinal :" + getExam() +
                "\nOrtalama :" + getScore();
    }

    public float getScore() {
        float result;

        result = (float) getMidterm1() * 25 / 100 +
                (float) getMidterm2() * 25 / 100 +
                (float) getExam() * 50 / 100;

        return result;
    }


}