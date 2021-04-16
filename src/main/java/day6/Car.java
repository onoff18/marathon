package day6;

/*
Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”.
Создать get и set методы для каждого поля.
Создать экземпляр класса Автомобиль.
Задать значение для каждого поля, используя set методы.
Вывести в консоль значение каждого из полей, используя get методы.
Созданный вами класс должен отвечать принципам инкапсуляции.
*/


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

        int differenceYearValue = 0;

        if (inputYear > yearOfManufacture){
            differenceYearValue = 0;
        } else {
            differenceYearValue = yearOfManufacture - inputYear;
        }
        return differenceYearValue;
    }
}
