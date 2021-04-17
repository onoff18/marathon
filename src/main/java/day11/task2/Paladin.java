package day11.task2;

import day11.task2.Interface.Healer;
import day11.task2.Interface.PhysAttack;
import day11.task2.Model.Hero;

public class Paladin extends Hero implements Healer, PhysAttack {

    private int healHimself;
    private int healTeammate;

    public Paladin () {
        setPhysAtt(15);
        setMagicAtt(0);
        setPhysDef(50);
        setMagicDef(20);
        this.healHimself = 25;
        this.healTeammate = 10;
        setType("Paladin");
    }

    public int getHealHimself() {
        return healHimself;
    }

    public int getHealTeammate() {
        return healTeammate;
    }

    @Override
    public void healHimself() {
        this.setHealth(this.getHealth() + healHimself);
        if (this.getHealth() > 100) {
            this.setHealth(100);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + healTeammate);
        if (hero.getHealth() > 100) {
            hero.setHealth(100);
        }
    }

    @Override
    public String toString() {
        return super.toString() + getHealHimself() + "\nCure teammate - " + getHealTeammate() + "\n";
    }
}
