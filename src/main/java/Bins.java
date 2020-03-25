import java.util.ArrayList;
import java.util.logging.Logger;

public class Bins {

    private Integer maxDie;
    private Integer minDie;

    public ArrayList<Integer> diceSum;

    private static final Logger LOGGER = Logger.getLogger(Bins.class.getName());

    public Bins(Integer minDie, Integer maxDie){
        diceSum = new ArrayList<>();
        this.minDie = minDie;
        this.maxDie = maxDie;
        for(int i = 0; i <= minDie; i++){
            diceSum.add(0);
        }
    }

    public void nextBin(Integer index){
        Integer number = diceSum.get(index);
        number++;
        diceSum.set(index, number);
    }
}
