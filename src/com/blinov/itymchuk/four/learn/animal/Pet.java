package com.blinov.itymchuk.four.learn.animal;

public class Pet extends Animal{
    @Override
    public void introduce() {
        System.out.println("I'm Pet");
    }

    public void nickname(){
        System.out.println("My nickname is Bobick");
    }
}
