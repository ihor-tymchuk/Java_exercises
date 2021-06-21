package com.blinov.itymchuk.four.learn.dumb;

public class Dumber extends Dumb{
    int id = 9; // Отримаємо два поля з однаковими іменами
    public Dumber(){
        System.out.println("Constructor class Dumber");
        id = this.getId();
        System.out.println(" id = " + id);
    }

    @Override
    public int getId(){
        System.out.println("getId() class Dumber");
        return id;
    }
}
