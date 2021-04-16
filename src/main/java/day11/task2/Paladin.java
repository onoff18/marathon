package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {

    private static final String TYPE = "Paladin";
    private int healHimself;
    private int healTeammate;


    public Paladin () {
        setPhysAtt(15);
        setMagicAtt(0);
        setPhysDef(50);
        setMagicDef(20);
        this.healHimself = 25;
        this.healTeammate = 10;
    }

    public static String getTYPE() {
        return TYPE;
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
                + getMagicDef() + "%\nCure yourself - " + getHealHimself() + "\nCure teammate - " + getHealTeammate() + "\n";
    }
}
