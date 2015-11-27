package oo;

import static java.lang.String.format;

public class Weapon {
    private final int damage;
    private final String name;

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
}
