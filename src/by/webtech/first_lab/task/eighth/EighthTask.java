package by.webtech.first_lab.task.eighth;

import java.util.*;

/**
 * Created by Vladimir on 02.10.2016.
 */
public class EighthTask {
    public static void main(String[] args) {
        if(args.length > 1) {
            int lengthFirstArray;
            int lengthInsertArray;
            try {
                lengthFirstArray = Integer.parseInt(args[0]);
                lengthInsertArray = Integer.parseInt(args[1]);
            }
            catch (NumberFormatException e) {
                System.out.println("Error! Uncorrect numbers format.");
                return;
            }
            desicionSearchInsertIndex(lengthFirstArray, lengthInsertArray);
        }
        else {
            System.out.println("Too few arguments");
        }
    }

    private static void desicionSearchInsertIndex(int lengthFirstArray, int lengthInsertArray) {
        ArrayList<Double> firstArray = generateRandomSortedMass(lengthFirstArray);
        ArrayList<Double> insertArray = generateRandomSortedMass(lengthInsertArray);
        Output output = new Output();
        output.outputDoubleArrayListWithMessage("Initial array A", firstArray);
        output.outputDoubleArrayListWithMessage("Initial array B", insertArray);

        ArrayList<Integer> insertIndexArray = searchInsertIndex(firstArray, insertArray);
        output.outputDoubleArrayListWithMessage("Result array A", firstArray);
        output.outputIntegerArrayListWithMessage("Insert index", insertIndexArray);
    }

    public static ArrayList<Integer> searchInsertIndex(ArrayList<Double> firstArray,  ArrayList<Double> insertArray) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while((i < firstArray.size()) && (j < insertArray.size())) {
            if(insertArray.get(j) < firstArray.get(i)) {
                Double insertValue = insertArray.get(j);
                insertElemInArray(insertValue, i, result, firstArray);
                j++;
            }
            i++;
        }
        while(j < insertArray.size()) {
            Double insertValue = insertArray.get(j);
            insertElemInArray(insertValue, i, result, firstArray);
            j++;
            i++;
        }
        if(result.size() > 0) {
            return result;
        }
        else
            return null;
    }

    private static void insertElemInArray(Double value, int index, ArrayList<Integer> indexArray, ArrayList<Double> arrayForInsert) {
        arrayForInsert.add(index, value);
        indexArray.add(index + 1);
    }

    private static ArrayList<Double> generateRandomSortedMass(int length) {
        Random random = new Random();
        ArrayList<Double> resultRandomMass = new ArrayList<Double>(length);
        for(int i = 0; i < length; i++) {
            Double nextValue = random.nextInt(100) + random.nextDouble();
            resultRandomMass.add(i, nextValue);
        }
        shellSortMass(resultRandomMass);
        return resultRandomMass;
    }

    private static void shellSortMass(ArrayList<Double> mass) {
        int i = 0;
        while(i < mass.size() - 1) {
            boolean firstElem = (i == 0);
            if(mass.get(i) <= mass.get(i + 1)) {
                i++;
            }
            else {
                swap(mass, i, i + 1);
                if(i > 0) {
                    i--;
                }
            }
        }
    }

    private static void swap(ArrayList<Double> mass, int indexFirst, int indexSecond) {
        Double temp = mass.get(indexFirst);
        Double insertValue = mass.get(indexSecond);
        mass.set(indexFirst, insertValue);
        mass.set(indexSecond, temp);
    }
}
