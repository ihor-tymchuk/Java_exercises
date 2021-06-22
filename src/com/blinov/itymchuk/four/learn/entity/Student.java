package com.blinov.itymchuk.four.learn.entity;

import java.util.Objects;

public class Student implements Cloneable {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return (int) (31 * id + age + ((name == null) ? 0 : name.hashCode()));
    }

    @Override
    public String toString() {
        return getClass().getName() + "@name" + name + " id:" + id + " age:" + age;
    }
}
