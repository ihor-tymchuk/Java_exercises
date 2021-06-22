package com.blinov.itymchuk.four.learn.gc;

public class Manager {
    private int id;

    public Manager(int value) {
        id = value;
    }

    protected void finalize() throws Throwable {
        try {
            System.out.println("object will be delete, id = " + id );
        } finally {
            super.finalize();
        }
    }
}
