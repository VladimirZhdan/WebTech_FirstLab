package by.webtech.first_lab.task.eighth;

import java.util.*;

/**
 * Created by Vladimir on 02.10.2016.
 */
public class Output {
    public void outputIntegerArrayListWithMessage(String message, ArrayList<Integer> arrayList) {
        System.out.print(message + ": ");
        if(arrayList != null) {
            for(int i = 0; i < arrayList.size(); i++) {
                System.out.format("%d; ", arrayList.get(i));
            }
        }
        System.out.println();
    }

    public void outputDoubleArrayListWithMessage(String message, ArrayList<Double> arrayList) {
        System.out.print(message + ": ");
        if(arrayList != null) {
            for(int i = 0; i < arrayList.size(); i++) {
                System.out.format("%.3f; ", arrayList.get(i));
            }
        }
        System.out.println();
    }


}
