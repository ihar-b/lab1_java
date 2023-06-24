import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElectricSawTest {

    private ElectricSaw saw;

    @BeforeEach
    void setUp() {
        saw = new ElectricSaw(10, "Makita", 1200, 200, "Cordless", false);
    }

    @Test
    void testStart() {
        saw.start();
        assertTrue(saw.isWorking());
    }

    @Test
    void testStop() {
        saw.stop();
        assertFalse(saw.isWorking());
    }

    @Test
    void testGetRemainingWorkTimeWhileWorking() {
        saw.start();
        int remainingTime = saw.getTimeWorking() - saw.getTimeWorking() * saw.getPower() / saw.getBatteryCapacity();
        assertEquals("Remaining: " + remainingTime + " hours", saw.getRemainingWorkTime());
    }

    @Test
    void testGetRemainingWorkTimeWhileNotWorking() {
        assertEquals("Not working", saw.getRemainingWorkTime());
    }

    @Test
    void testToString() {
        String expectedString = "brand: Makita power: 1200 isWorking: false batteryCapacity: 200 type: Cordless timeWorking: 10";
        assertEquals(expectedString, saw.toString());
    }

    @Test
    void testConstructor() {
        assertEquals(10, saw.getTimeWorking());
        assertEquals("Makita", saw.getBrand());
        assertEquals(1200, saw.getPower());
        assertEquals(200, saw.getBatteryCapacity());
        assertEquals("Cordless", saw.getType());
        assertFalse(saw.isWorking());
    }

    @Test
    void testSetType() {
        saw.setType("Corded");
        assertEquals("Corded", saw.getType());
    }

    @Test
    void testSetBatteryCapacity() {
        saw.setBatteryCapacity(300);
        assertEquals(300, saw.getBatteryCapacity());
    }
}
