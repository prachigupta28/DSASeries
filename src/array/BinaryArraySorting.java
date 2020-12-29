package array;

/**
 * Program to segregate 0s on left side and 1s on right side of the binary array. The binary array contains only 0  and 1.
 */
public class BinaryArraySorting {
    static void binSort(int A[], int N) {
        //Count the number of 0s
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == 0)
                count++;
        }
        //Once we have count, we can put that number of 0s at the beginning and 1s at the remaining n – C positions in array.
        int j = 0;
        while (j < count) {
            A[j] = 0;
            j++;
        }
        while (j < N) {
            A[j] = 1;
            j++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 1, 1, 1, 0, 0, 0};
        binSort(arr, arr.length);
        System.out.print("Binary array in sorted order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
