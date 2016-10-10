package by.webtech.first_lab.task.first;

//import java.lang.*;

/**
 * Created by Vladimir on 27.09.2016.
 */
public class FirstTask {

    public static Double findDesicion(Double x, Double y) {
        Double result;
        result = calcNumerator(x,y)/calcDenominator(x,y) + x;
        return result;
    }

    private static Double calcNumerator(Double x, Double y) {
        Double result;
        result = 1 + Math.pow(Math.sin(x + y), 2);
        return result;
    }

    private static Double calcDenominator(Double x, Double y) {
        Double result;
        result = x - (2 * x / (1 + Math.pow(x * y, 2)));
        result = 2 + Math.abs(result);
        return result;
    }
}
