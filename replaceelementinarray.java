package com.akshat;
//Java program to demonstrate
//working of Arrays.toString()

import java.io.*;
import java.util.*;

class problems {
	public static void main(String[] args)
	{
		int[] myarray = {10,12,13,14,15,14};
		
		int indexpos = 3;
		int inser = 200;
		
		System.out.println("Original array" + Arrays.toString(myarray));
		
		for(int i = 0;i < indexpos;i++) {
			myarray[i] = myarray[i+1];
		}
		myarray[indexpos] = inser;
		System.out.println("New Array: "+Arrays.toString(myarray));

	}
}


	


