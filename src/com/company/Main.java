package com.company;

import java.sql.Time;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //==================Fibonacci==================================================
       /* int N = 10;
        Fibonacci fb = new Fibonacci();
        long start = System.currentTimeMillis();
        System.out.println(fb.FibonacciZehr(N));
        long end = System.currentTimeMillis();
        System.out.println("time required by FibonaciZehr - "+(end-start));

        long s = System.currentTimeMillis();
        System.out.println(fb.FibonacciOpt(N,new int[11]));
        long e = System.currentTimeMillis();
        System.out.println("time required by FibonacciOpt - "+(e-s));

        long st = System.currentTimeMillis();
        System.out.println(fb.FibonacciTab(N));
        long et = System.currentTimeMillis();
        System.out.println("time required by FibonacciTab - "+(et-st));
        //======================Count Board Paths==========================================
        CountBoardPath cbp = new CountBoardPath();*/
        //=======================Recursion=================================================
        Recursion rr = new Recursion();
        rr.printDecreasing(10);
        System.out.println("power recursive - ");
        long sst =System.currentTimeMillis();
        System.out.println(rr.powerRecursive(2,14));
        long est = System.currentTimeMillis();
        System.out.println("time taken by power recursive - "+(est-sst));
        System.out.println("recursive Largest Element - ");
        int[] arr = new int[]{5,7,23,4,9,23,3,6,5,23};
        System.out.println(rr.largestEle(arr,0,Integer.MIN_VALUE));
        System.out.println("finding an element in an array Recursively - ");
        System.out.println(rr.isPresent(5,arr,0));
        System.out.println("returning the first element of occurence - ");
        System.out.println(rr.firstIdx(23,arr,0));
        System.out.println("returning the last elelement of occurence - ");
        System.out.println(rr.lastIdx(23,arr,arr.length-1));
        System.out.println("all indices of occurrence - ");
        System.out.println( rr.allIdx(23,arr,0));
        System.out.println("print all subsequences - ");
        System.out.println(rr.getSS("abc"));
        System.out.println("print all subsequences with ascii - ");
        System.out.println(rr.getSSascii("abc"));
        //System.out.println("Get Keypad combinations - ");
        //System.out.println(rr.getKeyPadCombinations("179"));
        System.out.println("printing subsequences space optimised - ");
        rr.printSS("ABC","");
        System.out.println("printing subsequences space optimised with ASCII");
        rr.printSSwithAscii("abc","");

    }
}
