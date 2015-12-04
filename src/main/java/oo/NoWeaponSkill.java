package oo;

import static java.lang.String.format;

/**
 * Created by lixueying on 15/12/3.
 */
public class NoWeaponSkill extends WeaponSkill {
    private static NoWeaponSkill INSTANCE = new NoWeaponSkill("", 0);
    public NoWeaponSkill(String name, int damage) {
        super(name, damage);
    }
    public static NoWeaponSkill getInstance() {
        return INSTANCE;
    }

    @Override
    public String beTrigger(Person victim){//触发武器技能
        return "";
    }
}
