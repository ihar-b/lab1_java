import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BandSawTest {

    @Test
    void testStart() {
        BandSaw bandSaw = new BandSaw(10, "Brand", 100, 50, 10.5, false);
        bandSaw.start();
        Assertions.assertTrue(bandSaw.isWorking());
    }

    @Test
    void testStop() {
        BandSaw bandSaw = new BandSaw(10, "Brand", 100, 50, 10.5, true);
        bandSaw.stop();
        Assertions.assertFalse(bandSaw.isWorking());
    }

    @Test
    void testToString() {
        BandSaw bandSaw = new BandSaw(10, "Brand", 100, 50, 10.5, true);
        String expectedString = "brand: Brand power: 100 isWorking: true batteryCapacity: 50 amperage: 10.5 timeWorking: 10";
        Assertions.assertEquals(expectedString, bandSaw.toString());
    }

    @Test
    void testGetRemainingWorkTime() {
        BandSaw bandSaw = new BandSaw(10, "Brand", 100, 50, 10.5, true);
        Assertions.assertEquals(0, bandSaw.getRemainingWorkTime());
    }
    @Test
    public void testConstructor() {
        // Given
        int timeWorking = 10;
        String brand = "brand";
        int power = 100;
        int batteryCapacity = 50;
        double amperage = 2.0;
        boolean isWorking = false;


        BandSaw bandSaw = new BandSaw(timeWorking, brand, power, batteryCapacity, amperage, isWorking);


        assertEquals(timeWorking, bandSaw.getTimeWorking());
        assertEquals(brand, bandSaw.getBrand());
        assertEquals(power, bandSaw.getPower());
        assertEquals(batteryCapacity, bandSaw.getBatteryCapacity());
        assertEquals(amperage, bandSaw.getAmperage(), 0.001);
        assertEquals(isWorking, bandSaw.isWorking());
    }
    private BandSaw bandSaw;

    @BeforeEach
    void setUp() {
        bandSaw = new BandSaw(5, "Philips", 1500, 4000, 2.8, false);
    }

    @Test
    void testConstructorWithParameters() {
        assertEquals("Philips", bandSaw.getBrand());
        assertEquals(1500, bandSaw.getPower());
        assertEquals(5, bandSaw.getTimeWorking());
        assertEquals(4000, bandSaw.getBatteryCapacity());
        assertEquals(2.8, bandSaw.getAmperage(), 0.001);
        assertFalse(bandSaw.isWorking());
    }







    @Test
    void testGetAmperage() {
        assertEquals(2.8, bandSaw.getAmperage(), 0.001);
    }

    @Test
    void testSetAmperage() {
        bandSaw.setAmperage(3.0);
        assertEquals(3.0, bandSaw.getAmperage(), 0.001);
    }

    @Test
    void testGetBatteryCapacity() {
        assertEquals(4000, bandSaw.getBatteryCapacity());
    }

    @Test
    void testSetBatteryCapacity() {
        bandSaw.setBatteryCapacity(4500);
        assertEquals(4500, bandSaw.getBatteryCapacity());
    }
}
