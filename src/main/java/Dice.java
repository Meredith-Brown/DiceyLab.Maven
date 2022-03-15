import java.util.Random;

public class Dice {
    public int numberOfSides;
    public int numberOfDice;

    // may need to add additional methods

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
        numberOfSides = 6;
    }

    public Dice(int numberOfDice, int numberOfSides) {
        this.numberOfDice = numberOfDice;
        this.numberOfSides = numberOfSides;
    }

    public Integer tossAndSum() {
        Random random = new Random();
        int sum = 0;
        for(int i = 1; i <= numberOfDice; i++) {
            sum += (random.nextInt(6) + 1); // (((Math.random() * ((double) numberOfSides - 1.0)) + 1.0));
        }
        // int sumInt = (int) Math.round(sum); // rounding issues are causing an incorrect distribution
        return sum;
    }

    public int findMinimumTossSum() {
        return numberOfDice; // assumes dice faces show 1 - numberOfSides (so lowest is 1)
    }

    public int findMaximumTossSum() {
        return numberOfDice * numberOfSides; // assumes dice faces show 1 - numberOfSides (so highest is numberOfSides)
    }
}
