package day3;

/*
Реализовать программу, которая 5 раз запрашивает от пользователя два числа - делимое и делитель.
Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
Если пользователь вводит 0 в качестве делителя, вместо того, чтобы останавливать работу цикла принудительно,
мы пропускаем итерацию и выводим в консоль сообщение “Деление на 0”.
Ключевое слово else или два if использовать в этой программе нельзя. В решении обязательно использовать оператор continue.
*/


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double divisible;
        double divisor;
        double quotient;

        for (int i = 0; i < 5; i++ ) {

            divisible = sc.nextDouble();
            divisor = sc.nextDouble();

            if (divisor == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            quotient = divisible / divisor;

            System.out.println(quotient);
        }
    }
}
