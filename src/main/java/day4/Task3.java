package day4;

/*
Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна.
Если таких строк несколько, вывести индекс последней из них.
*/


import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[][] arr = new int[12][8];
        int maximumLineAmount = 0;
        int lineNumberWithMaximumAmount = 0;

        for (int i = 0; i < arr.length; i++){
            int helper = 0;
            for (int z = 0; z < arr[i].length; z++){
                arr[i][z] = (int) (Math.random() * 50);
                helper += arr[i][z];
                if (maximumLineAmount <= helper) {
                    maximumLineAmount = helper;
                    lineNumberWithMaximumAmount = i;
                }
            }
        }

        System.out.printf("Maximum line amount = %d \n", maximumLineAmount);
        System.out.printf("Line number with maximum amount = %d \n", lineNumberWithMaximumAmount);
    }
}
