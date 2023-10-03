package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        double x = new Scanner(System.in).nextDouble();

        System.out.println("Дробная часть: ");
        System.out.format("%.3f", fraction(x));
    }

    public static double fraction(double x) {
        int res = (int) x;
        double res2 = x - res;
        return res2;
    }


}