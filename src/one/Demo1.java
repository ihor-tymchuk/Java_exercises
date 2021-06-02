package one;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("What your name?");
        String name = new Scanner(System.in).next();
        new HelloFriends().sayHi(name);

        System.out.println("How much you want to print numbers?");
        int count = new Scanner(System.in).nextInt();
        new RandomNumber().randomNumber(count, false);

        System.out.print("Password: ");
        String password = new Scanner(System.in).next();
        System.out.println("Password is: " + new CheckPassword().check(password));
    }
}
