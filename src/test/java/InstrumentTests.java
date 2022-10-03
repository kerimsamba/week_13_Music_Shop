import Instruments.Guitar;
import Instruments.Instrument;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InstrumentTests {

    Guitar guitar;
    Trumpet trumpet;

    @Before
    public void before() {
        guitar = new Guitar("Stratocaster", 500, 1000, "Braaannng!", 6);
        trumpet = new Trumpet("Yamaha", 1000, 1500, "Parp!", 3);

    }

    @Test
    public void guitarHasName() {
        assertEquals("Stratocaster", guitar.getName());
    }

    @Test
    public void guitarHasTradePrice() {
        assertEquals(500, guitar.getTradePrice());
    }

    @Test
    public void guitarHasRetailPrice() {
        assertEquals(1000, guitar.getRetailPrice());
    }

    @Test
    public void guitarCanBePlayed() {
        assertEquals("Braaannng!", guitar.play());
    }

    @Test
    public void guitarHasStrings() {
        assertEquals(6, guitar.getGuitarString());
    }

    @Test
    public void guitarSold() {
        assertEquals(500, guitar.sell());
    }

    @Test
    public void trumpetCanBePlayed() {
        assertEquals("Parp!", trumpet.play());
    }


}
