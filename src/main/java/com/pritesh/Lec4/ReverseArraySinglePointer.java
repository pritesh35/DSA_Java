package com.pritesh.Lec4;

import java.util.Scanner;

public class ReverseArraySinglePointer {

        static void reverse(int arr[], int i){
            int n = arr.length;
            if(i >= n/2){
                return;
            }
            int temp = arr[i];
            arr[i] = arr[n -1 - i];
            arr[n -1 - i] = temp;
            reverse(arr, i+ 1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int arr[] = {1, 2, 3, 4, 5};

            reverse(arr,0);

            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }
    

}
