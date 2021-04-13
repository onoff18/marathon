package day8;

public class Task1 {
    public static void main(String[] args) {

        int arraySize = 20001;

        long start = System.currentTimeMillis();

        String[] strArr = new String[arraySize];
        String s = "";

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = Integer.toString(i) + " ";
            s = s + strArr[i];
        }

        System.out.println(s);

        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;

        System.out.println(timeConsumedMillis);

        long start1 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arraySize; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);

        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;

        System.out.println(timeConsumedMillis1);




    }
}
