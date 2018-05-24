import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttackerTest {

    Attacker attacker;

        @Before
        public void before(){
        attacker = new Attacker("Goal Attack");
        }

        @Test
        public void hasPosition(){
            assertEquals("Goal Attack", attacker.getPosition());
        }

        @Test
        public void canShoot(){
            attacker.shoot(5);
            assertEquals(5, attacker.getGoalsScored());
        }
}

