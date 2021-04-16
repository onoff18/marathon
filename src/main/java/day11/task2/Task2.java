package day11.task2;

public class Task2 {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        System.out.println(paladin.getHealth());

        paladin.physicalAttack(magician);
        System.out.println(magician.getHealth());

        shaman.healTeammate(magician);
        System.out.println(magician.getHealth());

        magician.magicalAttack(paladin);
        System.out.println(paladin.getHealth());

        shaman.physicalAttack(warrior);
        System.out.println(warrior.getHealth());

        paladin.healHimself();
        System.out.println(paladin.getHealth());

        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
            System.out.println(magician.getHealth());
        }
    }
}
