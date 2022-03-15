import java.util.Arrays;

import java.text.DecimalFormat;

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
        simulation.printSimulation(results);
        // System.out.println(Arrays.toString(results));
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

    public void printSimulation(int[] simulationResults) {
        System.out.println("***");
        System.out.println("Simulation of " + numberOfDiesToThrow + " dice tossed for " + numberOfTossesToRun
         + " times.");
        System.out.println("***" + "\n");
        StringBuilder sb = new StringBuilder();
        for (int i = numberOfDiesToThrow; i <= numberOfDiesToThrow * 6; i++) {
            sb.append(String.format("%3d", i) + ": " +
                    String.format("%8d", simulationResults[i - numberOfDiesToThrow]) + ":  " +
                    (Math.round((((double) simulationResults[i - numberOfDiesToThrow] /
                            (double) numberOfTossesToRun)) * 100)) / 100.00 + " ");
            if (((Math.round((((double) simulationResults[i - numberOfDiesToThrow] /
                    (double) numberOfTossesToRun)) * 100)) / 100.00) > 0.00) {
                for (int j = 1; j <= (Math.round((((double) simulationResults[i - numberOfDiesToThrow] /
                        (double) numberOfTossesToRun)) * 100)); j++) {
                    sb.append("*");
                }
            }
            sb.append("\n");
            // System.out.println(String.format("%3d", i) + ": " +
                    // String.format("%8d", simulationResults[i - numberOfDiesToThrow]) + ":  " +
                    // (Math.round((((double) simulationResults[i - numberOfDiesToThrow] /
                            // (double) numberOfTossesToRun)) * 100)) / 100.00);
        }
        // System.out.println();
        String output = sb.toString();
        System.out.println(output);
    }
}
