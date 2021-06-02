package one;

import java.util.Scanner;

public class HelloFriends {
    public void sayHi(String name) {
        if (name.length() > 2) System.out.println("Hello," + name);
        else System.out.println("You didn't input your name");
    }
}
