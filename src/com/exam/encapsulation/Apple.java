package com.exam.encapsulation;

public class Apple implements fruit {
    @Override
    public boolean isSweet() {
        return true;
    }

    @Override
    public boolean isPoisonous() {
        return false;
    }
}
