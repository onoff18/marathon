package day11.task1;

public class Task1 {
    public static void main(String[] args) {

        Warehouse warehouse1 = new Warehouse();

        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        businessProcess(courier1);
        businessProcess(picker1);

        picker1.bonus();
        courier1.bonus();

        System.out.println(picker1);
        System.out.println(courier1);

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Picker picker3 = new Picker(warehouse1);

        picker2.doWork();
        picker2.doWork();
        picker2.doWork();
        picker2.doWork();
        picker3.doWork();
        picker3.doWork();

        System.out.println("******************************");

        System.out.println(warehouse1);
        System.out.println("******************************");
        System.out.println(warehouse2);




    }

    static void businessProcess (Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
    }
}

