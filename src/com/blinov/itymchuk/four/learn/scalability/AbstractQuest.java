package com.blinov.itymchuk.four.learn.scalability;

public abstract class AbstractQuest {
    private long id;
    private String questContent;
    // constructors and method
    public abstract boolean check(Answer ans);
}
