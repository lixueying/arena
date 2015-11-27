package oo;

import static java.lang.String.format;

public class Soldier extends Person {
    private Armor armor;
    private Weapon weapon;

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

    public void wearWeapon(Weapon weapon) {
        this.weapon = weapon;
        this.damage += weapon.getDamage();
    }

    @Override
    protected String attackIdentify() {
        if (null != weapon) {
            return format("%s%s", super.attackIdentify(), weapon.beUsed());
        } else {
            return super.attackIdentify();
        }
    }
}
