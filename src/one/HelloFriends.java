package one;

/*
    Вітає будь якого користувача при вводі його імені через командний рядок
*/

public class HelloFriends {
    public static void main(String[] args) {
        sayHi(args);
    }

    public static void sayHi(String[] name) {
        if (name.length != 0) System.out.println("Hello," + name[0]);
        else System.out.println("You didn't input your name :(");
    }
}
