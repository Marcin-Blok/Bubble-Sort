package com.marcin.fibonacci.form;

class FibonacciForm {

    int n;
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

        fibonacciForm(444);


    }
}
