package com.pritesh.Learning;


public class FiniteRecursion {

    static void function(int count){
//        base condition
        if(count == 4){
            return;
        }
        System.out.println(count);
        count++;
        function(count);
    }

    public static void main(String[] args) {
        int count = 0;
//        print numbers upto 3;
        function(count);
    }
}
