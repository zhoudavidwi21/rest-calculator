package com.example.restcalculator;

public class Calculator {

    public int sum(int a, int b){
        return a + b;
    }

    public int sqr(int a){
        return a * a;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public double division(int a, int b){
        return (double) a / (double)b;
    }

    public int abs(int a){
        return Math.abs(a);
    }

    public double pow(int a, int b){
        return Math.pow(a, b);
    }

    public int min(int a, int b){
        return Math.min(a, b);
    }
}
