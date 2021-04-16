package day11.task1;

public class Picker implements Worker {

    private int salary;
    private int pay = 80;
    private int bonus = 70000;
    private int amountForBonus = 10000;
    boolean isPayed = false;
    private Warehouse warehouse;


    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString () {

        String payed;

        if (isPayed == true) {
            payed = "Премия выплачена";
        } else {
            payed = "Премия не выплачена";
        }
        return "Текущая ЗП - " + salary + "\n" + payed;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += pay;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() >= amountForBonus && isPayed == false) {
            salary += bonus;
            isPayed = true;
        } else if (warehouse.getCountPickedOrders() < amountForBonus && isPayed == false) {
            System.out.println("Бонус пока не доступен");
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
