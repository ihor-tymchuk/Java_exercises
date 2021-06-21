package com.blinov.itymchuk.four.learn.card;

public class CardRunner {
    public static void main(String[] args) {
        CardAction dc1 = new CardAction();
        // можем користуватись усіма public мeтодами CardAction,
        // private не можна,
        // default лише у пакеті
        CardAction dc2 = new CreditCardAction(); // можем користуватись усіма поліморфними мeтодами СreditCardAction
        // але не можна не поліморфними.
        CreditCardAction cc = new CreditCardAction();
//        CreditCardAction cc2 = new CardAction(); <-- помилка компіляції

        dc1.doPay(12.0);
        dc1.puckNumber("1111");
        dc2.puckNumber("2222");
        dc2.doPay(23.0);
        cc.doPay(22);
        cc.checkCreditLimit();
//        dc2.checkCreditLimit(); <-- помилка. Неполіморфний метод
        // ((CreditCardAction) dc1).checkCreditLimit(); // помилка часу виконання
        ((CreditCardAction) dc2).checkCreditLimit(); //ok
    }
}
