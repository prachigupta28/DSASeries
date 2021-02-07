package array;

import java.util.Arrays;

public class NextPermutation {
    /**
     * rearranges numbers into the lexicographically next greater permutation of numbers.
     * If such an arrangement is not possible, it must rearrange it as the lowest possible
     * order (i.e., sorted in ascending order).
     *
     * @param nums
     */
    public static void nextPermutation(int[] nums) {
        int i;
        for (i = nums.length - 2; i >= 0 && nums[i + 1] <= nums[i]; i--) {
        }
        if (i >= 0) {
            int j;
            for (j = nums.length - 1; j >= 0 && nums[j] <= nums[i]; j--) {
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
        Arrays.stream(nums).forEach((int element) -> System.out.print(element + " "));
    }

    public static void reverse(int[] nums, int startIndex) {
        int i = startIndex, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 8, 4, 7, 6, 5, 3, 1};
        nextPermutation(arr);
    }
}
