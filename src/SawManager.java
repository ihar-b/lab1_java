import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
public class SawManager {
    private List<Saw> saws = new LinkedList<>();
    public void addSaws(Saw saw){
this.saws.add(saw);
    }
    public List<Saw> findSawsWithMorePowerThan(int power){
        return saws.stream().
                filter(saws -> saws.getPower() > power).
                collect(Collectors.toList());

    }
    public List<Saw> findSawsWithMoreTimeWorkingThan(int timeWorking){
        return saws.stream().
                filter(saws -> saws.getTimeWorking() > timeWorking).
                collect(Collectors.toList());}

    public static void main(String[] args) {
        System.out.println("All saws: ");
        SawManager SawManager = new SawManager();
        SawManager.addSaws(new Chainsaw(8,  "asus", 1000, 15, 5.0, false ));
        SawManager.addSaws(new Chainsaw(10,  "intel", 800, 10, 4.0, false ));
        SawManager.addSaws(new ElectricSaw(6,  "apple", 900, 3200, "el-4", false ));
        SawManager.addSaws(new ElectricSaw(10,  "msi", 500, 2200, "sc-1", false ));
        SawManager.addSaws(new BandSaw(5,  "philips", 1500, 4000, 2.8, false ));
        SawManager.addSaws(new BandSaw(5,  "razer", 1200, 3000, 3.2, false ));
        SawManager.addSaws(new CompactCircularSaw(2,  "logitech", 400, 1500, 16, false ));
        SawManager.addSaws(new CompactCircularSaw(4,  "hyperX", 200, 1000, 18, false ));


        for (Saw Saws : SawManager.saws) {
            System.out.println(Saws);}
        System.out.println("testing the remaining time method: ");
Chainsaw chainsaw1 = new Chainsaw(10,  "hator", 1000, 20, 5.0, false);
        System.out.println(chainsaw1);
        chainsaw1.Start();
        chainsaw1.getRemainingWorkTime();
ElectricSaw el1 = new ElectricSaw(10,  "samsung", 300, 3000, "sfd", true) ;
        System.out.println(el1);
        el1.getRemainingWorkTime();

        System.out.println("Finding all saws with power more than 500 W");
var findSawsWithMorePowerThan = SawManager.findSawsWithMorePowerThan(500);
        for (Saw saws:findSawsWithMorePowerThan) {
            System.out.println(saws);
        }
        System.out.println("Finding all saws with time working more than 6 hours");
var findSawsWithMoreTimeWorkingThan = SawManager.findSawsWithMoreTimeWorkingThan(6);
            for (Saw saw:findSawsWithMoreTimeWorkingThan) {
                System.out.println(saw);
    }
}
}