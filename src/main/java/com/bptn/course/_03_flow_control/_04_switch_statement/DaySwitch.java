package com.bptn.course._03_flow_control._04_switch_statement;

public class DaySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//example switch statement for reference
		int day = 4;
	    switch (day) {
	      case 1:
	        System.out.println("Monday");
	        break;
	      case 2:
	        System.out.println("Tuesday");
	        break;
	      case 3:
	        System.out.println("Wednesday");
	        break;
	      case 4:
	        System.out.println("Thursday");
	        break;
	      case 5:
	        System.out.println("Friday");
	        break;
	      case 6:
	        System.out.println("Saturday");
	        break;
	      case 7:
	        System.out.println("Sunday");
	        break;
	    }
	    
	    //example with break and default
	    
	    int days = 4;
	    switch (days) {
	      case 6:
	        System.out.println("Today is Saturday");
	        break;
	      case 7:
	        System.out.println("Today is Sunday");
	        break;
	      default:
	        System.out.println("Looking forward to the Weekend!");
	    }    
	    
	    for(int i = 0; i < 10; i++) {
            if(i == 4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("We've broken out of the loop!");
        
        
        for(int i = 0; i <= 6; i++) {
            if(i == 4) {
            	//The continue keyword is like a mini-break. In the code above, we skip over the println statement when i = 4.
                continue;
            }
            System.out.println(i);
        }
        System.out.println("We've finished the loop!");

	}

}
