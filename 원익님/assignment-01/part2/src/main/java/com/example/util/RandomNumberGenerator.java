package com.example.util;

import com.example.domain.lottery.Numbers;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator implements NumberGenerator{

    private static final int END_EXCLUSIVE = 45;
    private static final int START_INCLUSIVE = 1;
    private final ThreadLocalRandom random;
    private final int length;

    public RandomNumberGenerator(int length) {
        this.length = length;
        random = ThreadLocalRandom.current();
    }

    @Override
    public Numbers generate() {
        int[] integers = getIntegers(length);
        return Numbers.createWithSort(integers);
    }

    private int[] getIntegers(int count) {
        int[] integers = new int[count];
        for (int i = 0; i < count; i++) {
            int randomNumber = getRandomNumber();
            integers[i] = randomNumber;
        }
        return integers;
    }

    private int getRandomNumber() {
        return random.nextInt(END_EXCLUSIVE) + START_INCLUSIVE;
    }

}
