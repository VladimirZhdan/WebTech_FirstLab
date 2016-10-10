package by.webtech.first_lab.task.nineth;

import java.awt.*;

/**
 * Created by Vladimir on 02.10.2016.
 */
public class Ball {
    private int weight;
    private Color color;

    public Ball(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return this.weight;
    }

    public Color getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Ball{" + this.color.toString() + ", " + this.weight + "}";
    }
}
