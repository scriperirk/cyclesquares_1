package ru.netology.SQRService;

public class Сalc {
    public int SqrtCalc(int numder) {
        for (int i = 0; i <= numder; i++) {
            if (i * i >= numder) {
                return i;
            }
        }
        return 0;
    }
}
