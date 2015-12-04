package oo;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by lixueying on 15/12/4.
 */
public class WeaponSkillTest {
    private Soldier soldier;
    private Person person;
    private Weapon weapon;
    private WeaponSkill weaponSkill;
    @Before
    public void setUp(){
        this.soldier = new Soldier("张三", 100, 10);
        this.person = new Person("李四", 100, 10);
        weapon = new Weapon("屠龙刀", 10);
        weaponSkill = new WeaponSkill("中毒了",2);
    }
    @Test
    public void should_return_can_attack_no_weapon_and_posion_damage(){
        assertThat(soldier.attack(person), is("战士张三攻击了普通人李四，李四受到了10点伤害，李四剩余生命：90"));
    }

    @Test
    public void should_return_can_attack_with_weapon_but_no_posion(){
        soldier.wearWeapon(weapon);
        assertThat(soldier.attack(person), is("战士张三用屠龙刀攻击了普通人李四，李四受到了20点伤害，李四剩余生命：80"));
    }

    @Test
    public void should_return_weaponSkill_damage(){
        soldier.wearWeapon(weapon);
        assertThat(soldier.beSkillAttacked(person,weaponSkill), is("李四受到2点毒性伤害, 李四剩余生命：98"));
    }

    @Test
    public void should_return_can_attack_with_weapon_when_weapon_has_posion_damage(){
        soldier.wearWeapon(weapon);
        assertThat(soldier.attack(person)+"，"+soldier.beSkillAttacked(person, weaponSkill), is("战士张三用屠龙刀攻击了普通人李四，" +
                "李四受到了20点伤害，李四中毒了，李四剩余生命：80，李四受到2点毒性伤害, 李四剩余生命：78"));
    }
}
