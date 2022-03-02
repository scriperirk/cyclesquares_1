package ru.netology.SQRService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class СalcTesting {
    @Test
    void shoulSqrtCalc() {
        Сalc service = new Сalc();
        int num = 9;
        int expected = 3;

        int actual = service.SqrtCalc(num);

        assertEquals(expected, actual);

    }
}