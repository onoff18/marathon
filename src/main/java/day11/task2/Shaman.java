package day11.task2;

import day11.task2.Interface.Healer;
import day11.task2.Interface.MagicAttack;
import day11.task2.Interface.PhysAttack;
import day11.task2.Model.Hero;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {

    private int healHimself;
    private int healTeammate;


    public Shaman () {
        setPhysAtt(10);
        setMagicAtt(15);
        setPhysDef(20);
        setMagicDef(20);
        this.healHimself = 50;
        this.healTeammate = 30;
        setType("Shaman");
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
        if (this.getHealth() > getMAX_HEALTH()) {
            this.setHealth(getMAX_HEALTH());
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + healTeammate);
        if (hero.getHealth() > getMAX_HEALTH()) {
            hero.setHealth(getMAX_HEALTH());
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        int damage = (int) (this.getMagicAtt() - (this.getMagicAtt() * hero.getMagicDef() / 100));
        hero.setHealth(hero.getHealth() - damage);

        if (hero.getHealth() < getMIN_HEALTH()) {
            hero.setHealth(getMIN_HEALTH());
        }
    }

    @Override
    public String toString() {
        return super.toString() + getHealHimself() + "\nCure teammate - " + getHealTeammate() + "\n";
    }
}
