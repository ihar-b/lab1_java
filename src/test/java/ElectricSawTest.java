import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElectricSawTest {

    private ElectricSaw electricSaw;

    @BeforeEach
    void setUp() {
        electricSaw = new ElectricSaw(10, "Makita", 200, 2000, "Cordless", false);
    }

    @Test
    void testStart() {
        electricSaw.start();
        assertTrue(electricSaw.isWorking());
    }

    @Test
    void testStop() {
        electricSaw.stop();
        assertFalse(electricSaw.isWorking());
    }

    @Test
    void testGetRemainingWorkTime() {
        final double trueRemainingWorkTime = 9.0;
        assertEquals(trueRemainingWorkTime, electricSaw.getRemainingWorkTime());
    }
    @Test
    void testConstructor() {
        assertEquals(10, electricSaw.getTimeWorking());
        assertEquals("Makita", electricSaw.getBrand());
        assertEquals(200, electricSaw.getPower());
        assertEquals(2000, electricSaw.getBatteryCapacity());
        assertEquals("Cordless", electricSaw.getType());
        assertFalse(electricSaw.isWorking());
    }

    @Test
    void testSetType() {
        electricSaw.setType("Corded");
        assertEquals("Corded", electricSaw.getType());
    }

    @Test
    void testSetBatteryCapacity() {
        electricSaw.setBatteryCapacity(300);
        assertEquals(300, electricSaw.getBatteryCapacity());
    }
}
