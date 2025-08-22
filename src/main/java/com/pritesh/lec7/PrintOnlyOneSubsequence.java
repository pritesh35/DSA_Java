package com.pritesh.lec7;

import java.util.ArrayList;

public class PrintOnlyOneSubsequence {

    static boolean f(int i, ArrayList<Integer> list, int[] arr, int sum, int k){
        int n = arr.length;
        if(i == n){
            if(sum == k){
                System.out.println(list);
                return true;
            }
            return false;
        }

        // pick
        list.add(arr[i]);
        sum += arr[i];
        if(f(i + 1, list, arr, sum, k) == true){
            return true;
        }

        // not pick
        list.remove(list.size() - 1);
        sum -= arr[i];
        if(f(i + 1, list, arr, sum, k) == true){
            return true;
        }


        return false;
    }

    public static void main(String[] args) {
        int arr[] = {-2,2,5,9};
        int k = 7;
        ArrayList<Integer> list = new ArrayList<>();

        f(0, list, arr, 0, k);

    }
}
