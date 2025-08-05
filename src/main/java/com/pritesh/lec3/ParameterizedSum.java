package com.pritesh.lec3;

import java.util.Scanner;

public class ParameterizedSum { // it does not used to return the value it's like for loop
    static void sum(int i, int sum){
        if(i == 0){
            System.out.println(sum);
            return;
        }
        sum(i - 1, sum + i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sum(n,0);

    }
}
