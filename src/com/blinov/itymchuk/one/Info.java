package com.blinov.itymchuk.one;

/**
 * Create info about developer
 */
public class Info {
    public static void main(String[] args) {
        infoAboutDeveloper("Ihor Tymchuk", "19.06.2021", "20.06.2021");
    }

    /**
     * Create info about developer
     * @param name developer
     * @param start project
     * @param finish project
     */
    private static void infoAboutDeveloper(String name, String start, String finish) {
        System.out.println();
        System.out.println("~~~~~~@~~~~~~~");
        System.out.println(name);
        System.out.println("start project: " + start);
        System.out.println("finish project: " + finish);
        System.out.println("~~~~~~@~~~~~~~");
    }
}
