package oo;

import static java.lang.String.format;

/**
 * Created by lixueying on 15/12/3.
 */
public class Poison extends Weapon{
    private int poisonDamage;
    public Poison(String name, int damage) {
        super(name, damage);
    }

    public String bePoisoned(Person victim){
        return format("%s中毒了",victim.getName());
    }

    public String poisonousDamage(Person victim){
        return format("%s受到%d毒性伤害",victim.getName(), poisonDamage);
    }

}
