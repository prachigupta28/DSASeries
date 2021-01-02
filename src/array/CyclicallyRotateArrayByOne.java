package array;

/**
 * Program to cyclically rotate an array by one
 */
public class CyclicallyRotateArrayByOne {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        rotateByOne(a, a.length);
        System.out.print("Cyclically rotated array by one: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void rotateByOne(int a[], int n) {
        int lastValue = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = lastValue;
    }
}
