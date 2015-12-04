package oo;

import static java.lang.String.format;

/**
 * Created by lixueying on 15/12/4.
 */
public class WeaponSkill {
    private int damage;
    private String name;
    private String detail;

    public WeaponSkill(String name, int damage, String detail){
        this.name = name;
        this.damage = damage;
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public String beTrigger(Person victim){//触发武器技能
        return format("，%s%s，",victim.getName(), detail);
    }
}
