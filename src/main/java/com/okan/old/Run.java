package com.okan.old;

import com.okan.hw1.Student;

import java.util.Random;

/**
 * Created by levent on 5/6/15.
 */
public class Run {

    public static final int limit = 100;
    public static Student[] students = new Student[limit];
    public static Lesson[] web = new Lesson[limit];
    public static Lesson[] alg = new Lesson[limit];
    public static int[] pointers = new int[limit];


    public static void setDefault() {
        for (int i = 1; i < pointers.length; i++) {
            pointers[i] = -1;
        }
    }


    public static void printListByIndex(int index) {

        index = pointers[index];

        System.out.println("--------------------------");

        System.out.println(" Student ID : " + students[index].getId());
        System.out.println(" Student Name : " + students[index].getName());

        System.out.println("");

        System.out.println(" Lesson Name : " + web[index].getName());
        System.out.println(" Midterm 1: " + web[index].getMidterm1());
        System.out.println(" Midterm2 : " + web[index].getMidterm2());
        System.out.println(" Final Exam: " + web[index].getFinalExam());
        System.out.println(" Score : " + web[index].getScore());

        System.out.println("");

        System.out.println(" Lesson Name : " + alg[index].getName());
        System.out.println(" Midterm 1: " + alg[index].getMidterm1());
        System.out.println(" Midterm2 : " + alg[index].getMidterm2());
        System.out.println(" Final Exam: " + alg[index].getFinalExam());
        System.out.println(" Score : " + alg[index].getScore());
    }

    public static void printAllList() {
        int index = 1;
        while (index != -1 && pointers[index] != -1) {

            index = pointers[index];

            System.out.println("--------------------------");

            System.out.println(" Student ID : " + students[index].getId());
            System.out.println(" Student Name : " + students[index].getName());

            System.out.println("");

            System.out.println(" Lesson Name : " + web[index].getName());
            System.out.println(" Midterm 1: " + web[index].getMidterm1());
            System.out.println(" Midterm2 : " + web[index].getMidterm2());
            System.out.println(" Final Exam: " + web[index].getFinalExam());
            System.out.println(" Score : " + web[index].getScore());

            System.out.println("");

            System.out.println(" Lesson Name : " + alg[index].getName());
            System.out.println(" Midterm 1: " + alg[index].getMidterm1());
            System.out.println(" Midterm2 : " + alg[index].getMidterm2());
            System.out.println(" Final Exam: " + alg[index].getFinalExam());
            System.out.println(" Score : " + alg[index].getScore());

            index++;

        }
    }


    //Inserts a new Link at the first of the list
    public static int addList(int index, Student student, Lesson lesson1, Lesson lesson2) {

        for (int i = 0; i < pointers.length; i++) {

            if (pointers[i] == -1) {
                pointers[i] = index;
                students[i] = student;
                web[i] = lesson1;
                alg[i] = lesson2;
                return i;
            }

        }

        return index;
    }


    public static void fillRandom() {

        for (int i = 1; i < 10; i++) {
            Random rand = new Random();


            Student student1 = new Student();
            student1.setName("Student" + i);
            student1.setId(rand.nextInt(100) + 1);


            Lesson web1 = new Lesson();
            web1.setMidterm1((rand.nextInt(100) + 1));
            web1.setMidterm2((rand.nextInt(100) + 1));
            web1.setFinalExam((rand.nextInt(100) + 1));
            web1.setName("Web Programlama");

            Lesson alg1 = new Lesson();
            alg1.setMidterm1((rand.nextInt(100) + 1));
            alg1.setMidterm2((rand.nextInt(100) + 1));
            alg1.setFinalExam((rand.nextInt(100) + 1));
            alg1.setName("Algoritma");

            addList(i, student1, web1, alg1);


        }


    }

    public static void main(String[] args) {

        setDefault(); // initialize

        fillRandom();//add random data to list

        //list by index
        printListByIndex(1);
        printListByIndex(2);

        //all list
        printAllList();

    }


}