package com.pritesh.lec6;

import java.util.*;

public class printallSubsequences {
    static void f(int i , ArrayList<Integer> temp, int[] arr){
        if(i >= 3){
            System.out.println(temp);
            return;
        }
        temp.add(arr[i]);
        f(i+1,temp,arr);
        temp.remove(temp.size() - 1);
        f(i+1,temp,arr);
    }
    public static void main(String[] args){
        int [] arr = {3,1,2};
        ArrayList<Integer> temp = new ArrayList<>();

        f(0,temp, arr);
    }
}
