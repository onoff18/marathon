package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack {

    private static final String TYPE = "Magician";

    public Magician () {
        setPhysAtt(5);
        setMagicAtt(20);
        setPhysDef(0);
        setMagicDef(80);
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
    public void magicalAttack(Hero hero) {
        int damage = (int) (this.getMagicAtt() - (this.getMagicAtt() * hero.getMagicDef() / 100));
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
