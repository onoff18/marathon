package day11.task2;

import day11.task2.Interface.MagicAttack;
import day11.task2.Interface.PhysAttack;
import day11.task2.Model.Hero;

public class Magician extends Hero implements MagicAttack, PhysAttack {

    public Magician () {
        setPhysAtt(5);
        setMagicAtt(20);
        setPhysDef(0);
        setMagicDef(80);
        setType("Magician");
    }

    @Override
    public void magicalAttack(Hero hero) {
        int damage = (int) (this.getMagicAtt() - (this.getMagicAtt() * hero.getMagicDef() / 100));
        hero.setHealth(hero.getHealth() - damage);

        if (hero.getHealth() < hero.getMIN_HEALTH()) {
            hero.setHealth(hero.getMIN_HEALTH());
        }
    }
}

