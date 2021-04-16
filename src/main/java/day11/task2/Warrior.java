package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    private static final String TYPE = "Warrior";

    public Warrior () {
        setPhysAtt(30);
        setMagicAtt(0);
        setPhysDef(80);
        setMagicDef(0);
    }

    public static String getTYPE() {
        return TYPE;
    }



    @Override
    public void physicalAttack(Hero hero) {
        int damage = (int) (this.getPhysAtt() - (this.getPhysAtt() * hero.getPhysDef() / 100));
        hero.setHealth(hero.getHealth() - damage);

        if (hero.getHealth() < 0) {
            hero.setHealth(0);
        }
    }

    @Override
    public String toString() {
        return "Type of fighter - " + getTYPE() + "\nPhysical attack power - " + getPhysAtt() + "\nMagical attack power - " +
                + getMagicAtt() + "\nPhysical damage protection - " + getPhysDef() + "%\nMagical damage protection - " +
                + getMagicDef() + "%";
    }
}
