import Accessories.GuitarStrings;
import Instruments.Guitar;
import Instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ShopTests {


    Guitar guitar;
    GuitarStrings guitarStrings;
    Shop shop;


    @Before
    public void before() {
        shop = new Shop(500);
        guitar = new Guitar("Stratocaster", 500, 1000, "Braaannng!", 6);
        guitarStrings = new GuitarStrings("Ernie Ball Slinkys", 3, 5, 6);
    }

    @Test
    public void shopCanHaveMoney(){
        assertEquals(500, shop.getMoney());
    }

    @Test
    public void shopCanBuyInstrument(){
        shop.addToInstrumentStock(guitar);
        assertEquals(1, shop.getInstrumentStock().size());
    }

    @Test
    public void shopCanBuyAccessory(){
        shop.addToAccessoryStock(guitarStrings);
        assertEquals(1, shop.getAccessoryStock().size());
    }

    @Test
    public void shopCannotOverspend(){
        shop.addToInstrumentStock(guitar);
        shop.addToAccessoryStock(guitarStrings);
        assertEquals(0, shop.getAccessoryStock().size());

    }

}
