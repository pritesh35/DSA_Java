package com.pritesh.lec7;

import java.util.ArrayList;

public class SubsequenceWithSumK {
    static void f(int i, ArrayList<Integer> list, int k, int sum, int[] arr){
        int n = arr.length;

        if(i == n){
            if(sum == k){
                System.out.println(list);
            }
            return;
        }
        list.add(arr[i]);
        sum += arr[i];
        f(i + 1, list, k, sum, arr);
        sum -= arr[i];
        list.remove(list.size() - 1);
        f(i + 1, list, k, sum, arr);


    }
    public static void main(String[] args) {
        int arr[] = {2, 9, 5, 6, 2 , 3};
        int k = 8;
        ArrayList<Integer> list = new ArrayList<>();
        f(0, list, k, 0, arr);

    }
}
