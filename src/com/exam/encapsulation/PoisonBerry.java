package com.exam.encapsulation;

public class PoisonBerry implements fruit {
    @Override
    public boolean isSweet() {
        return false;
    }

    @Override
    public boolean isPoisonous() {
        return true;
    }
}
