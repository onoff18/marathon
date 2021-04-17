package day11.task2;

import day11.task2.Interface.PhysAttack;
import day11.task2.Model.Hero;

public class Warrior extends Hero implements PhysAttack {

    public Warrior () {
        setPhysAtt(30);
        setMagicAtt(0);
        setPhysDef(80);
        setMagicDef(0);
        setType("Warrior");
    }

}
