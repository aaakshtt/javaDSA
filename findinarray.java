package com.akshat;
import java.util.*;

public class Arrays {
	public static void main(String[] args) {
		int[] array = new int[] {11,12,14,15,18};			//Create an array
		int tofind  = 15;
		for(int i =0;i<array.length ;i++) {
			if(array[i] == tofind) {
				System.out.println("Index position of 15 is" +i);
			}
			
		}
	}
}


