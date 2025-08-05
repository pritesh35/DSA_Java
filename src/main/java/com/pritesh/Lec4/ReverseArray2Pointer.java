package com.pritesh.Lec4;

import java.util.Scanner;

public class ReverseArray2Pointer {

    static void reverse(int arr[], int left, int right){
        if(left >= right){
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverse(arr, left + 1, right -1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};

        reverse(arr,0,arr.length -1);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
