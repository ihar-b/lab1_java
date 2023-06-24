import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString


public final class Chainsaw extends Saw {

    private int fuelTankCapacity;
    private double fuelLevel;

    public Chainsaw(final int timeWorking, final String brand,
                    final int power, final int fuelTankCapacity,
                    final double fuelLevel, final boolean isWorking) {
        super(brand, power, timeWorking, isWorking);
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelLevel = fuelLevel;
    }


    public String toString() {
        return "brand: " + brand + " power: " + power + " fuelTankCapacity: "
                + fuelTankCapacity + " fuelLevel: " + fuelLevel + " isWorking: "
                + isWorking + " timeWorking: " + timeWorking;
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
        double remainingWorkTime = timeWorking * (fuelLevel / fuelTankCapacity);
        return remainingWorkTime;
    }

    public void cutWood(double length) {
        double coefficient = 0.1;
        fuelLevel -= length * coefficient;
        if (fuelLevel == 0) {
            isWorking = false;
        }
    }
    public String getHeaders() {
        return "brand, power, isWorking, fuelTankCapacity, fuelLevel, timeWorking";
    }

    public String toCSV() {
        return  brand + "," +
                power + "," +
                isWorking + "," +
                fuelTankCapacity + "," +
                fuelLevel + "," +
                timeWorking + ",";

    }

}

