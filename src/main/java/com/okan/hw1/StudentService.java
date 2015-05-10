package com.okan.hw1;

/**
 * Created by levent on 5/10/15.
 */
public class StudentService {

    public void random(Student student) {
        student.setId((int) (Math.random() * 100 + 1));
        student.setMidterm1((int) (Math.random() * 100 + 1));
        student.setMidterm2((int) (Math.random() * 100 + 1));
        student.setExam((int) (Math.random() * 100 + 1));
    }
}
