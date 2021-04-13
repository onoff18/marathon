package day7;

public class Task2 {
    public static void main(String[] args) {
        Player p = new Player(1);
        Player p2 = new Player(10);
        Player p3 = new Player(10);
        Player p4 = new Player(10);
        Player p5 = new Player(10);
        Player p6 = new Player(10);


        Player.info();

        p.run();
        p.run();
        p.run();

        Player.info();




    }
}
