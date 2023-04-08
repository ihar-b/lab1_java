import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompactCircularSawTest {

    private CompactCircularSaw compactCircularSaw;

    @BeforeEach
    void setUp() {
        compactCircularSaw = new CompactCircularSaw(10, "Brand", 100, 500, 5.0, false);
    }

    @Test
    void testStart() {
        compactCircularSaw.start();
        Assertions.assertTrue(compactCircularSaw.isWorking());
    }

    @Test
    void testStop() {
        compactCircularSaw.stop();
        Assertions.assertFalse(compactCircularSaw.isWorking());
    }

    @Test
    void testGetRemainingWorkTimeWhileWorking() {
        compactCircularSaw.start();
        int remainingTime = compactCircularSaw.getRemainingWorkTime();
        Assertions.assertFalse(remainingTime > 0 && remainingTime <= 10);
    }

    @Test
    void testGetRemainingWorkTimeWhileNotWorking() {
        int remainingTime = compactCircularSaw.getRemainingWorkTime();
        Assertions.assertEquals(0, remainingTime);
    }

    @Test
    void testToString() {
        String expectedString = "brand: Brand power: 100 isWorking: false batteryCapacity: 500 radius: 5.0 timeWorking: 10";
        String actualString = compactCircularSaw.toString();
        Assertions.assertEquals(expectedString, actualString);
    }

    @Test
    void testConstructorWithParameters() {
        CompactCircularSaw saw = new CompactCircularSaw(5, "Brand", 50, 250, 3.0, true);
        Assertions.assertEquals("Brand", saw.getBrand());
        Assertions.assertEquals(50, saw.getPower());
        Assertions.assertEquals(250, saw.getBatteryCapacity());
        Assertions.assertEquals(3.0, saw.getRadius());
        Assertions.assertEquals(5, saw.getTimeWorking());
        Assertions.assertTrue(saw.isWorking());
    }

    @Test
    void testSetRadius() {
        compactCircularSaw.setRadius(4.0);
        Assertions.assertEquals(4.0, compactCircularSaw.getRadius());
    }

    @Test
    void testSetBatteryCapacity() {
        compactCircularSaw.setBatteryCapacity(1000);
        Assertions.assertEquals(1000, compactCircularSaw.getBatteryCapacity());
    }
}
