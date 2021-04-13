package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane a1 = new Airplane("aa", 1, 100, 1);
        Airplane a2 = new Airplane("aa", 1, 10, 1);

        Airplane.compareAirplanes(a1, a2);
    }
}