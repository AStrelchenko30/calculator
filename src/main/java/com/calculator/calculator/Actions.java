package com.calculator.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


@Service
public class Actions implements Interface {
    public String greeting() {
        return "Добро пожаловать в калькулятор!";
    }


    public String action1(int num1, int num2) {
        int sum = num1 + num2;
        return (num1 + "+" + num2 + "=" + sum);
    }

    public String action2(int num1, int num2) {
        int minus = num1 - num2;
        return num1 + "-" + num2 + "=" + minus;
    }

    public String action3(@RequestParam int num1, @RequestParam int num2) {
        int multip = num1 * num2;
        return num1 + "*" + num2 + "=" + multip;
    }
    public String action4(@RequestParam int num1, @RequestParam int num2) {
        if (num1 == 0 || num2 == 0) {
            return "Ошибка в данных";
        }else {
            int divide = num1 / num2;
            return num1 + "/" + num2 + "=" + divide;
        }
    }

}
