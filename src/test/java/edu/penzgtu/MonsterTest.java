package edu.penzgtu;

import edu.penzgtu.entities.Monster;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MonsterTest {

    @Test
    void testMonsterCreation() {
        Monster monster = new Monster("Goblin", 50, 10, false);

        assertEquals("Goblin", monster.getName());
        assertEquals(50, monster.getHealth());
        assertEquals(10, monster.getDamage());
        assertFalse(monster.isBoss());
    }

    @Test
    void testBossMonsterCreation() {
        Monster boss = new Monster("Dragon", 200, 30, true);

        assertEquals("Dragon", boss.getName());
        assertEquals(200, boss.getHealth());
        assertEquals(30, boss.getDamage());
        assertTrue(boss.isBoss());
    }

    @Test
    void testMonsterToString() {
        Monster monster = new Monster("Slime", 25, 5, false);
        assertEquals("Название: Slime", monster.toString());
    }

    @Test
    void testMonsterWithZeroDamage() {
        Monster weakMonster = new Monster("Tiny Slime", 10, 0, false);

        assertEquals("Tiny Slime", weakMonster.getName());
        assertEquals(10, weakMonster.getHealth());
        assertEquals(0, weakMonster.getDamage());
        assertFalse(weakMonster.isBoss());
    }

    @Test
    void testMonsterWithZeroHealth() {
        Monster deadMonster = new Monster("Skeleton", 0, 15, false);

        assertEquals("Skeleton", deadMonster.getName());
        assertEquals(0, deadMonster.getHealth());
        assertEquals(15, deadMonster.getDamage());
        assertFalse(deadMonster.isBoss());
    }

}
