
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Setter;
import lombok.Getter;

public final class SawManager {
    @Setter
    @Getter
    private List<Saw> saws = new LinkedList<>();
    public void addSaws(Saw saw) {
        this.saws.add(saw);
    }

    public List<Saw> findSawsWithMorePowerThan(final int power) {
        return saws.stream().
                filter(saws -> saws.getPower() > power).
                collect(Collectors.toList());

    }

    public List<Saw> findSawsWithMoreTimeWorkingThan(final int timeWorking) {
        return saws.stream().
                filter(saws -> saws.getTimeWorking() > timeWorking).
                collect(Collectors.toList());
    }
}
