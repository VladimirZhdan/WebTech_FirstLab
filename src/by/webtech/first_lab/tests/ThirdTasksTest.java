package by.webtech.first_lab.tests;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import by.webtech.first_lab.task.third.ThirdTask;

import java.util.*;

/**
 * Created by Vladimir on 30.09.2016.
 */
@RunWith(value = Parameterized.class)
public class ThirdTasksTest {
    private Double startOfSection;
    private Double stepOfItteration;
    private int countItterations;

    public ThirdTasksTest(Double startOfSection, Double stepOfItteration, int countItterations) {
        this.startOfSection = startOfSection;
        this.stepOfItteration = stepOfItteration;
        this.countItterations = countItterations;
    }

    @Test
    public void checkRightAnswer() {
        boolean result = true;
        HashMap<Double, Double> answer = ThirdTask.getHashMapResult(startOfSection, stepOfItteration, countItterations);
        HashMap<Double, Double> resultMass = new HashMap<Double, Double>();

        for (Map.Entry<Double, Double> keyValuePair: answer.entrySet()) {
            resultMass.put(keyValuePair.getKey(), Math.tan(keyValuePair.getKey()));
        }

        Assert.assertArrayEquals(resultMass.values().toArray(), answer.values().toArray());
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { {1.0, 0.3, 3}, {0.0, 3.7, 10}, {25.1, 1.3, 5} };
        return Arrays.asList(data);
    }
}
