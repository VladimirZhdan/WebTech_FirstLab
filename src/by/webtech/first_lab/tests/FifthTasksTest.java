package by.webtech.first_lab.tests;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import by.webtech.first_lab.task.fifth.FifthTask;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Vladimir on 09.10.2016.
 */
@RunWith(value = Parameterized.class)
public class FifthTasksTest {
    private int[] initialArray;
    private int expectedMinCountForRemoves;


    public FifthTasksTest(int[] initialArray, int expectedMinCountForRemoves) {
        this.initialArray = initialArray;
        this.expectedMinCountForRemoves = expectedMinCountForRemoves;
    }

    @Test
    public void checkRightAnswer() {
        int[] initialArray = this.initialArray;
        int actualResult = FifthTask.searchMinCountOfRemoves(initialArray);

        Assert.assertEquals(expectedMinCountForRemoves, actualResult);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        int[] initialArray0 = {872, 318, 592, 205, 597, 721, 305, 2, 1007, 1295};
        int[] initialArray1 = {1824, 1782, 1521, 1482, 1100, 892, 592, 420, 209, 7};
        int[] initialArray2 = {7, 10, 25, 98, 110, 250, 761, 1025, 1521, 1985};


        Object[][] data = new Object[][]{
                {initialArray0, 4},
                {initialArray1, 9},
                {initialArray2, 0}
        };
        return Arrays.asList(data);
    }
}

