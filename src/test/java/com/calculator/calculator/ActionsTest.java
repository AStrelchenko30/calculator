package com.calculator.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActionsTest {

    int num1;
    int num2;

    @BeforeEach
    public void setUp() {
        num1 = 4;
        num2 =2;
    }

    @Test
    public void division() {
        if (num2 == 0) {
            throw new IllegalArgumentException("Делить на ноль НЕЛЬЗЯ!");
        } else {
            double res = num1 / num2;
            assertEquals(2, res);
        }
    }

    @Test
    public void plusNums() {
        int res=num1+num2;
        assertEquals(6,res);
    }
    @Test
    public void minusNums(){
        int res=num1-num2;
        assertEquals(2, res);
    }

    @Test
    public void multiNums() {
        int res=num1*num2;
        assertEquals(8,res);

    }
}


