package com.ucenfotec.patrones.testlogic;

import static org.junit.Assert.*;
import org.junit.Test;
<<<<<<< HEAD

=======
import com.ucenfotec.patrones.logic.Enemy;
import com.ucenfotec.patrones.logic.Hero;
>>>>>>> master
import com.ucenfotec.patrones.logic.GeneralManager;
import com.ucenfotec.personajes.Heroe;
import com.ucenfotec.personajes.Enemy;

public class CharacterTest {
    static GeneralManager managerTest = new GeneralManager();
    Heroe newHeroe = new Heroe("Kevin Martinez", 20, 25, 2);
    Enemy myEnemy = new Enemy("Dragón", 30, 8);
    
    @Test
    public void createNewPlayerTest() {
        Heroe newCharacter = new Heroe("Kevin Martinez", 10, 10, 10);
        assertEquals("Kevin Martinez", newCharacter.getName());
    }

    @Test
    public void testAttack() {
    	newHeroe.attack(myEnemy);
        assertEquals(28, myEnemy.getHealth());
        
    }
}
