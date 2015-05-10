package com.okan.hw2;

import java.util.Random;

/**
 * Created by levent on 5/10/15.
 */
public class Student {
    private int id; //   ogrenci no
    private String firstName; // ogrenci adi
    private String lastName; // ogrenci soyadı
    private Student list; // Öğrenci Pointer
    private Student lesson1; // DERS1 pointer
    private Student lesson2; // DERS2 pointer


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Student getList() {
        return list;
    }

    public void setList(Student list) {
        this.list = list;
    }

    public Student getLesson1() {
        return lesson1;
    }

    public void setLesson1(Student lesson1) {
        this.lesson1 = lesson1;
    }

    public Student getLesson2() {
        return lesson2;
    }

    public void setLesson2(Student lesson2) {
        this.lesson2 = lesson2;
    }


    //******************************************

    @Override
    public String toString() {
        return "\nÖğrenci No : " + getId() +
                "\n Ad : " + getFirstName() +
                "\n Soyad : " + getLastName();
    }


    public void randomMath() {
        this.id = (int) (Math.random() * 10 + 1);
        this.firstName = this.randomStr(1);
        this.lastName = this.randomStr(2);
    }


    private String randomStr(int type) {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }

        String str = sb.toString();

        if (type == 1) {//student First Name
            str = "Name_" + str;
        } else if (type == 2) {//Student LastName
            str = "LastName_" + str;
        }

        return str;
    }
}