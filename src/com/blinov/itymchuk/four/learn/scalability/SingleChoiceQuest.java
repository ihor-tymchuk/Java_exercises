package com.blinov.itymchuk.four.learn.scalability;

public class SingleChoiceQuest extends AbstractQuest {
    //fields, constructors and method
    @Override
    public boolean check(Answer ans) {
        System.out.println("Single choice quest");
        return true;
    }
}
