package com.blinov.itymchuk.four.learn.entity;

class ConstMethod {
    final void method(){}
    void methodOver(){}
}

class Sub extends ConstMethod {
    @Override
    void methodOver(){}

    // Наступний метод не можливий
    @Override
    void method(){}
}