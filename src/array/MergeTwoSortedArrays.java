package array;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    /**
     * function to merge two sorted array as one sorted array without using extra space(using insertion sort)
     *
     * @param ar1
     * @param ar2
     */
    public static void sort(int[] ar1, int[] ar2) {
        int i, j;
        for (i = ar2.length - 1; i >= 0; i--) {
            int temp = ar1[ar1.length - 1];
            for (j = ar1.length - 2; j >= 0 && ar2[i] < ar1[j]; j--) {
                ar1[j + 1] = ar1[j];
            }
            if (j != ar1.length - 2 || ar2[i] < temp) {
                ar1[j + 1] = ar2[i];
                ar2[i] = temp;
            }
        }
        Arrays.stream(ar1).forEach(k -> System.out.print(k + " "));
        Arrays.stream(ar2).forEach(k -> System.out.print(k + " "));
    }

    public static void main(String[] args) {
        int[] ar1 = {1, 5, 9, 10, 15, 20};
        int[] ar2 = {2, 3, 8, 13};
        sort(ar1, ar2);
    }
}
