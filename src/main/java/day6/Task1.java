package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setYearOfManufacture(2021);

        int i = car.yearDifference(1021);

        Motorbike bike = new Motorbike("Black", "Java", 2020);
        int j = bike.yearDifference(2000);

        car.info();
        System.out.println(i);

        bike.info();
        System.out.println(j);


    }
}
