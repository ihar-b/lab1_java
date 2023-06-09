import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChainsawTest {
    @Test
    void testStart() {
        Chainsaw chainsaw = new Chainsaw(10, "Brand X", 100, 5, 3.0, false);
        chainsaw.start();
        assertTrue(chainsaw.isWorking());
    }

    @Test
    void testStop() {
        Chainsaw chainsaw = new Chainsaw(10, "Brand X", 100, 5, 3.0, true);
        chainsaw.stop();
        assertFalse(chainsaw.isWorking());
    }
  @Test
  void testGetRemainingWorkTime() {
      Chainsaw chainsaw = new Chainsaw(10, "Brand X", 100, 5, 3.0, true);
      final double trueRemainingWorkTime = 6.0;
  assertEquals(trueRemainingWorkTime, chainsaw.getRemainingWorkTime());
    }
    @Test
    void testCutWood() {
        Chainsaw chainsaw = new Chainsaw(10, "Brand X", 100, 5, 3.0, true);
        chainsaw.cutWood(1.0);
        assertEquals(2.9, chainsaw.getFuelLevel(), 0.01);
    }

    @Test
    void testCutWoodWithEmptyFuelTank() {
        Chainsaw chainsaw = new Chainsaw(10, "Brand X", 100, 5, 0.1, true);
        chainsaw.cutWood(1.0);
        assertFalse(chainsaw.isWorking());
    }

}
