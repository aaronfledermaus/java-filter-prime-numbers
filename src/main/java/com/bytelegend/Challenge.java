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

        int index = 0;
        int nPrimes = 0;

        boolean[] isPrime = new boolean[end - start + 1];

        for (int i = 0; i <= end - start; i++) {
            isPrime[i] = checkIfPrimeNumber(start + i);
            nPrimes += isPrime[i] ? 1 : 0;
        }

        int[] out = new int[nPrimes];

        for (int i = 0; i <= end - start; i++) {
            if (isPrime[i]) {
                out[index] = start + i;
                index++;
            }
            if (index == nPrimes) break;
        }

        return out;
    }

    public static boolean checkIfPrimeNumber(int number) {
        int divisor = 2;

        if (number < 2) return false;

        while (true) {
                if (divisor > Math.sqrt(number)) break;
                if (number % divisor == 0) {
                    return false;
                }
                divisor++;
        }
        return true;
    }
}
