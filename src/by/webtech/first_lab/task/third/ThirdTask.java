package by.webtech.first_lab.task.third;

import java.util.*;

/**
 * Created by Vladimir on 27.09.2016.
 */
public class ThirdTask {

    public static void main(String[] args) {
        Double a;
        Double b;
        Double h;
        if(args.length > 2) {
            try {
                a = Double.parseDouble(args[0]);
                b = Double.parseDouble(args[1]);
                h = Double.parseDouble(args[2]);
            }
            catch (NumberFormatException e) {
                System.out.println("Error! Uncorrect numbers format.");
                return;
            }
            if(checkRightParams(a, b)) {
                desicion(a, b, h);
            }
        }
        else {
            System.out.println("Too few arguments");
        }

    }

    public static boolean checkRightParams(Double a, Double b) {
        if(a <= b) {
            return  true;
        }
        else {
            return false;
        }
    }

    public static void desicion(Double a, Double b, Double h) {
        int countItterations = calcCountItterations(a, b, h);
        HashMap<Double, Double> result = getHashMapResult(a, h, countItterations);
        outputResult(countItterations, result);
    }

    public static HashMap<Double, Double> getHashMapResult(Double a, Double h, int countItterations) {
        HashMap<Double, Double> result = new HashMap<Double, Double>();
        for(int i = 0; i <= countItterations; i++) {
            result.put(a, calcFunction(a));
            a += h;
        }
        return result;
    }

    public static Double calcFunction(Double x) {
        return Math.tan(x);
    }

    public static void outputResult(int size, HashMap<Double, Double> result) {
        for (Map.Entry<Double, Double> keyValuePair: result.entrySet()) {
            System.out.format("%.3f - %.3f%n", keyValuePair.getKey(), keyValuePair.getValue());
        }
    }

    public static int calcCountItterations(Double a, Double b, Double h) {
        return ((int)Math.round((Math.abs(b - a) / h)));
    }
}
