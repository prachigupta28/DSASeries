package array;

/**
 * Program to find Maximum and minimum of an array using minimum number of comparisons
 */
public class MinMaxElement {
    /**
     * Class used to return min and max element from getMinMax() method
     */
    static class Pair {
        private int min;
        private int max;

        public Pair(int minimum, int maximum) {
            this.min = minimum;
            this.max = maximum;
        }
    }

    /**
     * @param arr
     * @param start start index of array
     * @param end   last index of array
     * @return an object of {@code Pair} containing minimum and maximum element
     */
    static Pair getMinMax(int arr[], int start, int end) {
        if (start == end)
            return new Pair(arr[start], arr[start]);
        if (end == start + 1) {
            if (arr[start] > arr[end]) {
                return new Pair(arr[end], arr[start]);
            } else {
                return new Pair(arr[start], arr[end]);
            }
        } else {
            int mid = (start + end) / 2;
            Pair leftMinMax = getMinMax(arr, 0, mid);
            Pair rightMinMax = getMinMax(arr, mid + 1, end);
            int min = leftMinMax.min < rightMinMax.min ? leftMinMax.min : rightMinMax.min;
            int max = leftMinMax.max > rightMinMax.max ? leftMinMax.max : rightMinMax.max;
            return new Pair(min, max);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        Pair result = getMinMax(arr, 0, arr.length - 1);
        System.out.println("Maximum element: " + result.max);
        System.out.println("Minimum element: " + result.min);
    }
}
