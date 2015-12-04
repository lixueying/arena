package oo;

import static java.lang.String.format;

public class Weapon {
    private int damage;
    private final String name;
    private WeaponSkill weaponSkill;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public String beUsed() {
        return format("用%s", name);
    }

    public void wearSkill(WeaponSkill weaponSkill){//武器装备技能
        this.weaponSkill = weaponSkill;
        this.damage += weaponSkill.getDamage();
    }
}
