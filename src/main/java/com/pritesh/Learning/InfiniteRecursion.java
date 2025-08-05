package com.pritesh.Learning;

public class InfiniteRecursion {

    static void function(){
        System.out.println(1);
        function();
    }

    public static void main(String[] args){
        function();
    }
}
