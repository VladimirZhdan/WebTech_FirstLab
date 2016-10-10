package by.webtech.first_lab.task.second;

import java.awt.*;

/**
 * Created by Vladimir on 27.09.2016.
 */
public class SecondTask {
    public static void main(String[] args) {
        int x;
        int y;
        if(args.length > 1) {
            try {
                x = Integer.parseInt(args[0]);
                y = Integer.parseInt(args[1]);
            }
            catch (NumberFormatException e) {
                System.out.println("Error! Uncorrect numbers format.");
                return;
            }
            System.out.println(checkPointInArea(new Point(x,y)));
        }
        else {
            System.out.println("Too few arguments");
        }

    }

    public static Boolean checkPointInArea(Point point) {
        if((point.y <= 5) && (point.y >= -3) && (Math.abs(point.x) <= 6)) {
            if(Math.abs(point.x) <= 4)
                return true;
            else {
                if(point.y <= 0)
                    return true;
                else
                    return false;
            }
        }
        else
            return false;
    }
}
