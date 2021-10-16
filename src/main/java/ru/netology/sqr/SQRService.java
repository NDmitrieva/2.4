package ru.netology.sqr;

public class SQRService {
    public int numSqr(int lim1, int lim2) {
        int counter = 0; {
            for (int i = 10; i <= 99; i++) {
                if (i * i >= lim1 && i * i <= lim2) counter++; {
                    System.out.println("Колчество чисел, попадающих в диапазон: " + counter);
                }
            }
        }
        System.out.println("Тест завершен");
        return counter;
    }
}
