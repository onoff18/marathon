package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
    }

    public static double calculateRedPerimeter(Figure[] figures) {

        String colorForComparison = "Red";
        double perimeterSum = 0;

        for (int i = 0; i < figures.length; i++) {

            if (figures[i].getColor().equals(colorForComparison)){
                perimeterSum += figures[i].perimeter();
            }
        }
        return perimeterSum;
    }

    public static double calculateRedArea(Figure[] figures) {
        String colorForComparison = "Red";
        double areaSum = 0;

        for (int i = 0; i < figures.length; i++) {

            if (figures[i].getColor().equals(colorForComparison)){
                areaSum += figures[i].area();
            }
        }
        return areaSum;
    }

}
