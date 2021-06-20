package com.blinov.itymchuk.one;

/**
 * This class have two static method.
 * Method sum add all numbers with array and return result
 * Method mult multiplication all numbers with array and return result
 */
public class Ariphmetics {
    public static void main(String[] args) {
        System.out.println("summa numbers = "+sum(args));
        System.out.println("multiplication numbers = "+mult(args));
    }

    public static int sum(String[] numbers){
        int sum = 0;
        for(String item: numbers){
            sum += Integer.parseInt(item);
        }
        return sum;
    }

    public static int mult(String[] numbers){
        if(numbers.length == 0){
            return 0;
        }

        int mult = 1;
        for(String item: numbers){
            mult *= Integer.parseInt(item);
        }
        return mult;
    }
}
