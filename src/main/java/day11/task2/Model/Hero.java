package day11.task2.Model;

public abstract class Hero {

    private int health = 100;
    private static final int MAX_HEALTH = 100;
    private static final int MIN_HEALTH = 0;
    private double physDef;
    private double magicDef;
    private double physAtt;
    private double magicAtt;
    private static String type = "";

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Hero.type = type;
    }

    public int getHealth() {
        return health;
    }

    public int getMAX_HEALTH() {
        return MAX_HEALTH;
    }

    public int getMIN_HEALTH() {
        return MIN_HEALTH;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }

    public double getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public double getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }

    public void physicalAttack(Hero hero) {
        int damage = (int) (this.getPhysAtt() - (this.getPhysAtt() * hero.getPhysDef() / 100));
        hero.setHealth(hero.getHealth() - damage);

        if (hero.getHealth() < hero.getMIN_HEALTH()) {
            hero.setHealth(hero.getMIN_HEALTH());
        }
    }

    public String toString() {
        return "Type of fighter - " + getType() + "\nPhysical attack power - " + getPhysAtt() + "\nMagical attack power - " +
                + getMagicAtt() + "\nPhysical damage protection - " + getPhysDef() + "%\nMagical damage protection - " +
                + getMagicDef() + "%";
    }


}
