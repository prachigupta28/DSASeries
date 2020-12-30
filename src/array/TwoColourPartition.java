package array;

/**
 * This program sorts an array of 0 and 1 using Dutch National Flag approach
 */
public class TwoColourPartition {
    static void sort0s1s(int arr[], int n) {
        int low = 0, high = n - 1;
        while (low < high) {
            if (arr[low] == 0)
                low++;
            else {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 1, 1, 1, 0, 0, 0};
        sort0s1s(arr, arr.length);
        System.out.print("Binary array in sorted order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
