import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HamTest {
    Ham ham;

    @Before
    public void before(){
        ham = new Ham("Serrano");
    }

    @Test
    public void getName() {
        assertEquals("Serrano",ham.getName());
    }
}
