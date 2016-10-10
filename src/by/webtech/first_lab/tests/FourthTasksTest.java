package by.webtech.first_lab.tests;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import by.webtech.first_lab.task.fourth.FourthTask;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Vladimir on 30.09.2016.
 */
@RunWith(value = Parameterized.class)
public class FourthTasksTest {
    private Integer[] initialMass;
    private Integer[] expectedResultMass;

    public FourthTasksTest(Integer[] initialMass, Integer[] expectedResultMass) {
        this.initialMass = initialMass;
        this.expectedResultMass = expectedResultMass;
    }

    @Test
    public void checkRightAnswer() {
        Integer[] indexOfPrimeNumbers = FourthTask.searchIndexOfPrimeNumbersInArray(this.initialMass);

        Assert.assertArrayEquals(this.expectedResultMass, indexOfPrimeNumbers);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Integer[] initialMass = { 367, 773, 929, 100, 524, 487, 152, 701, 223, 999 };
        Integer[] expectedResult = { 1, 2, 3, 6, 8, 9 };
        Object[][] data = new Object[][] { {initialMass, expectedResult} };
        return Arrays.asList(data);
    }



}
