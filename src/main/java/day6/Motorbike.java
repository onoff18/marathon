package day6;

public class Motorbike {

    private String color;
    private String model;
    private int yearOfManufacture;

    public Motorbike(String color, String model, int yearOfManufacture) {
        this.color = color;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void info () {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference (int inputYear) {
        int differenceBetweenYears = Math.abs(yearOfManufacture - inputYear);
        return differenceBetweenYears;
    }


}
