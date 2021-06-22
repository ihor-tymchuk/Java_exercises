package com.blinov.itymchuk.four.learn.entity;

public class Run {
    public static void main(String[] args) {
        Student st = new Student(98, "Ihor", 29);
        Student st2 = new Student(97, "Ihor", 25);
        System.out.println(st);
        System.out.println(st.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st.equals(st2));
        System.out.println(st.equals(st));
        System.out.println(st.equals(null));
    }
}
