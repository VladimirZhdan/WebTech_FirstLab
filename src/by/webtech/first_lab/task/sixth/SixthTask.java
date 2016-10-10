package by.webtech.first_lab.task.sixth;
/**
 * Created by Vladimir on 27.09.2016.
 */
public class SixthTask {
    public static void main(String[] args) {
        Double a[] = { 1.0,2.0,3.0,4.0,5.0,6.0,7.0 };
        Double[][] mass = createSpecialArray(a);
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++)
                System.out.print(mass[i][j] + "; ");
            System.out.println();
        }
    }

    public static Double[][] createSpecialArray(Double[] mass) {
        int size = mass.length;
        Double[][] result = new Double[size][size];
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = mass[(i + j) % size];
            }
        }
        return result;
    }
}
