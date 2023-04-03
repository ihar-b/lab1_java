import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.AllArgsConstructor;
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor


public class Chainsaw {
    private  String brand;
    private  int power;
    private  int fuelTankCapacity;
    private  double fuelLevel;
    private  boolean isWorking = false;

    public  String toString() {
        return "brand: " + brand + " power: " + power + " fuelTankCapacity: " + fuelTankCapacity + " fuelLevel: " + fuelLevel + " isWorking: " + isWorking;
    }

    public  void start() {
        isWorking = true;
    }

    public  void stop() {
        isWorking = false;
    }

    public  void cutWood(double length) {
        fuelLevel -= length*0.1;
        if (fuelLevel == 0) {
            isWorking = false;
        }
    }
static Chainsaw instance = new Chainsaw();
    public static Chainsaw getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Chainsaw chainsaw1 = new Chainsaw();
        Chainsaw chainsaw2 = new Chainsaw("SuperCh", 1000, 10, 1.0, false);
        Chainsaw chainsaw3 = Chainsaw.getInstance();
        Chainsaw chainsaw4 = Chainsaw.getInstance();
        Chainsaw[] chainsaws = {chainsaw1, chainsaw2, chainsaw3, chainsaw4};
        chainsaw2.start();
        chainsaw2.cutWood(10.0);


for(int i= 0; i< chainsaws.length; i++){
    System.out.println(chainsaws[i]);


        }

    }
}