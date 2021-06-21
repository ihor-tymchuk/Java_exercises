package com.blinov.itymchuk.four.learn.card;

public class CreditCardAction extends CardAction{
    public boolean checkCreditLimit(){
        System.out.println("check limit for credit card: " + true);
        return true;
    }

    @Override
    public void doPay(double amountPayment) {
        System.out.println("complete for credit card");
    }
}
