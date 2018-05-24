import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefenderTest {

    Defender defender;

    @Before
    public void before(){
        defender = new Defender("Goal Defence");
    }

    @Test
    public void hasPosition(){
        assertEquals("Goal Defence", defender.getPosition());
    }
}
