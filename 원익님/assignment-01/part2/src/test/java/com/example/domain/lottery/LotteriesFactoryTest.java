package com.example.domain.lottery;

import com.example.domain.value.Price;
import com.example.util.ManualNumberGenerator;
import com.example.util.RandomNumberGenerator;
import org.junit.jupiter.api.Test;

class LotteriesFactoryTest {
    @Test
    void name() {
        LotteriesFactory randomLotteriesFactory = new LotteriesFactory(
                3, Price.of(1000), new RandomNumberGenerator(5));

        LotteriesFactory manualLotteriesFactory = new LotteriesFactory(
                3, Price.of(1000), new ManualNumberGenerator());
    }
}