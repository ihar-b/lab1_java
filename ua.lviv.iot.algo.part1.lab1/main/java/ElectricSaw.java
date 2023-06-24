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

public class ElectricSaw extends Saw {
    private String type;
    private int batteryCapacity;
public ElectricSaw(int timeWorking, String brand, int power, int batteryCapacity, String type, boolean isWorking) {
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

    public int getRemainingWorkTime() {
        if (isWorking) {
            System.out.println("Remaining: " + (timeWorking - timeWorking * power / batteryCapacity) + " hours");
        } else {
            System.out.println("Not working");
        }

        return 0;
    }

    public String toString() {
        return "brand: " + brand + " power: " + power + " isWorking: " + isWorking +
                " batteryCapacity: " + batteryCapacity + " type: " + type + " timeWorking: " + timeWorking;
    }


}