package by.webtech.first_lab.tests;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import by.webtech.first_lab.task.first.FirstTask;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Vladimir on 27.09.2016.
 */
@RunWith(value = Parameterized.class)
public class FirstTasksTest {

    private Double xValue;
    private Double yValue;
    private Double expectedResult;
    private static Double numericalError = 1E-6;

    public FirstTasksTest(Double xValue, Double yValue, Double expectedResult) {
        this.xValue = xValue;
        this.yValue = yValue;
        this.expectedResult = expectedResult;
    }

    @Test
    public void checkFuntionsResult() {
        Double functionResult;

        functionResult = FirstTask.findDesicion(this.xValue,this.yValue);

        boolean expected = true;

        boolean result = Math.abs(functionResult - expectedResult) < numericalError;

        Assert.assertEquals(expected, result);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { {0.0, 0.0, 0.5}, { 1.7, 3.9, 2.085859 } };
        return Arrays.asList(data);
    }

}
