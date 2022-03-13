
public class Bins {
    public int minimumTossSum;
    public int maximumTossSum;
    public int[] binsArray; // stores count of # of 10s(example) rolled

    // may need to add additional methods

    public Bins(int minimumTossSum, int maximumTossSum) {
        this.minimumTossSum = minimumTossSum;
        this.maximumTossSum = maximumTossSum;
        binsArray = new int[maximumTossSum - minimumTossSum + 1];
    }

    public int getBin(int binNumber) {
        return binsArray[binNumber - (minimumTossSum)];
    }

    public void incrementBin(int binNumber) {
        binsArray[binNumber - (minimumTossSum)] += 1;
    }
}
