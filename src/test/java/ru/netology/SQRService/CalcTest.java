package ru.netology.SQRService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void sqrtcalc() {
        Calc service = new Calc();
        int num = 99;
        int expected = 3;
        int max = 200;
        int min = 300;

        int actual = service.sqrtcalc(num, max, min);

        assertEquals(expected, actual);

    }
}