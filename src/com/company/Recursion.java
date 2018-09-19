package com.company;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Recursion {
    public void printDecreasing(int N) {
        if (N == 0) {
            return;
        }

        System.out.println(N);
        printDecreasing(N - 1);

    }

    public int powerRecursive(int base, int exp) {
        //basecase
        if (exp == 1) {
            return base;
        }
        if (exp == 0) {
            return 1;
        }

        int baseexp1 = powerRecursive(base, exp - 1);
        return (base * baseexp1);


    }

    //==============funding largest element in an array using recursion====================
    public int largestEle(int[] haystack, int idx, int max) {


        //basecase
        if (idx == haystack.length - 1) {
            return haystack[idx];
        }
        int maxSubArr = largestEle(haystack, idx + 1, max);
        if (maxSubArr > haystack[idx]) {
            max = maxSubArr;
        } else {
            max = haystack[idx];
        }
        return max;
    }

    //find an element in an array
    public boolean isPresent(int n, int[] haystack, int idx) {
        if (idx == haystack.length - 1) {
            return false;
        }


        boolean nstk1 = isPresent(n, haystack, idx + 1);
        if (nstk1) {
            return true;
        } else {
            if (haystack[idx] == n)
                return true;
        }

        return false;
    }

    //=====================================find firstIdx of occurence============================================
    public int firstIdx(int key, int[] haystack, int idx) {

        if (idx == haystack.length - 1) {
            return idx;
        }


        if (key == haystack[idx]) {
            return idx;
        } else {
            int findidx1 = firstIdx(key, haystack, idx + 1);
            return findidx1;
        }
    }


    //=====================================find Last index of occurence==========================================

    public int lastIdx(int key, int[] arr, int idx) {
        //basecase
        if (idx == 0) {
            return idx;
        }


        if (key == arr[idx]) {
            return idx;
        } else {
            int lastidx = lastIdx(key, arr, idx - 1);
            return lastidx;
        }


    }


    //===================================find all indices of occurence===========================================

    public ArrayList<Integer> allIdx(int key, int[] arr, int idx) {
        ArrayList<Integer> indices = new ArrayList<>();//returning an arraylise of indices
        if (idx == arr.length) {
            return new ArrayList<>();
        }

        indices = allIdx(key, arr, idx + 1);
        if (key == arr[idx]) {
            indices.add(idx);
        }

        return indices;
    }

    //===================================================get subsequences===============================================
    public ArrayList<String> getSS(String str) {
        /*if(idx==str.length()-1){
            return new ArrayList<>();

        }
        ArrayList<String> subsequences = new ArrayList<>();



        subsequences = getSS(str.substring(idx+1),idx+1);
        for(String s:subsequences){
            subsequences.add(str.charAt(idx)+s);
            subsequences.add(str.charAt(idx)+"");
        }
        return subsequences;*/
        if (str.length() == 0) {
            ArrayList<String> newList = new ArrayList<String>();
            newList.add("");
            return newList;
        }


        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rr = getSS(ros); //expectation
        ArrayList<String> ans = new ArrayList<String>();
        for (String s : rr) {
            ans.add(ch + s);
            ans.add("" + s);
        }
        return ans;

    }

    //========================================subsequences with ascii====================================================
    public ArrayList<String> getSSascii(String str) {
        if (str.length() == 0) {
            ArrayList<String> baseList = new ArrayList<String>();
            baseList.add("");
            return baseList;
        }


        char ch = str.charAt(0);
        int chascii = (int) ch;
        String ros = str.substring(1);
        ArrayList<String> rr = getSSascii(ros);
        ArrayList<String> ans = new ArrayList<>();
        for (String s : rr) {
            ans.add(ch+s);
            ans.add(chascii+s);
            ans.add(""+s);
        }

        return ans;
    }

    //====================================================================================================================

    public ArrayList<String> getKeyPadCombinations(String str){

        //base case
        if(str.length()==0){
            ArrayList<String> baseList = new ArrayList<>();
            baseList.add("");
            return baseList;
        }
        String[] keypad = new String[]{"abc","def","ghi","jkl","mno","pqr","st","uvwx","yz"};
        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rr = getKeyPadCombinations(ros);
        ArrayList<String> ans = new ArrayList<>();
        for(String s:rr){
            String code = keypad[ch-'0'];
            for(int i = 0;i<code.length();i++){
                ans.add(code.charAt(i)+s);
            }
        }
        return ans;

    }
    //================================================================================================================
    public void printSS(String qsf,String asf) {
        //base case
        if (qsf.length() == 0) {
            System.out.println(asf);
            return;
        }

        char ch = qsf.charAt(0);   //   A seperated
        String remainderQues = qsf.substring(1);   //BC in this case
        printSS(remainderQues, asf);
        printSS(remainderQues, asf + ch);
    }
//======================================================================================================================
        public void printSSwithAscii(String qsf,String asf){
            //base case
            if(qsf.length()==0){
                System.out.println(asf);
                return;
            }

            //this is like the similar tree just with 3 branches
            char ch = qsf.charAt(0);
            String remques = qsf.substring(1);
            printSSwithAscii(remques,asf);
            printSSwithAscii(remques,asf+ch);
            printSSwithAscii(remques,asf+(int)ch);


        }
        //==============================================================================================================




    }

