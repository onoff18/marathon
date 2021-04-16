package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Mig", 2000, 17300, 22400);

        airplane.fillUp(100);
        airplane.fillUp(500);
        airplane.info();
    }
}
