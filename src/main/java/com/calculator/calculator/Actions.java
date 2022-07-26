package com.calculator.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


@Service
public class Actions implements Interface {
    public String greeting() {
        return "Добро пожаловать в калькулятор!";
    }


    public int action1(@RequestParam int num1, @RequestParam int num2) {
        return num1 + num2;
    }

    public int action2(@RequestParam int num1, @RequestParam int num2) {
        return num1 - num2;

    }

    public int action3(@RequestParam int num1, @RequestParam int num2) {
        return num1 * num2;

    }
    public int action4(@RequestParam int num1, @RequestParam int num2) {
            return num1 / num2;

        }

}



