package com.company;

import java.util.Scanner;

public class Purchases {
    protected static int sumProducts = 0;
    protected static String[] products = new String[]{"Хлеб  ", "Яблоки", "Молоко"};
    protected static int[] prices = new int[]{100, 200, 300};

    protected static int[] sum = new int[products.length]; //  магические числа
    protected static int[] count = new int[prices.length]; // магические числа

    protected static int productNumber;
    protected static int productCount;

    public static void purchases() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - " + prices[i]);
        }

        while (true) {
            System.out.println("Введите номер товара и количество через пробел, или end для выхода из программы");
            String input = scanner.nextLine();
            if ("end".equals(input)) {

                break;
            }

            String[] split = input.split(" ");

            String a = split[0];
            productNumber = Integer.parseInt(a) - 1;

            String b = split[1];
            productCount = Integer.parseInt(b);

            sum[productNumber] = prices[productNumber] * productCount;
            count[productNumber] = productCount;


        }
        cap(); // dry
        order();
        amount(); // dry


    }

    public static void order() {
        for (int i = 0; i < products.length; i++) {
            if (count[i] != 0) {
                System.out.printf("%s %19s %15s %14s\n", products[i], count[i], prices[i],
                        sum[i]);
            }
            sumProducts += sum[i];
        }
    }

    public static void cap() {  // dry
        System.out.println(" ");
        System.out.println("Ваша корзина:");
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%s %9s %6s %s\n", "Наименование товара | ", "Количество | ", "Цена/за.ед | ", "Общая " +
                "стоимость");
        System.out.println("--------------------------------------------------------------------");
    }

    public static void amount() { // dry
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%57s %d", "Итого: ", sumProducts);
        System.out.println(" ");
        System.out.println("Программа завершена.");
    }

}
