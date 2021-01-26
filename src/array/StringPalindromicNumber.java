package array;

public class StringPalindromicNumber {
    /**
     * finds the largest string in the array which is palindrome
     *
     * @param ar input array
     * @return largest string in the array which is palindrome
     */
    public String getLargestPalindrome(String[] ar) {
        String largestPalindrome = "";
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].length() > largestPalindrome.length() && isPalindrome(ar[i])) {
                largestPalindrome = ar[i];
            }
        }
        return largestPalindrome;
    }

    /**
     * checks whether the string is palindrome
     *
     * @param str
     * @return boolean
     */
    public boolean isPalindrome(String str) {
        StringBuilder builder = new StringBuilder(str);
        if (builder.reverse().toString().equals(str))
            return true;
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        StringPalindromicNumber obj = new StringPalindromicNumber();
        //String[] ar = {"abc", "adda", "a" };
        String[] ar = {"abc", "adda", "a", "abddab", "abbbba"};
        System.out.println("Largest Palindromic String: " + obj.getLargestPalindrome(ar));
    }
}
