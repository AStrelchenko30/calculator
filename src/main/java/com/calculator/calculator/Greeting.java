package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
    private final Interface actions;

    public Greeting(Interface actions) {
        this.actions = actions;
    }

    @GetMapping(path = "/calculator")
    public String greeting() {
        return actions.greeting();
    }

    @GetMapping(path = "/calculator/plus")
    public String action1(@RequestParam int num1, @RequestParam int num2) {
        return actions.action1(num1, num2);

    }

    @GetMapping(path = "/calculator/minus")
    public String action2(@RequestParam int num1, @RequestParam int num2) {
        return actions.action2(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String action3(@RequestParam int num1, @RequestParam int num2) {
        return actions.action3(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String action4(@RequestParam int num1, @RequestParam int num2) {
        return actions.action4(num1, num2);
    }
}


