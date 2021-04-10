package day4;

/*С клавиатуры вводится число n - размер массива.
Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10.
Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
        а) Длине массива
        б) Количестве чисел больше 8
        в) Количестве чисел равных 1
        г) Количестве четных чисел
        д) Количестве нечетных чисел
        е) Сумме всех элементов массива*/


import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();
        int[] arr = new int[arraySize];
        int counterMoreThen8 = 0;
        int counterEquals1 = 0;
        int counterEven = 0;
        int counterOdd = 0;
        int sumAllElements = 0;

        for (int i = 0; i < arraySize; i++ ) {
            arr[i] = (int) (Math.random() * 10);

            if (arr[i] > 8) {
                counterMoreThen8++;
            }

            if (arr[i] == 1) {
                counterEquals1++;
            }

            if (arr[i] % 2 == 0) {
                counterEven++;
            } else {
                counterOdd++;
            }

            sumAllElements += arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Array length " + arr.length);
        System.out.println("The number of numbers greater than 8 = " + counterMoreThen8);
        System.out.println("The number of numbers equals 1 = " + counterEquals1);
        System.out.println("The number of even numbers = " + counterEven);
        System.out.println("The numbers of odd numbers = " + counterOdd);
        System.out.println("Sum of all array elements = " + sumAllElements);

    }
}
