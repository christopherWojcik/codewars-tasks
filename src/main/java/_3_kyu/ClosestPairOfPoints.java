package _3_kyu;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Closest pair of points in linearithmic time
 *
 * @author Krzysztof Wójcik
 */
public class ClosestPairOfPoints {

    // TODO: create class Point as it is shown in task description and then rewrite method: closestPair.
    //  Currently I've based on class from java.awt.* and there are getters.
    //  In task class there aren't.

    public static List<Point> closestPair(List<Point> points) {
        if (points.size() <= 2) {
            return points;
        } else {
            List<Point> list = new LinkedList<>();
            System.out.println(points.get(0).toString().substring(1));
            double XDist = Math.abs(points.get(0).getX() - points.get(1).getX());
            double YDist = Math.abs(points.get(0).getY() - points.get(1).getY());
            double lowestDistance = Math.sqrt(Math.pow(XDist, 2) + Math.pow(YDist, 2));

            for (int i = 0; i < points.size() - 2; i++) {
                for (int j = i + 1; j < points.size(); j++) {
                    if (getDistance(points.get(i), points.get(j)) < lowestDistance) {
                        lowestDistance = getDistance(points.get(i), points.get(j));
                        list.add(points.get(i));
                        list.add(points.get(j));
                    }
                }
            }
            List<Point> result = new ArrayList<>();
            result.add(list.get(list.size() - 1));
            result.add(list.get(list.size() - 2));
            return result;
        }
    }

    public static double getDistance(Point a, Point b) {
        double XDist = Math.abs(a.getX() - b.getX());
        double YDist = Math.abs(a.getY() - b.getY());
        return Math.sqrt(XDist * XDist + YDist * YDist);
    }
}
