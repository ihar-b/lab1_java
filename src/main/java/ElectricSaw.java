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

public final class ElectricSaw extends Saw {
    private String type;
    private int batteryCapacity;

    public ElectricSaw(final int timeWorking, final String brand,
                       final int power, final int batteryCapacity,
                       final String type, final boolean isWorking) {
        super(brand, power, timeWorking, isWorking);
        this.type = type;
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
                + " type: " + type + " timeWorking: " + timeWorking;
    }
    public String getHeaders() {
        return "brand, power, isWorking, batteryCapacity, type, timeWorking";
    }

    public String toCSV() {
        return  brand + "," +
                power + "," +
                isWorking + "," +
                batteryCapacity + "," +
                type + "," +
                timeWorking + ",";

    }

}
