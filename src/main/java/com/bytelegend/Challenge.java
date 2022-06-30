package com.bytelegend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(filterPrimeNumbers(1, 10)));
        System.out.println(Arrays.toString(filterPrimeNumbers(50, 100)));

    }
    public static int[] filterPrimeNumbers(int start, int end) {
        return null;
        List<Integer> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int j = 2; j <= (int) Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}