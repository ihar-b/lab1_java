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

public final class CompactCircularSaw extends Saw {
    private double radius;
    private int batteryCapacity;

    public CompactCircularSaw(final int timeWorking, final String brand,
                              final int power, final int batteryCapacity,
                              final double radius, final boolean isWorking) {
        super(brand, power, timeWorking, isWorking);
        this.radius = radius;
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
        return timeWorking - (timeWorking * power / batteryCapacity);
    }

    public String toString() {
        return "brand: " + brand + " power: " + power + " isWorking: "
                + isWorking + " batteryCapacity: " + batteryCapacity
                + " radius: " + radius + " timeWorking: " + timeWorking;
    }
    public String getHeaders() {
        return "brand, power, isWorking, batteryCapacity, radius, timeWorking";
    }

    public String toCSV() {
        return  brand + "," +
                power + "," +
                isWorking + "," +
                batteryCapacity + "," +
                radius + "," +
                timeWorking + ",";

    }


}
