package com.pritesh.lec6;

import java.util.*;

public class printAllSubsequences {
    static void printAll(int index, int[] arr, int n, List<Integer> temp){
        if(index >= n){
            System.out.println(temp);
            return;
        }
        temp.add(arr[index]);
        printAll(index + 1, arr, n, temp);
        temp.remove(temp.size() - 1 );
        printAll(index + 1, arr, n, temp);
    }

    public static void main(String[] args){
        List<Integer> temp = new ArrayList<>();
        int[] arr = {3, 1, 2};
        printAll(0, arr, arr.length,temp);
    }
}
