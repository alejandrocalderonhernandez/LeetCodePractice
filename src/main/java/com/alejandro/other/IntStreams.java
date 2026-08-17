package com.alejandro.other;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreams {

    public int sumAllEvenNumbers(int[] nums) {
        return IntStream.of(nums)
                .filter(n -> n % 2 == 0)
                .sum();
    }

}
