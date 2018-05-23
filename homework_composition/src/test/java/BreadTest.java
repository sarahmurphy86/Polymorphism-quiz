import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BreadTest {
    Bread bread;

    @Before
    public void before(){
        bread = new Bread("wholemeal");
    }

    @Test
    public void getName() {
        assertEquals("wholemeal",bread.getName());
    }
}
