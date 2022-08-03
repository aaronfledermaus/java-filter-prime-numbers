package com.bytelegend;

import java.util.Arrays;
import java.util.StringJoiner;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(filterPrimeNumbers(1, 10));
        System.out.println(filterPrimeNumbers(50, 100));
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
        List<Integer> prime =new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if(isprime(i)){
                prime.add(i);
            }
        }
        int[] p=new int[prime.size()];
        for (int i = 0; i < prime.size(); i++) {
            p[i]= prime.get(i);
        }
        return p;
    }

    public static boolean isprime(int n){
        if(n<2)return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}
