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
        String res = "";
        boolean isFlag = true;
        for (int i = start; i <= end; i++) {
            if (i < 2) {
                continue;
            }
            isFlag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag == true) {
                res += i + ",";
            }
        }
        String[] str = res.split(",");
        int[] ires = new int[str.length];
        if (str.length == 1 && "".equals(str[0])) {
            ires = new int[0];
        } else {
            for (int i = 0; i < str.length; i++) {
                ires[i] = Integer.parseInt(str[i]);

            }
        }

        return ires;
    }
}
