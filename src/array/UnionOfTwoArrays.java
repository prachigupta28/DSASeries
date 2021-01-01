package array;

import java.util.HashSet;
import java.util.Set;

/**
 * Program to find Union of two arrays, containing distinct elements from both the arrays. If there are
 * repetitions, then only one occurrence of element should be printed in union and print its size.
 */
public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int a1[] = {7, 1, 5, 2, 3, 6};
        int a2[] = {3, 8, 6, 20, 7};
        int count = findUnion(a1, a2);
        System.out.println(count);
    }

    static int findUnion(int a1[], int a2[]) {
        Set<Integer> set = new HashSet<>();
        for (int a : a1) {
            set.add(a);
        }
        for (int b : a2) {
            set.add(b);
        }
        System.out.println(set);
        return set.size();
    }
}
