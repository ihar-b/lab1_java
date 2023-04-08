import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString

public abstract class Saw {
    protected String brand;
    protected int power;
    protected int timeWorking;
    protected boolean isWorking = false;

 public abstract void start();

    public abstract void stop();

    public abstract int getRemainingWorkTime();
}
