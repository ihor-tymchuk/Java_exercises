package com.blinov.itymchuk.four.learn.point;

public class Point1D {
    public int x;
    public Point1D (int x){
        this.x = x;
    }

    public double length(){
        return x;
    }

    @Override
    public String toString() {
        return "x = "+ x;
    }
}
