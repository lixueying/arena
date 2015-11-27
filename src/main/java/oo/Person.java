package oo;

import static java.lang.String.format;

public class Person {
    private String name;
    private int blood;
    private int damage;

    public Person(String name, int blood, int damage) {
        this.name = name;
        this.blood = blood;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getBlood() {
        return blood;
    }

    public int getDamage() {
        return damage;
    }

    public String getRole() {
        return "普通人";
    }

    public String attack(Person victim) {
        return format("%s攻击了%s，%s", attackIdentify(), victim.beAttackedIdentify(), victim.beAttacked(damage));
    }

    private String beAttackedIdentify() {
        return format("%s%s", getRole(), name);
    }

    private String attackIdentify() {
        return format("%s%s", getRole(), name);
    }

    private String beAttacked(int damageFromAttacker) {
        blood -= damageFromAttacker;
        return format("%s受到了%d点伤害，%s剩余生命：%d",
                name, damageFromAttacker, name, blood);
    }

    public boolean isAlive() {
        return blood >= 0;
    }
}
