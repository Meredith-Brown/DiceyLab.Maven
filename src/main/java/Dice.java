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
        Integer sum = 0;
        for(int i = 1; i <= numberOfDice; i++) {
            sum += ((int) ((Math.random() * (numberOfSides - 1)) + 1));
        }
        return sum;
    }
}
