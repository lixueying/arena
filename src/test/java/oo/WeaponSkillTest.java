package oo;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by lixueying on 15/12/3.
 */
public class WeaponSkillTest {
    private Person person;
    private Soldier soldier;
    private Weapon weapon;
    private Poison poison;

    @Before
    public void setUp(){
        person = new Person("李四",100,10);
        soldier = new Soldier("张三",100,10);
        weapon = new Weapon("屠龙刀", 10);
        poison = new Poison("中毒了", 2);
    }

    @Test
    public void should_create_a_weapon_with_poison(){
        weapon.wearPoison(poison);
        assertThat(weapon.getExDamage(), is(poison.getPoisonDamage()));
    }

    @Test
    public void should_print_Soldier_attack_Person_with_Poison_damage(){
        weapon.wearPoison(poison);
        soldier.wearWeapon(weapon);
        assertThat(soldier.attack(person), is("战士张三用屠龙刀攻击了普通人李四，李四受到了20点伤害，" +
                "李四中毒了，李四剩余生命：80, 李四受到2点毒性伤害, 李四剩余生命: 78"));
    }
}
