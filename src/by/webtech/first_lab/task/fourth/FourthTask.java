package by.webtech.first_lab.task.fourth;

import java.util.*;

/**
 * Created by Vladimir on 30.09.2016.
 */
public class FourthTask {
    public static void main(String[] args) {
        if(args.length > 0) {
            Integer lengthMass;
            try {
                lengthMass = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException e) {
                System.out.println("Error! Uncorrect numbers format.");
                return;
            }
            desicion(lengthMass);
        }
        else {
            System.out.println("Too few arguments");
        }
    }

    public static void desicion(Integer lengthMass) {
        Integer[] randomMass = generateRandomMass(lengthMass);
        Integer[] indexOfPrimeNumbers = searchIndexOfPrimeNumbersInArray(randomMass);
        outputMassWithMessage("Initial array", randomMass);
        outputMassWithMessage("Index of prime numbers in array", indexOfPrimeNumbers);
    }

    public static Integer[] generateRandomMass(Integer length) {
        Random random = new Random();
        Integer[] resultRandomMass = new Integer[length];
        for(int i = 0; i < length; i++) {
            resultRandomMass[i] = random.nextInt(1000);
        }
        return resultRandomMass;
    }

    public static Integer[] searchIndexOfPrimeNumbersInArray(Integer[] array) {
        ArrayList<Integer> searchIndex = new ArrayList<Integer>();

        for(int i = 0; i < array.length; i++) {
            if(isPrime(array[i]))
                searchIndex.add(i + 1);
        }

        if(searchIndex.size() > 0) {
            Integer[] result = new Integer[searchIndex.size()];
            result = searchIndex.toArray(result);
            return result;
        }
        else {
            return null;
        }
    }

    public static boolean isPrime(Integer number) {
        if(number % 2 == 0) {
            return false;
        }
        for(int i = 3; i*i <= number; i += 2) {
            if((number % i) == 0)
                return false;
        }
        return true;
    }

    public static void outputMassWithMessage(String message, Integer[] mass) {
        System.out.print(message + ": ");
        if(mass != null) {
            for(int i = 0; i < mass.length; i++) {
                System.out.print(mass[i] + "; ");
            }
        }
        System.out.println();
    }
}
