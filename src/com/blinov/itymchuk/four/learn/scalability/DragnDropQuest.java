package com.blinov.itymchuk.four.learn.scalability;

public class DragnDropQuest extends AbstractQuest {
    //fields, constructors and method
    @Override
    public boolean check(Answer ans){
        System.out.println("Drag'n'Drop quest");
        return true;
    }
}
