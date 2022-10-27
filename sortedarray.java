package com.company;

import java.util.Arrays;
import java.io.*;
public class GFG {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(sorting(arr));
        System.out.println(sorted(arr,0));


    }
    static boolean sorting(int [] arr){
        boolean ans = false;
        for (int i= arr.length-1;i>0;i--){
            if (arr[i] >arr[i-1])
                ans = true;
            else {
                ans = false;
                break;
            }
        }
        return ans;

    }
    static boolean sorted(int[] arr,int index){
        if (index == arr.length-1){
            return true;
        }
        if (arr[index]<arr[index+1]) {
            return sorted(arr, index + 1);
        }
        else {
            return false;
        }

    }
    }
