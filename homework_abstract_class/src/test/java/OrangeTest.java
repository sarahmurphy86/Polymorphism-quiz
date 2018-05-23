import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrangeTest {
    Orange orange;

    @Before
    public void before(){
        orange = new Orange("Naval");
    }

    @Test
    public void hasName(){
        assertEquals("Naval", orange.getName());
    }
}
