package com.blinov.itymchuk.three;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private int id;
    private Person person = new Person();
    private Birthday birthday = new Birthday();
    private Contact contact = new Contact();
    private Study study = new Study();

    public Student() {
    }

    public Student(int id, Person person) {
        this.id = id;
        this.person = person;
    }

    public Student(int id, Person person, Birthday birthday, Contact contact, Study study) {
        this.id = id;
        this.person = person;
        this.birthday = birthday;
        this.contact = contact;
        this.study = study;
    }

    public static ArrayList<Student> createArrayStudents(Student... list) {
        return new ArrayList<>(Arrays.asList(list));
    }

    public static void addStudentForArrayStudents(ArrayList<Student> arrayList, Student... list) {
        arrayList.addAll(Arrays.asList(list));
    }

    public static void findForFacultative(ArrayList<Student> arrayList, String facultative) {
        System.out.println("----" + facultative + "----");
        for (Student item : arrayList) {
            if (item.getStudy().getFacultative().equals(facultative)) {
                System.out.println(item.getId() + " " +
                        item.getPerson().getSurname() + " " +
                        item.getPerson().getName() + " " +
                        item.getPerson().getMiddleName()
                );
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setPerson(String surname, String name, String middleName) {
        this.person.setSurname(surname);
        this.person.setName(name);
        this.person.setMiddleName(middleName);
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    public void setBirthday(int day, int month, int year) {
        this.birthday.setBirthday(day, month, year);
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setContact(String address, String phone) {
        this.contact.setAddress(address);
        this.contact.setPhone(phone);
    }

    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }

    public void setStudy(String facultative, int level, String group) {
        this.study.setFacultative(facultative);
        this.study.setLevel(level);
        this.study.setGroup(group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", " + person +
                ", birthday=" + birthday +
                ", " + contact +
                ", " + study +
                '}';
    }
}
