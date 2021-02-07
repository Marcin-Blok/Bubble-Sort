package com.marcin.fibonacci.form;

class FibonacciForm {

    public static void fibonacciForm(int n){
        int a = 0;
        int b = 1;
        while (a <= n){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }


    public static void main(String[] args) {

        int n = 444;

        fibonacciForm(n);


    }
}
