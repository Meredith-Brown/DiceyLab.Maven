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
        double sum = 0;
        for(int i = 1; i <= numberOfDice; i++) {
            sum += (((Math.random() * ((double) numberOfSides - 1.0)) + 1.0));
        }
        int sumInt = (int) Math.round(sum);
        return sumInt;
    }

    public int findMinimumTossSum() {
        return numberOfDice; // assumes dice faces show 1 - numberOfSides (so lowest is 1)
    }

    public int findMaximumTossSum() {
        return numberOfDice * numberOfSides; // assumes dice faces show 1 - numberOfSides (so highest is numberOfSides)
    }
}
