package com.blinov.itymchuk.three;

import java.math.BigInteger;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(1);
        s1.setPerson("Ivanova", "Yana", "Petrovna");
        s1.setBirthday(1, 7, 2006);
        s1.setContact("Chernovtsy", "+380957624478");
        s1.setStudy("mathematics", 2, "305");
        System.out.println(s1);

        Student s2 = new Student();
        s2.setId(2);
        s2.setPerson("Corn", "Marvin", "Eliot");
        s2.setBirthday(31, 8, 2006);
        s2.setContact("London", "+380984520788");
        s2.setStudy("mathematics", 3, "305");
        System.out.println(s2);

        Student s3 = new Student();
        s3.setId(3);
        s3.setPerson("Andrienko", "Tania", "Valerivna");
        s3.setBirthday(2, 6, 2006);
        s3.setContact("Kyiv", "+380988888888");
        s3.setStudy("languages", 1, "105");
        System.out.println(s3);

        Student s4 = new Student();
        s4.setId(4);
        s4.setPerson("Pavlov", "Irina", "Vasylivna");
        s4.setBirthday(28, 2, 2005);
        s4.setContact("Lviv", "+380989999999");
        s4.setStudy("languages", 1, "105");
        System.out.println(s4);

        Student s5 = new Student();
        s5.setId(5);
        s5.setPerson("Bohdanenko", "Ivan", "Ivanovych");
        s5.setBirthday(28, 12, 2005);
        s5.setContact("Odesa", "+380981111111");
        s5.setStudy("languages", 2, "205");
        System.out.println(s5);

        ArrayList<Student> students = Student.createArrayStudents(s1, s2, s3, s4, s5);
        System.out.println(students);
        Student.findForFacultative(students, "languages");
        Student.findForFacultative(students, "mathematics");
    }
}
