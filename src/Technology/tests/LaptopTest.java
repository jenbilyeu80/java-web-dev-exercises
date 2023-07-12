package Technology.tests;

import Technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class LaptopTest {
    Laptop myLaptop;

    @Before
    public void beforeTests() {
        myLaptop = new Laptop(3000, 5000, "2021", true);
    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals(3000, this.myLaptop.getScreenWidth());
        assertEquals(5000, this.myLaptop.getScreenHeight());
        assertEquals("2021", this.myLaptop.getManufactureYear());
        assertEquals(true, this.myLaptop.getIntellijOpened());
    }

    @Test
    public void openIntelliJToTrue() {
        this.myLaptop.setIntelliJOpened(false);
        this.myLaptop.openIntellJ();
        assertEquals(true, this.myLaptop.getIntellijOpened());
    }
}



