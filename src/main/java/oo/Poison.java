package oo;

/**
 * Created by lixueying on 15/12/4.
 */
public class Poison {
    private String name;
    private int damage;

    public Poison(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
