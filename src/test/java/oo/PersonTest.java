package oo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void should_Create_Player_Successfully() {
        Person person = new Person("王二麻子", 100, 10);

        assertThat(person.getName(), is("王二麻子"));
        assertThat(person.getBlood(), is(100));
        assertThat(person.getDamage(), is(10));
    }

    @Test
    public void should_Can_Attack_Other_Player() {
        Person attacker = new Person("张三", 100, 10);
        Person victim = new Person("李四", 80, 20);

        attacker.attack(victim);

        assertThat(victim.getBlood(), is(80 - attacker.getDamage()));
    }

    @Test
    public void should_Return_Who_Attack_Victim_And_How_Much_Victim_Bleed_And_How_Much_Blood_Left() {
        Person attacker = new Person("张三", 100, 10);
        Person victim = new Person("李四", 80, 20);

        assertThat(attacker.attack(victim), is("普通人张三攻击了普通人李四，李四受到了10点伤害，李四剩余生命：70"));
    }

    @Test
    public void should_Return_Person_Attack_Soldier_And_How_Much_Soldier_Bleed_And_How_Much_Blood_Left() {
        Person person = new Person("张三", 100, 10);
        Soldier soldier = new Soldier("李四", 80, 20);

        assertThat(person.attack(soldier), is("普通人张三攻击了战士李四，李四受到了10点伤害，李四剩余生命：70"));
    }

    @Test
    public void should_Bleed_Is_Person_Damage_Minus_Soldier_ArmorWeakenDamage() {
        Person person = new Person("张三", 100, 10);
        Soldier soldier = new Soldier("李四", 80, 20);
        Armor armor = new Armor("金丝软甲", 5);
        soldier.wearArmor(armor);

        assertThat(person.attack(soldier), is("普通人张三攻击了战士李四，李四受到了5点伤害，李四剩余生命：75"));
    }

    @Test
    public void should_Alive_When_Blood_Is_0() {
        Person survivor = new Person("王二麻子", 0, 0);

        assertThat(survivor.isAlive(), is(true));
    }

    @Test
    public void should_Alive_When_Blood_Great_Than0() {
        Person survivor = new Person("王二麻子", 1, 0);

        assertThat(survivor.isAlive(), is(true));
    }

    @Test
    public void should_Dead_When_Blood_Less_Than_0() {
        Person dead = new Person("王二麻子", -1, 0);

        assertThat(dead.isAlive(), is(false));
    }
}