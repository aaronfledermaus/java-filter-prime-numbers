package com.bytelegend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List<Integer> l = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                l.add(i);
            }
        }
        int[] r = new int[l.size()];
        int c = 0;
        for (int n : l) {
            r[c] = n;
            c++;
        }
        return r;
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        int s = 2;
        int e = n / 2;
        while (s <= e) {
            if (n % s == 0) {
                return false;
            }
            s++;
        }
        return true;
    }
}
