package day5;

/*
Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”.
Создать get и set методы для каждого поля.
Создать экземпляр класса Автомобиль.
Задать значение для каждого поля, используя set методы.
Вывести в консоль значение каждого из полей, используя get методы.
Созданный вами класс должен отвечать принципам инкапсуляции.
*/


public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setColor("Red with 2 white strips");
        car1.setModel("Pickup truck");
        car1.setYearOfManufacture(2020);

        String car1Color = car1.getColor();
        String car1Model = car1.getModel();
        int car1YearOfManufacture = car1.getYearOfManufacture();

        System.out.printf("This is a %d %s %s", car1YearOfManufacture, car1Color, car1Model);

    }
}

class Car {

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
}
