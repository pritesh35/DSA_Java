package com.pritesh.BasicProblems;

import java.util.*;
public class PrintN {

    static void printNum(int num, int n){
        if(num == n){
            return;
        }
        System.out.println(num);
        num++;
        printNum(num, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digit");
        int n = sc.nextInt();

        int num = 1;
        printNum(num, n +1);
    }


}
