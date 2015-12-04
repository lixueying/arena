package oo;

import static java.lang.String.format;

/**
 * Created by lixueying on 15/12/4.
 */
public class WeaponSkill {
    private int damage;
    private String name;

    public WeaponSkill(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public String beTrigger(Person victim){//触发武器技能
        return format("，%s%s，",victim.getName(), name);
    }
}
