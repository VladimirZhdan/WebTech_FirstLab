package by.webtech.first_lab.tests;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import by.webtech.first_lab.task.nineth.*;

import java.awt.*;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Vladimir on 02.10.2016.
 */
@RunWith(value = Parameterized.class)
public class NinethTasksTest {
    private Basket basket;
    private int expectedWeight;
    private int expectedCountOfBlueBalls;

    public NinethTasksTest(Basket basket, int expectedWeight, int expectedCountOfBlueBalls) {
        this.basket = basket;
        this.expectedWeight = expectedWeight;
        this.expectedCountOfBlueBalls = expectedCountOfBlueBalls;
    }

    @Test
    public void checkRightWeightOfBallsInBasket() {
        int resultWeight = this.basket.getWeight();

        Assert.assertEquals(this.expectedWeight, resultWeight);
    }

    @Test
    public void checkRightCountOfBlueBalls() {
        int resultCountOfBlueBalls = this.basket.countBallsOfSpecificColor(Color.BLUE);

        Assert.assertEquals(this.expectedCountOfBlueBalls, resultCountOfBlueBalls);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Basket basket0 = new Basket();
        int expectedWeight0 = 0;
        for(int i = 0; i < 10; i++) {
            Ball nextBall = new Ball(i, Color.GREEN);
            expectedWeight0 += i;
            basket0.addBall(nextBall);
        }
        int expectedCountOfBlueBalls0 = 0;

        Basket basket1 = new Basket();
        int expectedWeight1 = 0;
        for(int i = 0; i < 3; i++) {
            Ball nextBall = new Ball(i, Color.GREEN);
            basket1.addBall(nextBall);
            expectedWeight1 += i;
        }
        for(int i = 0; i < 4; i++) {
            Ball nextBall = new Ball(i, Color.BLUE);
            basket1.addBall(nextBall);
            expectedWeight1 += i;
        }
        for(int i = 0; i < 3; i++) {
            Ball nextBall = new Ball(i, Color.ORANGE);
            basket1.addBall(nextBall);
            expectedWeight1 += i;
        }
        int expectedCountOfBlueBalls1 = 4;


        Object[][] data = new Object[][] {
                { basket0, expectedWeight0, expectedCountOfBlueBalls0 },
                { basket1, expectedWeight1, expectedCountOfBlueBalls1 }
        };
        return Arrays.asList(data);
    }

}
