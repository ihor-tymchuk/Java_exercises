package com.blinov.itymchuk.one;

/*
    test command line
 */

public class Echo {
    public static void main(String[] args) {
        int count = 0;
        for (String item : args){
            System.out.println("Arg: "+count+" "+ item);
            count++;
        }
    }
}
