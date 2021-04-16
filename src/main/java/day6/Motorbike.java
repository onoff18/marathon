package day6;

/*
Создать класс Мотоцикл (англ. Motorbike) с полями “Год выпуска”, “Цвет”, “Модель”.
Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
Вывести в консоль значение каждого из полей, используя get методы.
*/


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
        int differenceYearValue = 0;
        if (inputYear > yearOfManufacture){
            differenceYearValue = 0;
        } else {
            differenceYearValue = yearOfManufacture - inputYear;
        }
        return differenceYearValue;
    }


}
