import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor


public class Chainsaw extends Saw{

    private  int fuelTankCapacity;
    private  double fuelLevel;

public Chainsaw(int timeWorking, String brand,int power, int fuelTankCapacity, double fuelLevel , boolean isWorking){
    super(brand, power, timeWorking, isWorking );
    this.fuelTankCapacity = fuelTankCapacity;
    this.fuelLevel = fuelLevel;


}
    public  String toString() {
        return "brand: " + brand + " power: " + power + " fuelTankCapacity: " + fuelTankCapacity + " fuelLevel: " + fuelLevel + " isWorking: " + isWorking +" timeWorking: "+ timeWorking;
    }

    @Override
    public  void Start() {
        isWorking = true;
    }
@Override
    public  void Stop() {
        isWorking = false;
    }

@Override
    public void getRemainingWorkTime() {
        if(isWorking){
            System.out.println("Remaining: " + timeWorking*(fuelLevel/fuelTankCapacity) + " hours");

        }
        else{
            System.out.println("Not working");
        }
    }

    public  void cutWood(double length) {
        fuelLevel -= length*0.1;
        if (fuelLevel == 0) {
            isWorking = false;
        }
    }


    }

