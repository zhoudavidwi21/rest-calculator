package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private Calculator calculator = new Calculator();

    /**
     * Does sum calculation
     * @param a
     * @param b
     * @return sum int
     */
    @RequestMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b){
        return calculator.sum(a, b);
    }

    @RequestMapping("/sqr")
    public int sqr(@RequestParam int a){
        return calculator.sqr(a);
    }

    @RequestMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b){
        return calculator.multiply(a, b);
    }

    @RequestMapping("/division")
    public double division(@RequestParam int a, @RequestParam int b){
        return calculator.division(a, b);
    }

    @RequestMapping("/abs")
    public int abs(@RequestParam int a){
        return calculator.abs(a);
    }

    @RequestMapping("/pow")
    public double pow(@RequestParam int a, @RequestParam int b){
        return calculator.pow(a, b);
    }

    @RequestMapping("/min")
    public int min(@RequestParam int a, @RequestParam int b){
        return calculator.min(a, b);
    }
}
