package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*//Задание 1
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

        //Задание 4
        System.out.println("\nВведите число: ");
        int posOrNot = in.nextInt();
        System.out.println("Число положительное? " + isPositive(posOrNot));

        //Задание 5
        System.out.println("\nВведите число: ");
        int digit = in.nextInt();
        System.out.println("Число из двух знаков? " + is2Digits(digit));

        //Задание 6
        System.out.println("\nВведите букву: ");
        char charUpper = in.nextLine().charAt(0);
        System.out.println("Буква большая? " + isUpperCase(charUpper));*/

        //Задание 7
        System.out.println("\nВведите границу 1: ");
        int num1 = in.nextInt();
        System.out.println("\nВведите границу 2: ");
        int num2 = in.nextInt();
        System.out.println("\nВведите число: ");
        int num3 = in.nextInt();
        System.out.println("Входит ли число в диапазон? " + isInRange(num1, num2, num3));

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

    public static int charToNum(char x) {
        return (int) x;
    }

    public static boolean isPositive(int x) {
        boolean res = (x >= 0);
        return res;
    }

    public static boolean is2Digits(int x) {
        boolean res = (int) x / 100 == 0;
        return res;
    }

    public static boolean isUpperCase(char x) {
        boolean res = Character.isUpperCase(x);
        return res;
    }

    public static boolean isInRange(int a, int b, int num) {
        return ((a <= num && num <= b) || (a >= num && num >= b));
    }

}