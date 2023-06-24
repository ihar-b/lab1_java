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

public final class BandSaw extends Saw {
    private double amperage;
    private int batteryCapacity;

    public BandSaw(final int timeWorking, final String brand,
                   final int power, final int batteryCapacity,
                   final double amperage, final boolean isWorking) {
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
    public double getRemainingWorkTime() {

        return 0.0;
    }

    public String toString() {
        return "brand: " + brand + " power: " + power + " isWorking: "
                + isWorking + " batteryCapacity: " + batteryCapacity
                + " amperage: " + amperage + " timeWorking: " + timeWorking;
    }

    public String getHeaders() {
        return "brand, power, isWorking, batteryCapacity, amperage, timeWorking";
    }

    public String toCSV() {
        return  brand + "," +
                power + "," +
                isWorking + "," +
                batteryCapacity + "," +
                amperage + "," +
                timeWorking + ",";

    }
}
