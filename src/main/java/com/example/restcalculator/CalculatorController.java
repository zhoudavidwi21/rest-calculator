package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    /**
     * Does sum calculation
     * @param a int
     * @param b int
     * @return sum int
     */
    @RequestMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b){
        return a + b;
    }
}
