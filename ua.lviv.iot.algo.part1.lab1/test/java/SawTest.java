import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SawTest {

    @Test
    void testStart() {
        Saw saw = new ElectricSaw(10, "Brand1", 1200, 100, "Type1", false);
        saw.start();
        assertTrue(saw.isWorking());
    }

    @Test
    void testStop() {
        Saw saw = new ElectricSaw(10, "Brand2", 1500, 150, "Type2", true);
        saw.stop();
        assertFalse(saw.isWorking());
    }

    @Test
    void testGetRemainingWorkTimeWhileWorking() {
        Saw saw = new ElectricSaw(10, "Brand3", 2000, 200, "Type3", true);
        int remainingTime = saw.getTimeWorking() - saw.getTimeWorking() * saw.getPower() ;
        assertEquals("Remaining: " + remainingTime + " hours", saw.getRemainingWorkTime());
    }

    @Test
    void testGetRemainingWorkTimeWhileNotWorking() {
        Saw saw = new ElectricSaw(10, "Brand4", 1800, 120, "Type4", false);
        assertEquals("Not working", saw.getRemainingWorkTime());
    }

    @Test
    void testCutWood() {
        Chainsaw saw = new Chainsaw(8, "Brand5", 1700, 200, 100, true);
        saw.cutWood(2.5);
        assertEquals(99.75, saw.getFuelLevel());
    }

}
