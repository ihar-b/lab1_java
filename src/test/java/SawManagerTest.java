import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

public class SawManagerTest {

    private SawManager SawManager1;

    @BeforeEach
    public void setUp() {
        SawManager1 = new SawManager();
        List<Saw> saws = new ArrayList<>();
        saws.add(new Chainsaw(10, "intel", 800, 10, 4.0, false));
        saws.add(new Chainsaw(8, "asus", 1000, 15, 5.0, false));
        saws.add(new ElectricSaw(6, "apple", 900, 3200, "el-4", false));
        saws.add(new ElectricSaw(10, "msi", 500, 2200, "sc-1", false));
        SawManager1.setSaws(saws);
    }
    @Test
    public void addSaws() {
        SawManager1.addSaws(new Chainsaw(8, "acer", 1000, 15, 5.0, false));
        assertEquals(5, SawManager1.getSaws().size());
    }

    @Test
    void findSawsWithMorePowerThan() {
        boolean value = true;
        final int power = 500;
        List<Saw> resultList = SawManager1.findSawsWithMorePowerThan(power);
        for (Saw result : resultList) {
            value = value && result.getPower() > power;
        }
        assertTrue(value == true);
    }

    @Test
    void findSawsWithMoreTimeWorkingThan() {
        boolean value = true;
        final int timeWorking = 290;
        List<Saw> resultList = SawManager1.findSawsWithMoreTimeWorkingThan(timeWorking);
        for (Saw result : resultList) {
            value = value && result.getTimeWorking() > timeWorking;
        }
        assertTrue(value == true);
    }
}