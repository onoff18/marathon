package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> odd = new ArrayList<>();

        int firstElementArray = 0;
        int lastElementArray = 350;
        int beginDisregarded = 30;
        int endDisregarded = 300;

        for (int i = firstElementArray; i <= lastElementArray ; i++) {
            if(i > beginDisregarded && i < endDisregarded){
                i = endDisregarded;
            }

            if (i % 2 == 0) {
                odd.add(i);
            }
        }
        System.out.println(odd);
    }
}
