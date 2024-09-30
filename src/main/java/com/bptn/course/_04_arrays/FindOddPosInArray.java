package com.bptn.course._04_arrays;

public class FindOddPosInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10,20,30,40,50};
		
		//approach 1 for finding odd values
		
		for(int i=1; i<numbers.length; i+=2) {
			System.out.println(numbers[i]);
		}
		
		//approach 2
		for (int i=0; i<numbers.length; i++) {
			if(i%2 != 0) {
				System.out.println(numbers[i]);
			}
		}
	}
}

