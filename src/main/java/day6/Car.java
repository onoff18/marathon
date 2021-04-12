package day6;

public class Car {

    private String color;
    private String model;
    private int yearOfManufacture;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void info () {
        System.out.println("Это автомобиль");
    }

    public int yearDifference (int inputYear) {
        int differenceBetweenYears = Math.abs(yearOfManufacture - inputYear);
        return differenceBetweenYears;
    }

}
