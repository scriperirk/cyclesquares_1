package ru.netology.SQRService;

public class Calc {
    public int sqrtcalc(int numder, int max, int min) {
        int score = 0;
        for (int i = 10; i <= numder; i++)
            if (i * i >= min | i * i <= max) {
                score++;
                return i;
            }
        return 0;
    }
}
