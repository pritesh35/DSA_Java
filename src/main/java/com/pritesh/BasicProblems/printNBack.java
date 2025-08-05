package com.pritesh.BasicProblems;

import java.util.Scanner;

public class printNBack {

    static void printBack(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        num--;
        printBack(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        printBack(num);

    }
}
