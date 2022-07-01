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
        int[] empty = {};
        int counter = 1;
        int startCounter = start;
        while (startCounter != end) {
            startCounter++;
            counter++;
        }
        int[] array = new int[counter];
        counter = 0;
        startCounter = start;
        while (start - 1 < end) {
            array[counter] = startCounter;
            startCounter++;
            counter++;
        }

        counter = 0;
        for (int number : array) {
            if (checkIfPrime(number)) {
                counter++;
            }
        }

        if (counter > 0) {
            int[] prime = new int[counter];
            counter = 0;
            for (int number : array) {
                if (checkIfPrime(number)) {
                    prime[counter] = number;
                    counter++;
                }
            }
            return prime;
        } else return empty;
    }

    private static boolean checkIfPrime(int number) {
        if (number == 0 || number == 1) return false;
        int counter = (int) Math.sqrt(number);
        while (true) {
            if (counter == 1 || counter == 0) break;
            if (number % counter == 0) {
                return false;
            }
            counter--;
        }
        return true;
    }
}
