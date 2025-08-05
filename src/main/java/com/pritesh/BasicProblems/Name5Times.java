package com.pritesh.BasicProblems;

public class Name5Times {
    static void name(int n){
        if(n == 5){
            return;
        }
        System.out.println("Person " + n);
        n++;
        name(n);
    }
    public static void main(String[] args){
        int n = 0;
        name(n);
    }
}
