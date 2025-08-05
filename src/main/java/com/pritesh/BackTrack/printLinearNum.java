package com.pritesh.BackTrack;

import java.util.Scanner;

public class printLinearNum {

    static void printNum(int i, int n){
        if(i == 0){
            return;
        }
        printNum(i - 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {

//    print 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digit");
        int n = sc.nextInt();
        printNum(n,n);

    }
}
