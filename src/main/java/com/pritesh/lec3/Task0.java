package com.pritesh.lec3;

import java.util.Scanner;

public class Task0 { // to find factorial of num n

    static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        System.out.println(fact(n));
    }
}
