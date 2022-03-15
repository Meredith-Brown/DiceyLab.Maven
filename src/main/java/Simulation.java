import java.util.Arrays;

public class Simulation {
    public int numberOfDiesToThrow;
    public int numberOfTossesToRun;

    public Simulation(int numberOfDiesToThrow, int numberOfTossesToRun) {
        this.numberOfDiesToThrow = numberOfDiesToThrow;
        this.numberOfTossesToRun = numberOfTossesToRun;
    }

    public static void main(String args[]) {
        Simulation simulation = new Simulation(2, 1000000);
        int[] results = simulation.simulateDiceToss();
        System.out.println(Arrays.toString(results));
    }

    public int[] simulateDiceToss() {
        Dice dice = new Dice(2,6);
        int minimum = numberOfDiesToThrow;
        int maximum = numberOfDiesToThrow * 6;
        Bins bins = new Bins(minimum, maximum);
        for(int i = 1; i <= numberOfTossesToRun; i++) {
            int sum = dice.tossAndSum();
            bins.incrementBin(sum);
        }
        return bins.binsArray;
    }
}
