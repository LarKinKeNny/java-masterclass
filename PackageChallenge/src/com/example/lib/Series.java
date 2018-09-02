package com.example.lib;



public class Series {

    public Series() {
    }

    public static int nSum(int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum+=i;
        }
        return sum;
    }

    public static int factorial(int n){
        int product = 1;
        if(n == 0) return 1;
        for(int i = 1; i <= n; i++){
            product *= i;
        }
        return product;
    }

    public static int fibonacci(int n){
        int fib0 = 0;
        int fib1 = 1;
        int fib2 = 0;
        if(n == 0) return fib0;
        if(n == 1) return fib1;
        for(int i = 1; i < n ; i++){
            fib2 = fib0 + fib1;
            fib0 = fib1;
            fib1 = fib2;
        }
        return fib2;
    }
}
