package com.bytelegend;

import org.apache.commons.math3.primes.Primes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ChallengeTest {
    @Test
    public void test() {
        IntStream.range(0, 100)
                .forEach(
                        end ->
                                Assertions.assertEquals(
                                        IntStream.of(Challenge.filterPrimeNumbers(0, end))
                                                .boxed()
                                                .collect(Collectors.toList()),
                                        IntStream.range(0, end + 1)
                                                .filter(Primes::isPrime)
                                                .boxed()
                                                .collect(Collectors.toList())));
    }
}
