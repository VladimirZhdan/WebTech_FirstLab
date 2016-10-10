package by.webtech.first_lab.task.nineth;

import java.awt.*;
import java.util.*;

/**
 * Created by Vladimir on 02.10.2016.
 */
public class NinethTask {
    private static Color[] colors = {
            Color.BLACK,
            Color.RED,
            Color.ORANGE,
            Color.YELLOW,
            Color.GREEN,
            Color.CYAN,
            Color.BLUE,
            Color.MAGENTA
    };

    public static void main(String[] args) {
        if(args.length > 0) {
            int countBallsInBasket;
            try {
                countBallsInBasket = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException e) {
                System.out.println("Error! Uncorrect numbers format.");
                return;
            }
            desicion(countBallsInBasket);
        }
        else {
            System.out.println("Too few arguments");
        }
    }

    private static void desicion(int countBallsInBasket) {
        Basket basket = new Basket();
        fillBasketOfRandomBalls(basket, countBallsInBasket);
        System.out.println(basket.toString());
        int weightBallsInBasket = basket.getWeight();
        int countBlueBallsInBasket = basket.countBallsOfSpecificColor(Color.BLUE);
        outputMessageWithIntegerValue("Weight of balls in basket", weightBallsInBasket);
        outputMessageWithIntegerValue("Count blue balls in basket", countBlueBallsInBasket);
    }

    private static void fillBasketOfRandomBalls(Basket basket, int countBalls) {
        Random random = new Random();

        for(int i = 0; i < countBalls; i++) {
            Color nextColor = colors[random.nextInt(colors.length)];
            int nextWeight = 1 + random.nextInt(10);
            Ball nextBall = new Ball(nextWeight, nextColor);
            basket.addBall(nextBall);
        }
    }

    private static void outputMessageWithIntegerValue(String message, int value) {
        System.out.print(message + " - " + value);
        System.out.println();
    }
}
