package com.exam.encapsulation;

public class FruitMain {
    public static void main(String args[]){
        Apple a= new Apple();
        PoisonBerry pB= new PoisonBerry();
        System.out.println("Apple is sweet ="+ a.isSweet()+" is Poison="+a.isPoisonous());
        System.out.println("PoisonBerry is sweet ="+ pB.isSweet()+" is Poison="+pB.isPoisonous());

    }
}
