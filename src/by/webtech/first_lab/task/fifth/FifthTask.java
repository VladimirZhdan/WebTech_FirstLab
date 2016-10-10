package by.webtech.first_lab.task.fifth;

import java.util.*;

/**
 * Created by Vladimir on 09.10.2016.
 */
public class FifthTask {
    public static void main(String[] args) {
        if(args.length > 0) {
            int lengthMass;
            try {
                lengthMass = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Error! Uncorrect numbers format.");
                return;
            }
            desicion(lengthMass);
        }
        else {
            System.out.println("Too few arguments");
        }
    }

    public static void desicion(int lengthMass) {
        int[] randomMass = generateRandomMass(lengthMass);
        int minCount = searchMinCountOfRemoves(randomMass);
        outputMassWithMessage("Initial array", randomMass);
        System.out.println("min count = " + minCount);
    }


    public static int[] generateRandomMass(int length) {
        Random random = new Random();
        int[] resultRandomMass = new int[length];
        for(int i = 0; i < length; i++) {
            resultRandomMass[i] = random.nextInt(1000);
        }
        return resultRandomMass;
    }

    public static int searchMinCountOfRemoves(int[] mass) {
        Integer result = mass.length - 1;
        int previousCount;
        ArrayList<Integer> checkedIndex = new ArrayList<>();

        for(int i = 0; i < mass.length - 1; i++) {
            if(!checkedIndex.contains(i)) {
                int currentCount = findNextMin(i, mass, checkedIndex);
                result = chooseMinElem(result, currentCount);
            }
        }
        return result;
    }

    private static int findNextMin(int start, int[] mass, ArrayList<Integer> checkedIndex) {
        int currentCount = start;
        int currentElem = mass[start];
        for(int j = start + 1; j < mass.length; j++) {
            if(currentElem <= mass[j]) {
                currentElem = mass[j];
                checkedIndex.add(j);
            }
            else {
                currentCount++;
            }
        }
        return currentCount;
    }

    private static int chooseMinElem(int firstValue, int secondValue) {
        if(firstValue < secondValue) {
            return firstValue;
        }
        else
            return secondValue;
    }

    private static void outputMassWithMessage(String message, int[] mass) {
        System.out.print(message + ": ");
        if (mass != null) {
            for (int i = 0; i < mass.length; i++) {
                System.out.print(mass[i] + "; ");
            }
        }
        System.out.println();
    }
}
