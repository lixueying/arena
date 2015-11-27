package oo;

public class Soldier extends Person {
    public Soldier(String name, int blood, int damage) {
        super(name, blood, damage);
    }

    @Override
    public String getRole() {
        return "战士";
    }
}
