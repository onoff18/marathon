package day6;

/*
 Создать класс Самолет (Airplane) с полями:
         producer (изготовитель)
         year (год выпуска)
         length (длина)
         weight (вес)
         fuel (количество топлива в баке)
Для всех полей должны быть реализованы сеттеры, а для поля fuel еще и геттер.

Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей класса
(значение поля “количество топлива в баке” установить равным 0).
В конструкторе для передачи полям значений использовать ключевое слово this.
Помимо этого, в классе необходимо реализовать метод info(), который выводит сообщение в следующем формате:
“Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”

Также, необходимо реализовать метод fillUp(int n), который в качестве аргумента принимает число и
заправляет топливный бак самолета на это значение.
Создать новый объект класса Самолет с произвольными данными.
Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp(int n) два раза, передав разные значения.
Вызвать метод info().
*/


public class Airplane {


    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane (String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }


    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, количество топлива в баке: %d\n",
                producer, year, length, weight);
    }

    public int fillUp (int n) {
        fuel += n;
        return fuel;
    }



}
