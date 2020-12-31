package array;

/**
 * Program to arrange negative numbers to the left & positive elements to the right of the array,
 * they don't have to be in sorted order.
 */
class ArrangeNegativePositiveElements {
    static void arrangeElements(int a[], int n) {
        int low = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                if (i != low) {
                    int temp = a[i];
                    a[i] = a[low];
                    a[low] = temp;
                }
                low++;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        arrangeElements(a, a.length);
        System.out.print("Binary array in sorted order: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
