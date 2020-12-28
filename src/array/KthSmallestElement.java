package array;

import java.util.Arrays;

/**
 * Program to calculate Kth smallest element in an array
 */
public class KthSmallestElement {
    /**
     * This function finds the Kth smallest element in an array
     *
     * @param arr
     * @param l   start index of array
     * @param r   end index of array
     * @param k
     * @return kth smallest element in an array
     */
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int arr[] = {5, -8, 10, 37, 101, 2, 9};
        System.out.println("Kth Smallest Element: " + kthSmallest(arr, 0, 6, 6));
    }
}
