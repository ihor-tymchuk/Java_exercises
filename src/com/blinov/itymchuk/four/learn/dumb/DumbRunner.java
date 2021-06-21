package com.blinov.itymchuk.four.learn.dumb;

public class DumbRunner {
    public static void main(String[] args) {
        Dumb objA = new Dumber();
        int y = objA.id; // 0
        int x = ((Dumber) objA).id; // 9
        System.out.println(x + " " + y);
    }
}
