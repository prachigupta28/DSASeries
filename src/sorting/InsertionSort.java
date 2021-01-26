package sorting;

import java.util.Arrays;

public class InsertionSort {
    /**
     * sort the given array using insertion sort
     *
     * @param ar
     */
    public static void sort(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            int j = i - 1;
            int key = ar[i];
            while (j >= 0 && ar[j] > key) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = key;
        }
        Arrays.stream(ar).forEach(i -> System.out.print(i + " "));
    }

    public static void main(String[] args) {
        int[] ar = {12, 11, 13, 5, 6};
        sort(ar);
    }
}
