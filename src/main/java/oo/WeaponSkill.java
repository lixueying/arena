package oo;

import static java.lang.String.format;

/**
 * Created by lixueying on 15/12/3.
 */
public class WeaponSkill extends Weapon{

    private String skillName;
    private int skillDamage;

    public WeaponSkill(String name, int damage) {
        super(name, damage);
    }

    public int getSkillDamage() {
        return skillDamage;
    }

    public String fire(Person victim){
        return format("%s着火了",victim.getName());
    }

    public String fireDamage(Person victim){
        return format("%s受到%d火焰伤害",victim.getName(), skillDamage);
    }

    public String freeze(Person victim){
        return format("%s冻住了",victim.getName());
    }

    public String freezeDamage(Person victim){
        return format("%s受到冰冻伤害,此轮无法攻击",victim.getName());
    }
}
