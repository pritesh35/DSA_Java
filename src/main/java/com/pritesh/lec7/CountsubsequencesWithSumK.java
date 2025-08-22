package com.pritesh.lec7;

import java.util.ArrayList;

public class CountsubsequencesWithSumK {
    static int f(int[] arr, ArrayList<Integer> list, int  i, int sum, int k){
        int n = arr.length;
        if(i == n ){
            if(sum == k){
                return 1;
            }else{
                return 0;
            }
        }
//        take
        list.add(arr[i]);
        sum += arr[i];
        int left = f(arr,list,i +1, sum, k);
//        not-take
        list.remove(list.size() - 1);
        sum -= arr[i];
        int right = f(arr,list,i +1, sum, k);
        return left + right;
    }
    public static void main(String[] args) {
        int arr[] = {-2,2,5,9};
        int k = 9;
        ArrayList<Integer> list = new ArrayList<>();

        int count = f(arr, list, 0, 0, k);
        System.out.println(count);
    }
}
