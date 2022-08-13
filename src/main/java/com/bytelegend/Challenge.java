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
        List<Integer> list = new ArrayList<>();

        int start01 = start;

        while (start01 <= 1) {
            start01 += 1;
        }

        for (int i = start01; i <= end; i++) {
            long n = 0;
            long m = Math.round(Math.sqrt(i)) + 1;
            for (long l = 2; l <= m; l++) {
                n = l;
                if (i % l == 0) {
                    break;
                } else {
                    continue;
                }
            }
            if (n == m) {
                list.add(i);
            }
        }
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }


        return ints;
    }
}
