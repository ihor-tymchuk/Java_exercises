package com.blinov.itymchuk.one;
/*
    Відображає в консолі аргументи командного рядка в зворотному порядку
 */
public class ReverseOrder {
    public static void main(String[] args) {
        reverseArgs(args);
    }

    public static void reverseArgs(String[] array){
        for (int i = array.length; i > 0; i--){
            if(i-1 != 0) {
                System.out.print(array[i-1] + " ");
            } else {
                System.out.print(array[i-1]);
            }
        }
    }
}
