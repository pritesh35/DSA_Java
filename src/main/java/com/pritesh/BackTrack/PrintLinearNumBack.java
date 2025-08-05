package com.pritesh.BackTrack;

public class PrintLinearNumBack {

    static void printBack(int i, int n){
        if(i > n){
            return;
        }
        printBack(i + 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {

        int n = 6;
        printBack(0, n);
    }

}
