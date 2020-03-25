import java.util.Random;
import java.util.logging.Logger;

public class Dice {
    public Integer numDice;

    private static final Logger LOGGER = Logger.getLogger(Dice.class.getName());

    public Dice(Integer numDice){
        this.numDice = numDice;
    }

    public Integer tossAndSum(){
        Random random = new Random();
        Integer sum = 0;
        for(int i = 0; i < numDice; i++){
            sum+= random.nextInt(6)+1;
        }
        return sum;
    }

    public Integer maxNum(){
        return numDice * 6;
    }

    public Integer minNum(){
        return numDice;
    }
}
