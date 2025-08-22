package com.pritesh.lec7;

import java.util.ArrayList;

public class printNSubsequences {
    static int count;
    static void f(int i, ArrayList<Integer> list, int[] arr, int sum, int k){
        int n = arr.length;
        if(count == 0){
            return;
        }
        if(i == n){
            if(sum == k){
                System.out.println(list);
                count--;
                return;
            }
            return ;
        }
//        take
        list.add(arr[i]);
        sum += arr[i];
        f(i + 1,list,arr,sum,k);
//        not take
        list.remove(list.size() - 1);
        sum -= arr[i];
            f(i + 1,list,arr,sum,k);
    }
    public static void main(String[] args) {
        count = 2;
        int arr[] = {4, 9, 5, 2, 3, 6};
        int k = 9;
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        f(0, list,arr,sum,k);
    }
}
