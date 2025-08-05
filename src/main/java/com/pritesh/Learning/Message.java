package com.pritesh.Learning;

public class Message {


//    static void message(int i){
//        System.out.println("Hello world " + i);
//    }
    static int table2(int n){
        if(n == 0){
            return 0;
        }
      System.out.println(2 * n);
      table2(n -1);
      return 0;
    }

    public static void main(String[] args) {
        // recursion
//        for (int i = 0; i < 5; i++) {
//            if(i == 3){
//                continue;
//            }
////            message(i);
//        }

        table2(10);


    }


}
