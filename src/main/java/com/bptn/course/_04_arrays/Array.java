package com.bptn.course._04_arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] myArray = {3,5,7,9,11,13};
		
		System.out.println("First element: " +  myArray[0]);
		
		System.out.println("Second element: " + myArray[1]);
		
		myArray[0] = 30;
		
		System.out.println("Updated last element: " + myArray[myArray.length-1]);
		
		myArray[myArray.length-1] = 130;
		
		for (int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		//Enhance for loop (for each loop
		for (int element: myArray) {
			System.out.println(element);
		}
		
		//how to print all the elements in an array
		System.out.println(Arrays.toString(myArray));
		
		int[][] matrix = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			};
			for (int i = 0; i < matrix.length; i++) {
			    for (int j = 0; j < matrix[i].length; j++) {
			    	
			        System.out.print(matrix[i][j] + " ");
			    }
			    System.out.println();
			}

	}
}
