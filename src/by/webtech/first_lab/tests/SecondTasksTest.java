package by.webtech.first_lab.tests;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import by.webtech.first_lab.task.second.SecondTask;


import java.awt.*;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Vladimir on 27.09.2016.
 */

@RunWith(value = Parameterized.class)
public class SecondTasksTest {

    private int xCoordinate;
    private int yCoordinate;
    private boolean expectedResult;

    public SecondTasksTest(int xCoordinate, int yCoordinate, boolean expectedResult) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.expectedResult = expectedResult;
    }

    @Test
    public void checkPointInArea() {
        Point point = new Point(xCoordinate,yCoordinate);

        Boolean result = SecondTask.checkPointInArea(point);

        Assert.assertEquals(expectedResult, result);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { {-4, -2, true}, { 10, 4, false } };
        return Arrays.asList(data);
    }
}
