package com.company;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;

public class Fibonacci {
    public int FibonacciZehr(int N){
        //base cases
        if(N==0||N==1){
            return N;
        }


        //recursive calls

        int fibN1 = FibonacciZehr(N-1);
        int fibN2 = FibonacciZehr(N-2);
        return fibN1+fibN2;
    }

    public int FibonacciOpt(int N,int[] qb){
        if(N==0||N==1){
            return N;
        }

        //Integer[] qb = Collections.nCopies(N,0).toArray(new Integer[0]);
      //base case
      if(N==1||N==0){
          return N;
      }
        if (qb[N]!=0) {
            return qb[N];
        }


      int FibN1= FibonacciOpt(N-1,qb);
      int FibN2 = FibonacciOpt(N-2,qb);
      int Fib = FibN1+FibN2;
      qb[N] = Fib;

        return Fib;

    }

    //fibonacci tabulated
    public int FibonacciTab(int n){
        //iterative approach
        Integer[] table = Collections.nCopies(n+1,0).toArray(new Integer[0]);
        table[0] = 0;
        table[1] = 1;
        for(int x = 2;x<=n;x++){
            table[x] = table[x-1]+table[x-2];
        }

        return table[n];


    }




}
