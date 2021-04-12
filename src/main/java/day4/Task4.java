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
        int numberOfConsecutiveElementsToAdd = 3;
        int helper;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }

        for (int i = 0; i < arr.length - (numberOfConsecutiveElementsToAdd - 1) ; i++) {
            helper = 0;
            for (int j = i; j < numberOfConsecutiveElementsToAdd + i; j++) {
                helper += arr[j];
                if (sumThreeConsecutiveElements < helper) {
                    sumThreeConsecutiveElements = helper;
                    indexFirstElement = i;
                }
            }
        }

        System.out.printf("Maximum sum of three consecutive elements = %d\n", sumThreeConsecutiveElements);
        System.out.printf("Index of the first element of the triple = %d", indexFirstElement);

    }
}
