import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@NoArgsConstructor
@Getter
@AllArgsConstructor

public class BandSaw extends Saw {
    private double amperage;
    private int batteryCapacity;

    public BandSaw(int timeWorking, String brand, int power, int batteryCapacity, double amperage, boolean isWorking) {
        super(brand, power, timeWorking, isWorking);
        this.amperage = amperage;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void start() {
        isWorking = true;
    }

    @Override
    public void stop() {
        isWorking = false;
    }

    @Override
    public int getRemainingWorkTime() {

        return 0;
    }

    public String toString() {
        return "brand: " + brand + " power: " + power + " isWorking: " + isWorking +
                " batteryCapacity: " + batteryCapacity + " amperage: " + amperage + " timeWorking: " + timeWorking;
    }


}
