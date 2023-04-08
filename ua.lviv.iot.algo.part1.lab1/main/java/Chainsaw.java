import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString


public class Chainsaw extends Saw {

    private int fuelTankCapacity;
    private double fuelLevel;

    public Chainsaw(int timeWorking, String brand, int power, int fuelTankCapacity, double fuelLevel, boolean isWorking) {
        super(brand, power, timeWorking, isWorking);
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelLevel = fuelLevel;
    }


    public String toString() {
        return "brand: " + brand + " power: " + power + " fuelTankCapacity: " + fuelTankCapacity + " fuelLevel: " + fuelLevel + " isWorking: " + isWorking + " timeWorking: " + timeWorking;
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
        if (isWorking) {
            System.out.println("Remaining: " + timeWorking * (fuelLevel / fuelTankCapacity) + " hours");

        } else {
            System.out.println("Not working");
        }
        return 0;
    }

    public void cutWood(double length) {
        fuelLevel -= length * 0.1;
        if (fuelLevel == 0) {
            isWorking = false;
        }
    }


}

