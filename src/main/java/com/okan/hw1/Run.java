package com.okan.hw1;

/**
 * Created by levent on 5/10/15.
 */
public class Run {

    public static int limit = 100;
    public static Student students[] = new Student[limit];
    public static int pointers[] = new int[limit];
    public static int web = -1;
    public static int algorithm = -1;

    public static StudentService service = new StudentService();

    public static void main(String args[]) {
        runOnStartUp();

        //Create
        Student student1, student2;

        //fill student1
        student1 = new Student();
        student1.setId(123);
        student1.setMidterm1(33);
        student1.setMidterm2(44);
        student1.setExam(88);

        //fill student2
        student2 = new Student();
        student2.setId(987);
        student2.setMidterm1(77);
        student2.setMidterm2(66);
        student2.setExam(55);


        web = addStudent(web, student1);
        web = addStudent(web, student2);

        algorithm = addStudent(algorithm, student1);
        algorithm = addStudent(algorithm, student2);

        //List
        printLesson(web);
        System.out.println("**************************");
        printLesson(algorithm);


    }


    public static void printLesson(int lesson) {
        while (lesson != -1) {
            System.out.println(students[lesson]);
            lesson = pointers[lesson];
        }
    }


    public static int addStudent(int lesson, Student student) {
        for (int i = 0; i < pointers.length; i++) {
            if (pointers[i] == -2) {
                pointers[i] = lesson;
                students[i] = student;
                return i;
            }
        }
        return lesson;
    }

    public static int addRandom(int lesson, Student student) {
        int random;
        for (int i = 0; i < pointers.length; i++) {
            random = (int) (Math.random() * 100);
            if (pointers[random] == -2) {
                pointers[random] = lesson;
                students[random] = student;
                return random;
            }

        }
        return lesson;
    }

    private static void runOnStartUp() {
        pointers[0] = -1;

        for (int i = 1; i < pointers.length; i++) {
            pointers[i] = -2; //set -2 like null
        }

        for (int i = 0; i < 1; i++) {
            Student student = new Student();
            service.random(student);
            web = addRandom(web, student);
        }

        for (int i = 0; i < 1; i++) {
            Student student = new Student();
            service.random(student);
            algorithm = addRandom(algorithm, student);
        }

        students[web].id = students[algorithm].id;
    }

}