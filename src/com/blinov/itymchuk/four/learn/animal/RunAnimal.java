package com.blinov.itymchuk.four.learn.animal;

public class RunAnimal {
    public static void main(String[] args) {
        Animal animal = new Pet();
        animal.introduce();
//        animal.nickname();

        Pet pet = (Pet) animal;
        pet.introduce();
        pet.nickname();
    }
}
