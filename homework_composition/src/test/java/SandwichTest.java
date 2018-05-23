import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SandwichTest {
    Sandwich sandwich;
    Bread bread;
    Ham ham;

    @Before
    public void before(){
        bread =  new Bread("White");
        ham = new Ham("Pama");
        sandwich = new Sandwich(bread, ham, "Special");
    }

    @Test
    public void canGetName(){
        assertEquals("Special", sandwich.getName());
    }

    @Test
    public void canGetBread(){
        assertEquals(bread, sandwich.getBread());
    }

    @Test
    public void canGetHam(){
        assertEquals(ham, sandwich.getHam());
    }
}
