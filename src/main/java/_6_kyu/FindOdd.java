package _6_kyu;

import java.util.Arrays;

/**
 * Find the odd
 * Task description:
 * Given an array of integers, find the one that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 *
 * @author Krzysztof Wójcik
 */
public class FindOdd {

    /*
        My solution of this task.
     */
    public static int findIt(int[] a) {
        /*
            Function .sort simply sorts our array. Now, the first element is the smallest one,
            and the last one is the biggest. The range of ints is between a[0] and a[a.length-1].
         */
        Arrays.sort(a);
        int result = 0;

        for (int i = a[0]; i < a[a.length - 1] + 1; i++) {
            int finalI = i;
            long count = Arrays.stream(a).filter(value -> value == finalI).count();

            /*
                From task description we know that there is ONLY ONE NUMBER that appears an odd number of times.
                So this condition will be met only once and the value (i) is the result of this task.
             */
            if (count % 2 != 0) {
                result = i;
            }
        }
        return result;
    }

    /*
        This is alternative solution (tricky one).
     */
    public static int findIt_Alternative(int[] a) {
        int result = 0;

        for (int i : a) {
            result ^= i;
        }

        return result;
    }
}
