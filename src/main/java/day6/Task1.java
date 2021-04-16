package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setYearOfManufacture(2020);

        int i = car.yearDifference(1980);
        car.info();
        System.out.println(i);

        Motorbike bike = new Motorbike("Red", "Java", 2020);

        int j = bike.yearDifference(1980);
        bike.info();
        System.out.println(j);

        Airplane plane = new Airplane("Boing", 1998, 5,5000);
        plane.setFuel(0);

        int a = plane.getFuel();
        plane.fillUp(110);
        int b = plane.getFuel();
        plane.fillUp(90);
        int c = plane.getFuel();
        plane.info();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
