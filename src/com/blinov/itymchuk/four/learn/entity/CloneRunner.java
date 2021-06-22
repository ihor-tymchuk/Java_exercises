package com.blinov.itymchuk.four.learn.entity;

public class CloneRunner {
    private static void multation(Student p){
        try {
            p = (Student)p.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        p.setId(1000);
        System.out.println("->id = " + p.getId());
    }

    public static void main(String[] args) {
        Student ob = new Student(71, "petro", 23);
        System.out.println("id = " + ob.getId());
        multation(ob);
        System.out.println("id = " + ob.getId());
    }
}
