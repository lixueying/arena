package oo;

import static java.lang.String.format;

public class Weapon {
    private int damage;
    private final String name;
    private int exDamage;
    private Poison poison;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public int getExDamage() {
        return exDamage;
    }

    public String beUsed() {
        return format("用%s", name);
    }

    public void wearPoison(Poison poison){
        this.poison = poison;
        this.exDamage = poison.getPoisonDamage();
    }
}
