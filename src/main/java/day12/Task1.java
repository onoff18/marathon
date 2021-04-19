package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> carList = new ArrayList<>(new ArrayList<>(Arrays.asList("Kamaz", "Belaz", "Gaz", "Vaz", "Zaz")));

        System.out.println(carList);

        carList.add(2, "Kraz");

        System.out.println(carList);

        carList.remove(0);

        System.out.println(carList);

    }
}
