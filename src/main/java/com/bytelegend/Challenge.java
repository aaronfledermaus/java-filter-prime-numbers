package com.bytelegend;

import java.util.Arrays;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(filterPrimeNumbers(1, 10)));
        System.out.println(Arrays.toString(filterPrimeNumbers(50, 100)));
    }

    /**
     * `filterPrimeNumbers(int start, int end)` method returns an array of all prime numbers in the
     * given `start<=n<=end` range.
     *
     * <p>For example, `filterPrimeNumbers(1, 10)` returns `[2, 3, 5, 7]`.
     *
     * <p>A prime number is a whole number greater than 1 whose only factors are 1 and itself.
     *
     * <p>Tips: for a positive integer `n`, if it's not divisible by any of the integers between 2
     * and `Math.sqrt(n)`, then `n` is a prime number.
     */
    public static int[] filterPrimeNumbers(int start, int end) {
        boolean[] visited = new boolean[end + 1];
        for (int i = 2; i * i <= end; i++) {
            for (int j = i; j * i <= end; j++) {
                visited[i * j] = true;
            }
        }
        int n = 0;
        for (int i = Math.max(start, 2); i <= end; i++) {
            if (!visited[i]) {
                n++;
            }
        }
        int[] ans = new int[n];
        for (int i = Math.max(start, 2), idx = 0; i <= end && idx < n; i++) {
            if (!visited[i]) {
                ans[idx++] = i;
            }
        }
        return ans;
    }
}
