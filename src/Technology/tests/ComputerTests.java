package Technology.tests;

import Technology.main.Computer;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ComputerTests {
    @Test
    public void constructorSetsValuesTest() {
        Computer myComputer = new Computer(3000, 5000, "2021");
        assertEquals(3000, myComputer.getScreenWidth());
        assertEquals(5000, myComputer.getScreenHeight());
        assertEquals("2021", myComputer.getManufactureYear());

    }

    @Test
    public void twoPlusTwoReturnsFour() {
        Computer myComputer = new Computer(3000, 5000, "2021");
        int result = myComputer.processTwoPlusTwo();
        assertEquals(4, result);

    }

}