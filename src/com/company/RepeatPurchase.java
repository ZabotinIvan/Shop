package com.company;

public class RepeatPurchase extends Purchases{

    public static void repeatPurchase (){
        cap();
        order();
        amount(); // Open-closed principle
    }
    public static void amount() { // dry
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%57s %d", "Итого: ", sumProducts-(sumProducts/2));
        System.out.println(" ");
        System.out.println("Программа завершена.");
    }

}
