package by.webtech.first_lab.task.seventh;

import java.util.Random;

/**
 * Created by Vladimir on 01.10.2016.
 */
public class SeventhTask {
    public static void main(String[] args) {
        if(args.length == 0) {
            Integer lengthMass;
            try {
                //lengthMass = Integer.parseInt(args[0]);
                lengthMass = 10;
            }
            catch (NumberFormatException e) {
                System.out.println("Error! Uncorrect numbers format.");
                return;
            }
            desicionShellSortMass(lengthMass);
        }
        else {
            System.out.println("Too few arguments");
        }
    }

    private static void desicionShellSortMass(Integer lengthMass) {
        Double[] initialRandomMass = generateRandomMass(lengthMass);
        Double[] sortedMass = shellSortMass(initialRandomMass);
        outputMassWithMessage("Initial mass", initialRandomMass);
        outputMassWithMessage("Sorted mass", sortedMass);
    }

    private static Double[] generateRandomMass(Integer length) {
        Random random = new Random();
        Double[] resultRandomMass = new Double[length];
        for(int i = 0; i < length; i++) {
            resultRandomMass[i] = random.nextInt(100) + random.nextDouble();
        }
        return resultRandomMass;
    }

    public static Double[] shellSortMass(Double[] mass) {
        Double[] sortedMass = mass.clone();
        int i = 0;
        while(i < sortedMass.length - 1) {
            boolean firstElem = (i == 0);
            if(sortedMass[i] <= sortedMass[i + 1]) {
                i++;
            }
            else {
               swap(sortedMass, i, i + 1);
               if(i > 0) {
                   i--;
               }
            }
        }
        return sortedMass;
    }

    private static void swap(Double[] mass, int indexFirst, int indexSecond) {
        Double temp = mass[indexFirst];
        mass[indexFirst] = mass[indexSecond];
        mass[indexSecond] = temp;
    }

    private static void outputMassWithMessage(String message, Double[] mass) {
        System.out.print(message + ": ");
        if(mass != null) {
            for(int i = 0; i < mass.length; i++) {
                System.out.format("%.3f; ", mass[i]);
            }
        }
        System.out.println();
    }




}
