package day4;

/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов.
Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
*/


public class Task4 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        int sumThreeConsecutiveElements = 0;
        int indexFirstElement = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }

        for (int i = 2; i < arr.length; i++) {
            int helper = arr[i - 2] + arr[i - 1] + arr[i];
            if (sumThreeConsecutiveElements < helper) {
                sumThreeConsecutiveElements = helper;
                indexFirstElement = i - 2;
            }
        }

        System.out.printf("Maximum sum of three consecutive elements = %d\n", sumThreeConsecutiveElements);
        System.out.printf("Index of the first element of the triple = %d", indexFirstElement);

    }
}
