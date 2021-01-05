package dynamic_programming;

import java.util.HashMap;

public class NthFibonacciNumber {
    /**
     * Given a positive integer n, This method returns the nth fibonacci number using Dynamic Programming.
     *
     * @param n
     * @return
     */
    static int nthFibonacci(int n, HashMap<Integer, Integer> hashMap) {
        if (hashMap == null)
            hashMap = new HashMap<>();
        if (hashMap.containsKey(n))
            return hashMap.get(n);
        if (n == 0)
            return 0;
        else if (n == 1 || n == 2)
            return 1;
        else {
            hashMap.put(n, nthFibonacci(n - 1, hashMap) + nthFibonacci(n - 2, hashMap));
            return hashMap.get(n);
        }
    }

    public static void main(String[] args) {
        System.out.println("9th Fibonacci Number: "+nthFibonacci(9,null));
    }
}
