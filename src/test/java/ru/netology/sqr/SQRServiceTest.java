package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSqrLim1Lim2numSqr() {
        SQRService service = new SQRService();

        int num1 = 200;
        int num2 = 300;
        int expected = 3;

        int actual = service.numSqr(num1,num2);

        assertEquals(expected,actual);
    }
}