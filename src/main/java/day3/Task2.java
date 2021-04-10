package day3;

/*
Реализовать программу, которая пока работает, принимает на вход от пользователя два числа - делимое и делитель.
Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
Программа останавливает свою работу тогда, когда пользователь вводит 0 в качестве делителя.
(для этих вещественных чисел необходимо использовать тип double и метод nextDouble() у Scanner’а соответственно).
В решении обязательно использовать оператор break.
*/


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double divisible;
        double divisor;
        double quotient;

        while (true) {

            divisible = sc.nextDouble();
            divisor = sc.nextDouble();

            if (divisor == 0) {
                break;
            }

            quotient = divisible / divisor;

            System.out.println(quotient);

        }
    }
}
