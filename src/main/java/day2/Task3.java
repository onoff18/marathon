package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (!(a >= b)) {

            int helper = a + 1;

            while (helper < b) {

                if (helper % 5 == 0 && helper % 10 != 0) {
                    System.out.print(helper + " ");
                }

                helper++;
            }

        } else {
            System.out.println("Некорректный ввод");
        }

    }
}
