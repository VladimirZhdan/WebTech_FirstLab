package by.webtech.first_lab.tests;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import by.webtech.first_lab.task.sixth.SixthTask;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Vladimir on 27.09.2016.
 */
@RunWith(value = Parameterized.class)
public class SixthTasksTest {
    private Double[] initMass;
    private Double[][] expectedResultMass;

    public SixthTasksTest(Double[] initMass, Double[][] expectedResultMass) {
        this.initMass = initMass;
        this.expectedResultMass = expectedResultMass;
    }

    @Test
    public void checkRightResultMatrix()
    {
        Double[][] result = SixthTask.createSpecialArray(this.initMass);

        Assert.assertArrayEquals(this.expectedResultMass, result);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Double[][] expectedResultMass0 = { {1.0,2.0,3.0}, {2.0,3.0,1.0}, {3.0,1.0,2.0} };
        Double[] initMass0 = { 1.0, 2.0, 3.0 };
        Double[][] expectedResultMass1 = { {1.0,2.0,3.0,4.0}, {2.0,3.0,4.0,1.0}, {3.0,4.0,1.0,2.0}, {4.0,1.0,2.0,3.0} };
        Double[] initMass1 = { 1.0, 2.0, 3.0, 4.0 };

        Object[][] data = new Object[][] { {initMass0, expectedResultMass0}, {initMass1, expectedResultMass1} } ;
        return Arrays.asList(data);
    }
}
