package com.akshat;
//Java program to demonstrate
//working of Arrays.toString()

import java.io.*;
import java.util.*;

class problems {
	public static void main(String[] args)
	{
		int[] myarray = {10,12,13,14,1005,8};
		
		
		
		System.out.println("Original array" + Arrays.toString(myarray));
		
		int temp = myarray[0];
		System.out.println(temp);
		for(int i=0;i<myarray.length;i++) {
			if(myarray[i] >= temp) {
				temp = myarray[i];
			}
		}
		System.out.println("The maximum number in array is  "+temp);
		
		int small = myarray[0];
		for(int i =0;i<myarray.length;i++) {
			if(myarray[i] <= small) {
				small = myarray[i];
			}
		}
		System.out.println("The smallest number is array is "+ small );
		
	}
}


	


