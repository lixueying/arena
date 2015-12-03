package oo;

/**
 * Created by lixueying on 15/12/3.
 */
public class NoWeaponSkill extends Weapon {
    private static NoWeaponSkill INSTANCE = new NoWeaponSkill("", 0);
    public NoWeaponSkill(String name, int damage) {
        super(name, damage);
    }
    public static NoWeaponSkill getInstance() {
        return INSTANCE;
    }
}
