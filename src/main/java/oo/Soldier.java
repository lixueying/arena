package oo;

public class Soldier extends Person {
    private Armor armor;

    public Soldier(String name, int blood, int damage) {
        super(name, blood, damage);
    }

    @Override
    public String getRole() {
        return "战士";
    }

    public void wearArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    protected int bleed(int damageFromAttacker) {
        if (null != armor) {
            return (damageFromAttacker > armor.getWeakenDamage()) ? damageFromAttacker - armor.getWeakenDamage() : 0;
        } else {
            return damageFromAttacker;
        }
    }
}
