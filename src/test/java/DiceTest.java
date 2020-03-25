import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testNumberOfDice() {
        Simulation roll = new Simulation(2, 12);
        Integer expected = 2;
        roll.setDice(2);
        Integer actual = roll.getDiceNumber();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tossAndSumTest(){
        Dice dice = new Dice(2);
        Integer actual = dice.tossAndSum();
        boolean expected = (actual > 0 && actual < 7);

    }

}