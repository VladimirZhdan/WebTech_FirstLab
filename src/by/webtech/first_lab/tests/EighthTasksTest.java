package by.webtech.first_lab.tests;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import by.webtech.first_lab.task.eighth.EighthTask;

import java.util.*;

/**
 * Created by Vladimir on 02.10.2016.
 */
@RunWith(value = Parameterized.class)
public class EighthTasksTest {
    private ArrayList<Double> firstList;
    private ArrayList<Double> insertList;
    private Integer[] expectedInsertIndex;
    private Double[] expectedChangedFirstArray;

    public EighthTasksTest(ArrayList<Double> firstList, ArrayList<Double> insertList, Integer[] expectedInsertIndex, Double[] expectedChangedFirstArray) {
        this.firstList = (ArrayList<Double>)firstList.clone();
        this.insertList = insertList;
        this.expectedInsertIndex = expectedInsertIndex;
        this.expectedChangedFirstArray = expectedChangedFirstArray;
    }

    @Test
    public void firstTest() {
        ArrayList<Integer> resultInsertIndexList = EighthTask.searchInsertIndex(firstList, insertList);

        Integer[] resultInsertIndexArray = new Integer[resultInsertIndexList.size()];
        resultInsertIndexArray = resultInsertIndexList.toArray(resultInsertIndexArray);

        Assert.assertArrayEquals(this.expectedInsertIndex, resultInsertIndexArray);
    }

    @Test
    public void checkRightChangeFirstArrayAndRightSearchInsertIndex() {

        ArrayList<Integer> resultInsertIndexList = EighthTask.searchInsertIndex(firstList, insertList);

        Double[] changedFirstArray = new Double[firstList.size()];
        changedFirstArray = this.firstList.toArray(changedFirstArray);


        Assert.assertArrayEquals(this.expectedChangedFirstArray, changedFirstArray);

    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        ArrayList<Double> firstList0 = new ArrayList<Double>(Arrays.asList( 5.451, 12.769, 25.689, 40.067, 55.558 ));
        ArrayList<Double> insertList0 = new ArrayList<Double>(Arrays.asList( 3.259, 16.795, 26.413, 32.216, 70.862 ));
        Integer[] expectedInsertIndex0 = { 1, 4, 6, 7, 10 };
        Double[] expectedChangedFirstArray0 = { 3.259, 5.451, 12.769, 16.795, 25.689, 26.413, 32.216, 40.067, 55.558, 70.862};
        ArrayList<Double> firstList1 = new ArrayList<Double>(Arrays.asList( 4.679, 38.109, 70.483, 93.187, 93.557 ));
        ArrayList<Double> insertList1 = new ArrayList<Double>(Arrays.asList( 29.206, 32.783, 54.944, 85.675, 92.846 ));
        Integer[] expectedInsertIndex1 = { 2, 3, 5, 7, 8 };
        Double[] expectedChangedFirstArray1 = { 4.679, 29.206, 32.783, 38.109, 54.944, 70.483, 85.675, 92.846, 93.187, 93.557 };

        Object[][] data = new Object[][] {
                {firstList0, insertList0, expectedInsertIndex0, expectedChangedFirstArray0},
                {firstList1, insertList1, expectedInsertIndex1, expectedChangedFirstArray1}
        };
        return Arrays.asList(data);
    }
}
