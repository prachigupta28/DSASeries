package array;

public class LargestPalindromicNumber {

    public int getLargestPalindrome(int[] ar) {
        int largestPalindrome = -1;
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] > largestPalindrome && isPalindrome(ar[i])) {
                largestPalindrome = ar[i];
            }
        }
        return largestPalindrome;
    }

    public boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;
        while (num > 0) {
            int rem = num % 10;
            reversed = reversed * 10 + rem;
            num = num / 10;
        }
        if (reversed == original)
            return true;
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        LargestPalindromicNumber obj = new LargestPalindromicNumber();
        int[] ar = {1, 232, 54545, 999991};
        //int[] ar = {1, 2, 3, 4, 5, 50};
        System.out.println("Largest Palindromic Number: " + obj.getLargestPalindrome(ar));
    }
}
