package com.blinov.itymchuk.one;

public class CheckPassword {
    private static String password = "vasy";

    public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println("Password is: " + check(args[0]));
        } else {
            System.out.println("You didn't input password");
        }
    }

    private static boolean check(String userPassword) {
        if (userPassword.equals(password)) {
            return true;
        }
        return false;
    }
}
