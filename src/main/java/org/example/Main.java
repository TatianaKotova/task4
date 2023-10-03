package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Задание 1
        System.out.println("Введите дробное число:");
        double x = in.nextDouble();
        System.out.println("Дробная часть: ");
        System.out.format("%.3f", fraction(x));

        //Задание 2
        System.out.println("\nВведите целое число (количество знаков >= 2): ");
        int sumLast = in.nextInt();
        System.out.println("Сумма последних 2 знаков: " + sumLastNums(sumLast));

        //Задание 3
        System.out.println("\nВведите цифру (от 0 до 9): ");
        String inputChar = in.nextLine();
        char charIn = inputChar.charAt(0);
        System.out.println("Код символа " + charIn + ": " + charToNum(charIn));

    }

    public static double fraction(double x) {
        int res = (int) x;
        double res2 = x - res;
        return res2;
    }

    public static int sumLastNums(int x) {
        int num1 = x % 10;
        int num2 = (x / 10) % 10;
        int res = num1 + num2;
        return res;
    }

    public static int charToNum(char x){
        return  (int)x;
    }

}