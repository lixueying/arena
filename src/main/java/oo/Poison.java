package oo;

import static java.lang.String.format;

/**
 * Created by lixueying on 15/12/3.
 */
public class Poison{
    private int poisonDamage;
    private String name;

    public Poison(String name, int poisonDamage) {
        this.name = name;
        this.poisonDamage = poisonDamage;
    }

    public String getName() {
        return name;
    }


    public int getPoisonDamage() {
        return poisonDamage;
    }
}
