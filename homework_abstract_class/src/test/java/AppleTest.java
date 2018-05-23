import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppleTest {

    Apple apple;

    @Before
    public void before(){
        apple = new Apple("Golden Delicious");

    }
    @Test
    public void hasName(){
        assertEquals("Golden Delicious", apple.getName());
    }
}
