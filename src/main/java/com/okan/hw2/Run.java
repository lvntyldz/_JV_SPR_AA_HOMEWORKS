package com.okan.hw2;

import java.util.Random;

/**
 * Created by levent on 5/10/15.
 */
public class Run {
    public static StudentService list = new StudentService();

    public static void main(String args[]) {
        crateRandStudent(2);


        int studentId = 33;
        Student student;


        //list of All
        System.out.println("-------------- All Students");
        list.allList();


        //Add new Student
        System.out.println("\n-------------- add student/start");
        student = new Student();
        student.setId(studentId);
        student.setFirstName(":::lvt");
        student.setLastName(":::YLDZ");
        list.insertList(student, false, false);
        System.out.println("-------------- add student/end");


        //list of All2
        System.out.println("\n-------------- All Students2");
        list.allList();


        //Show Lessons
        System.out.println("\n-------------- Show Lessons");
        list.srchLess1List(studentId);
        list.srchLess2List(studentId);


        //Show Lesson's students
        System.out.println("\n-------------- Show Lessons's Stundents");
        list.Less1List();
        list.Less2List();


        //add student to lesson
        System.out.println("\n-------------- Add Student To Lesson");
        student = list.get(studentId);
        if (student != null) {//if sys has student // add to lessons
            list.insertLess1List(student);
        }


        //add student to lesson
        System.out.println("\n-------------- Add Student To Lesson");
        student = list.get(studentId);//get student from list by ID
        if (student != null) {//if sys has student // add to lessons
            list.insertLess2List(student);
        }


        //Show Lesson's students
        System.out.println("\n-------------- Show Lessons's Stundents2");
        list.Less1List();
        list.Less2List();


        //list of All
        System.out.println("-------------- All Students");
        list.allList();


    }


    public static void crateRandStudent(int count) {
        Random r = new Random();
        for (int i = 0; i < count; i++) {
            Student student = new Student();
            student.randomMath();
            student.setId(i + 1);
            list.insertList(student, r.nextBoolean(), r.nextBoolean());
        }
    }
}