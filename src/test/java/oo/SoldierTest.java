package oo;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SoldierTest {
    private Soldier soldier;
    private Person person;
    private Armor armor;
    private Weapon weapon;

    @Before
    public void setUp() {
        this.soldier = new Soldier("张三", 100, 10);
        this.person = new Person("李四", 100, 10);
        armor = new Armor("金丝软甲", 5);
        weapon = new Weapon("屠龙刀", 10);
    }

    @Test
    public void should_Soldier_Can_Attack_Person_Without_Any_Weapon_And_Armor() {
        assertThat(soldier.attack(person), is("战士张三攻击了普通人李四，李四受到了10点伤害，李四剩余生命：90"));
    }

    @Test
    public void should_The_Damage_ShouldNot_Change_After_Soldier_Wear_Armor() {
        int damageBeforeWearArmor = soldier.getDamage();
        soldier.wearArmor(armor);
        int damageAfterWearArmor = soldier.getDamage();

        assertThat(damageAfterWearArmor, is(damageBeforeWearArmor));
    }

    @Test
    public void should_Soldier_Can_Wear_Weapon_And_Improve_AttackPower() {
        int damageBeforeWearWeapon = soldier.getDamage();

        soldier.wearWeapon(weapon);

        assertThat(soldier.getDamage(), is(damageBeforeWearWeapon + weapon.getDamage()));
    }

    @Test
    public void should_Print_Soldier_Use_Weapon_Attacked_Person_When_Soldier_Wore_Weapon() {
        soldier.wearWeapon(weapon);
        assertThat(soldier.attack(person), is("战士张三用屠龙刀攻击了普通人李四，李四受到了20点伤害，李四剩余生命：80"));
    }
}