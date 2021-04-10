package day5;

/*
Создать класс Мотоцикл (англ. Motorbike) с полями “Год выпуска”, “Цвет”, “Модель”.
Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
Вывести в консоль значение каждого из полей, используя get методы.
*/



public class Task2 {
    public static void main(String[] args) {

        Motorbike moto1 = new Motorbike("Ripe cherries", "Java", 1965);

        String moto1Color = moto1.getColor();
        String moto1Model = moto1.getModel();
        int moto1YearOfManufacture = moto1.getYearOfManufacture();

        System.out.printf("This is a %d %s %s",moto1YearOfManufacture, moto1Color, moto1Model);

    }
}

class Motorbike {

    private String color;
    private String model;
    private int yearOfManufacture;

    public Motorbike (String color, String model, int yearOfManufacture) {
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

}
