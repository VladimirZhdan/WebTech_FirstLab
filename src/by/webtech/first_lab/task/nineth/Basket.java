package by.webtech.first_lab.task.nineth;

import java.awt.*;
import java.util.*;

/**
 * Created by Vladimir on 02.10.2016.
 */
public class Basket {
    private ArrayList<Ball> balls = new ArrayList<Ball>();
    private int weight = 0;

    public void addBall(Ball ball) {
        this.balls.add(ball);
        this.weight += ball.getWeight();
    }

    public int getWeight() {
        return this.weight;
    }

    public int countBallsOfSpecificColor(Color color) {
        int result = 0;
        for(int i = 0; i < balls.size(); i++) {
            Ball currentBall = balls.get(i);
            if(currentBall.getColor() == color) {
                result++;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String result;
        result = "Basket{Weight=" + this.weight + "}\n\tContent: ";
        for(int i = 0; i < balls.size(); i++) {
            Ball currentBall = balls.get(i);
            result += ("\n\t\t" + currentBall.toString());
        }
        return result;
    }
}
