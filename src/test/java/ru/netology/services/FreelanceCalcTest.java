package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelanceCalcTest {
    @Test

    public void test_10_3_20() {
        FreelanceCalc service = new FreelanceCalc();

        int actual = service.calc(10_000, 3_000, 20_000);
        int expended = 3;

        Assertions.assertEquals(expended, actual);
    }

    @Test

    public void test_100_60_150() {
        FreelanceCalc service = new FreelanceCalc();

        int actual = service.calc(100_000, 60_000, 150_000);
        int expended = 2;

        Assertions.assertEquals(expended, actual);
    }



}