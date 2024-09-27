package com.bptn.course._03_flow_control._02_for_loop;

public class PrintEvenFrom0to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10,20,30,40,50};
		
		// Approach 1 for even number
	/*	for (int i = 2; i<=100; i +=2 ) {
			System.out.println(i);
		}*/
		
		// Approach 2 for even number
		for (int i=1; 1<=100; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
			
		}


}

}