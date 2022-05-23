package com.akshat;
import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		int[] myarray = new int[] {10,22,3,4,5,6};			//Create an array
		int sum = 0;										//Default sum is zero
		for(int i =0;i< myarray.length; i++) {				//To collect and transverse through the elements
			sum = sum +myarray[i];							//Add sum
		}
			float average  = sum/myarray.length;
			System.out.println("The average is"+average);
		

	}
}

