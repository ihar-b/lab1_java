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

public class CompactCircularSaw extends Saw{
    private double radius;
    private int batteryCapacity;
    public CompactCircularSaw(int timeWorking, String brand,int power, int batteryCapacity, double radius, boolean isWorking){
        super(brand, power, timeWorking, isWorking );
        this.radius = radius;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void Start(){
        isWorking = true;
    }
    @Override
    public void Stop(){
        isWorking = false;
    }
    @Override
    public void getRemainingWorkTime(){
        if(isWorking){
            System.out.println("Remaining: " + (timeWorking - timeWorking*power/batteryCapacity) +" hours");
        }
        else{
            System.out.println("Not working");
        }

    }
    public  String toString() {
        return "brand: " + brand + " power: " + power  + " isWorking: " + isWorking +
                " batteryCapacity: " + batteryCapacity + " radius: "+ radius + " timeWorking: "+ timeWorking;
    }


}
