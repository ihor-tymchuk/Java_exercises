package two;

public class Demo {
    public static void main(String[] args) {
        Title info = new Title("Ihor Petrenko", "6 june 2021", "1 june 2021");
        System.out.println(info);

        InputNumbers num = new InputNumbers();
        System.out.println("Input numbers: ");
        num.create();
        System.out.println("You inputed number(s): " + num);
        WorkWithNumbers work = new WorkWithNumbers(num.getString());
        System.out.println(work.mostLongNumber());
        System.out.println(work.mostShortNumber());
    }
}
