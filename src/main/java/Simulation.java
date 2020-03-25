import java.util.Random;
import java.util.logging.Logger;

public class Simulation {

    private Integer numberOfDie;
    private Integer numberOfThrows;

    Bins bin;
    Dice dice;

    private static final Logger LOGGER = Logger.getLogger(Simulation.class.getName());

    public Simulation(Integer dieToToss, Integer numberOfTosses){
        dice = new Dice(dieToToss);
        bin = new Bins(dieToToss, numberOfTosses);
        this.numberOfDie = dieToToss;
        this.numberOfThrows = numberOfTosses;
    }

    public void Simulator() {
        Random randomNumber = new Random();

        for(int i = 0; i < numberOfThrows; i++){
            bin.nextBin(dice.tossAndSum());
        }
    }

    public void showResults(){
        LOGGER.info("\n***\n" + "Simulation of " + numberOfDie + "dice tossed for " + numberOfThrows + " times.\n");

        String stringReturn = "\n";

        for(int i = numberOfDie; i <= numberOfDie * 6; i++){
            double number = (double)(bin.diceSum.get(i)) / (double)(numberOfThrows);
            int numberOfStars = bin.diceSum.get(i);
            String stars = "";
            String stringFormatted = String.format("%3d", i);
            String formattedRolls = String.format("%10d", bin.diceSum.get(i));
            String formattedNumber = String.format("%.2f", number);
            for(int j = 0; j < numberOfStars; j++){
                stars += "*";
            }
            stringReturn += stringFormatted + " : " + formattedRolls + ": " + formattedNumber + " " + stars + "\n";
        }

        LOGGER.info(stringReturn);
    }

    public void setDice(Integer number){
        this.numberOfDie = number;
    }

    public Integer getDiceNumber(){
        return numberOfDie;
    }

    public void setTosses(Integer number){
        this.numberOfThrows = number;
    }

    public Integer getTosses(){
        return numberOfThrows;
    }

    public static void main(String[] args){
        Simulation diceRolls = new Simulation(2, 1000000);
        diceRolls.Simulator();
        diceRolls.showResults();
    }
}
