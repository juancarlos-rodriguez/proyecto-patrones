package com.ucenfotec.patrones.testlogic;

import static org.junit.Assert.*;
import org.junit.Test;
import com.ucenfotec.patrones.logic.Enemy;
import com.ucenfotec.patrones.logic.Hero;
import com.ucenfotec.patrones.logic.GeneralManager;

public class CharacterTest {
    static GeneralManager managerTest = new GeneralManager();

    @Test
    public void createNewPlayerTest() {
        Hero newCharacter = new Hero("Kevin Martinez", 10, 10, 10);
        assertEquals("Kevin Martinez", newCharacter.getName());
    }

    @Test
    public void testAttack() {
        Hero newCharacter = new Hero("Kevin Martinez", 20, 25, 30);
        Enemy myEnemy = new Enemy("Dragón", 10, 8);
        assertEquals(-20, newCharacter.attack(myEnemy));
    }

}
