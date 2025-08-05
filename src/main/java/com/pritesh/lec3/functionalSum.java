package com.pritesh.lec3;

import java.util.*;

public class functionalSum { // it is used to return the value
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        System.out.println(sum(n));
    }
}
