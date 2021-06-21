package com.blinov.itymchuk.four.learn.dumb;

public class Dumb extends Object {
    {this.id = 6;}
    int id;
    public Dumb(){
        System.out.println("Constructor class Dumb");
        id = this.getId(); // It is bad:(
        System.out.println(" id=" + id);
    }
    public int getId(){
        System.out.println("getId() class Dumb");
        return id;
    }
}
