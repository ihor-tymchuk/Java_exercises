package one;

import java.util.Scanner;

/*
    Виводить задану кількість випадкових чисел чисел з переходом і без переходу на новий рядок
 */

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println("How much you want to print numbers?");
        int count = new Scanner(System.in).nextInt();
        randomNumber(count);
    }

    public static void randomNumber(int count) {
        for (int i = 0; i < count; i++) {
            if (Math.random() > 0.5) {
                System.out.print(randomNumber());
                if (i < count - 1) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                }
            } else {
                System.out.println(randomNumber());
            }
        }
    }

    private static int randomNumber() {
        int multi = createDigets();
        return (int) (Math.random() * multi);
    }

    private static int createDigets() {
        int maxDigits = (int) Math.round(Math.random() * 10);
        int digits = 10;
        for (int i = 0; i < maxDigits; i++) {
            if (Math.random() > 0.5) {
                digits *= 10;
            } else {
                digits *= -10;

            }
        }
        return digits;
    }
}
