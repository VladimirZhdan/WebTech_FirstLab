package by.webtech.first_lab.tests;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import by.webtech.first_lab.task.seventh.SeventhTask;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Vladimir on 01.10.2016.
 */
@RunWith(value = Parameterized.class)
public class SeventhTaskTest {
    private Double[] initialMass;
    private Double[] expectedSortedMass;

    public SeventhTaskTest(Double[] initialMass, Double[] expectedSortedMass) {
        this.initialMass = initialMass;
        this.expectedSortedMass = expectedSortedMass;
    }

    @Test
    public void checkRightSorting() {
        Double[] resultSortedMass = SeventhTask.shellSortMass(this.initialMass);

        Assert.assertArrayEquals(this.expectedSortedMass, resultSortedMass);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Double[] initialMass0 = { 0.255, 0.511, 0.361, 0.722, 0.187, 0.156, 0.956, 0.455, 0.421, 0.125 };
        Double[] expectedSortedMass0 = { 0.125, 0.156, 0.187, 0.255, 0.361, 0.421, 0.455, 0.511, 0.722, 0.956 };
        Double[] initialMass1 = { 49.989, 17.683, 13.972, 81.489, 87.673, 61.440, 69.040, 55.240, 86.534, 17.040 };
        Double[] expectedSortedMass1 = { 13.972, 17.040, 17.683, 49.989, 55.240, 61.440, 69.040, 81.489, 86.534, 87.673 };

        Object[][] data = new Object[][] { {initialMass0, expectedSortedMass0}, {initialMass1, expectedSortedMass1} };
        return Arrays.asList(data);
    }
}
