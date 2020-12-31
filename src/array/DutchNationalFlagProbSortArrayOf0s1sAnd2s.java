package array;

/**
 * Program to sort an array of size N containing only 0s, 1s, and 2s in ascending order. Its a variation of Dutch National Flag Problem
 */
public class DutchNationalFlagProbSortArrayOf0s1sAnd2s {
    /**
     * @param a array to be sorted
     * @param n size of the array
     */
    static void sort012(int a[], int n) {
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            switch (a[mid]) {
                case 0: {
                    int temp = a[mid];
                    a[mid] = a[low];
                    a[low] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    int temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
                }
            }
        }
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
