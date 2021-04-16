package day9.Task2;

public class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {

        double p = 0.5 * perimeter();

        return Math.sqrt(p * (p - sideC) * (p - sideB) * (p - sideA));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
