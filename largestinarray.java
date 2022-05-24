package com.akshat;
//Java program to demonstrate
//working of Arrays.toString()

import java.io.*;
import java.util.*;

class problems {
	public static void main(String[] args)
	{
		int[] myarray = {10,12,13,14,1005,14};
		
		
		
		System.out.println("Original array" + Arrays.toString(myarray));
		
		int temp = myarray[0];
		System.out.println(temp);
		for(int i=0;i<myarray.length;i++) {
			if(myarray[i] >= temp) {
				temp = myarray[i];
			}
		}
		System.out.println("The largest numbr is"+temp);
		
	}
}


	


