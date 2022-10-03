import Accessories.Accessory;
import Accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AccessoryTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("Ernie Ball Slinkys", 3, 5, 6);
    }

    @Test
    public void accessoryHasName(){
        assertEquals("Ernie Ball Slinkys", guitarStrings.getName());
    }

    @Test
    public void accessoryHasTradePrice(){
        assertEquals(3, guitarStrings.getTradePrice() );
    }

    @Test
    public void accessoryHasRetailPrice(){
        assertEquals(5, guitarStrings.getRetailPrice() );
    }

    @Test
    public void guitarStringsHavePackSize(){
        assertEquals(6, guitarStrings.getPackSize());
    }

    @Test
    public void guitarStringsSold() {
        assertEquals(2, guitarStrings.sell());
    }

}
