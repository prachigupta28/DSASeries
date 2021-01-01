package array;

import java.util.*;

/**
 * Program to find Intersection of two arrays, containing distinct elements from both the arrays. If there are
 * repetitions, then only one occurrence of element should be printed in intersection and print its size.
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int a1[] = {7, 1, 5, 2, 3, 6};
        int a2[] = {3, 8, 6, 20, 7};
        int count = findIntersection(a1, a2);
        System.out.println(count);
    }

    static int findIntersection(int a1[], int a2[]) {
        Set set = new HashSet<Integer>();
        List list = new ArrayList<Integer>();
        //int count = 0;
        for (int a : a1) {
            set.add(a);
        }
        for (int b : a2) {
            if (set.contains(b))
                list.add(b);
            //count++;
        }
        return list.size();
        //return count;
    }
}
