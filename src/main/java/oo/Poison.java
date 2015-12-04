package oo;

/**
 * Created by lixueying on 15/12/4.
 */
public class Poison {
    private String name;
    private int damage;
    private String detail;

    public Poison(String name, int damage, String detail){
        this.name = name;
        this.damage = damage;
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
