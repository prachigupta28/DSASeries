package array;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Program to sort an array of size N containing only 0s, 1s, and 2s in ascending order
 */
public class SortArrayOf0s1sAnd2s {
    /**
     * @param a array to be sorted
     * @param n size of the array
     */
    static void sort012(int a[], int n) {
        int countZero = 0, countOne = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                countZero++;
            if (a[i] == 1)
                countOne++;
        }
        for (int i = 0; i < countZero; i++)
            a[i] = 0;
        for (int i = countZero; i < countZero + countOne; i++)
            a[i] = 1;
        for (int i = countZero + countOne; i < n; i++)
            a[i] = 2;
    }

    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 2, 0};
        sort012(arr, arr.length);
        System.out.print("Array in sorted order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
