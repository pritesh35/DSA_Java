package com.pritesh.lec5;

public class fibonacci {

    static int fibo(int n){
        if(n <= 1){
            return n;
        }
        int last = fibo(n-1);
        int sLast = fibo(n-2);
        return last + sLast;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibo(n));
    }
}
