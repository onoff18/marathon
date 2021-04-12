package day4;

/*Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
        Затем, используя цикл for each вывести в консоль:
        наибольший элемент массива
        наименьший элемент массива
        количество элементов массива, оканчивающихся на 0
        сумму элементов массива, оканчивающихся на 0

        Использовать сортировку запрещено.*/


public class Task2 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        int counterMultiplicity10 = 0;
        int sumMultiplicity10 = 0;
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 10000);
        }

        for (int num : arr) {
            if (num % 10 == 0){
                counterMultiplicity10++;
                sumMultiplicity10 += num;
            }

            if (maxElement < num){
                maxElement = num;
            }

            if (minElement > num) {
                minElement = num;
            }
        }

        System.out.printf("The largest element of the array = %d \n", maxElement);
        System.out.printf("The smallest element of the array = %d \n", minElement);
        System.out.printf("The number of array elements ending in 0 = %d \n", counterMultiplicity10);
        System.out.printf("Sum of array elements ending in 0 = %d \n", sumMultiplicity10);
    }
}
