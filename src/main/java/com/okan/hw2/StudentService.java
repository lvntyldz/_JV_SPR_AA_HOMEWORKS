package com.okan.hw2;

/**
 * Created by levent on 5/10/15.
 */
public class StudentService {
    private Student listPointer;
    private Student lesson1Ptr;
    private Student lesson2Ptr;

    public static int hashCount = 10;
    public static Student[] hashList = new Student[hashCount];

    public StudentService() {
        listPointer = lesson1Ptr = lesson2Ptr = null;
    }

    public void insertList(Student student, boolean addLesson1, boolean addLesson2) {
        student.setList(listPointer);
        listPointer = student;

        hashList[student.getId() % hashCount] = student;


        if (addLesson1) {
            insertLess1List(student);
        }

        if (addLesson2) {
            insertLess2List(student);
        }
    }

    public void insertLess1List(Student student) {
        student.setLesson1(lesson1Ptr);
        lesson1Ptr = student;
    }

    public void insertLess2List(Student student) {
        student.setLesson2(lesson2Ptr);
        lesson2Ptr = student;
    }

    public Student get(int studentId) {
        return hashList[studentId % hashCount];
    }

    public void allList() {
        Student current = listPointer;
        while (current != null) {
            System.out.println(current);
            current = current.getList();
        }
    }

    public void Less1List() {
        Student current = lesson1Ptr;
        while (current != null) {
            System.out.println(current);
            current = current.getLesson1();
        }
    }

    public void srchLess1List(int studentId) {
        Student current = lesson1Ptr;
        while (current != null) {
            if (current.getId() == studentId)
                System.out.println(current);
            current = current.getLesson1();
        }
    }

    public void Less2List() {
        Student current = lesson2Ptr;
        while (current != null) {
            System.out.println(current);
            current = current.getLesson2();
        }
    }

    public void srchLess2List(int studentId) {
        Student current = lesson2Ptr;
        while (current != null) {
            if (current.getId() == studentId)
                System.out.println(current);
            current = current.getLesson1();
        }
    }

}

