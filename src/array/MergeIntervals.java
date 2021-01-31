package array;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {
    /**
     * this function merges all overlapping intervals, and return an array of
     * the non-overlapping intervals that cover all the intervals in the input.
     *
     * @param intervals
     * @return
     */
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] array = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merged = merge(array);
        for (int i = 0; i < merged.length; i++) {
            for (int j = 0; j < merged[i].length; j++) {
                System.out.println("Values at arr[" + i + "][" + j + "] is " + merged[i][j]);
            }
        }
    }
}
