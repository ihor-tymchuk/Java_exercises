package one;

public class RandomNumber {
    public void randomNumber(int count, boolean newLine) {
        for (int i = 0; i < count; i++) {
            if (!newLine) {
                System.out.print(randomNumber());
                if (i < count - 1) {
                    System.out.print(" ");
                }
                else {
                    System.out.println();
                }
            } else {
                System.out.println(randomNumber());
            }

        }
    }

    private int randomNumber() {
        int multi = createDigets();
        return (int) (Math.random() * multi);
    }

    private int createDigets() {
        int maxDigits = (int) Math.round(Math.random() * 10);
        int digits = 10;
        for (int i = 0; i < maxDigits; i++) {
            if (Math.random() * 10 % 2 == 0) {
                digits *= 10;
            } else {
                digits *= -10;
            }

        }
        return digits;
    }
}
