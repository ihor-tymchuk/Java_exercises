package com.blinov.itymchuk.one;

/*
    Welcome user
    You have to input your name in command line.
*/

public class HelloFriend {
    public static void main(String[] args) {
        sayHi(args);
    }

    public static void sayHi(String[] name) {
        if (name.length != 0) System.out.println("Hello," + name[0]);
        else System.out.println("You didn't input your name :(");
    }
}
