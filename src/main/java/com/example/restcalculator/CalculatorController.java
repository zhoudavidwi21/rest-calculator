package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    /**
     * Does sum calculation
     * @param a
     * @param b
     * @return sum int
     */
    @RequestMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b){
        return a + b;
    }

    @RequestMapping("/sqr")
    public int sqr(@RequestParam int a){
        return a * a;
    }

    @RequestMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b){
        return a * b;
    }

    @RequestMapping("/division")
    public double division(@RequestParam int a, @RequestParam int b){
        return (double)a / (double)b;
    }

    @RequestMapping("/abs")
    public int abs(@RequestParam int a){
        return Math.abs(a);
    }

    @RequestMapping("/pow")
    public double expo(@RequestParam int a, @RequestParam int b){
        return Math.pow(a, b);
    }

    @RequestMapping("/min")
    public int min(@RequestParam int a, @RequestParam int b){
        return Math.min(a, b);
    }
}
