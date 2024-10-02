package com.bptn.course._200_CodioPractice;

public class StaticVariable {
	  //add a static variable to count how many times the verse method is called
	  private static int numOfVerse = 0; 

	  //update the method to increment the counter
	  public static void verse(String animal, String noise) {
	    System.out.println( "Old MacDonald had a farm" );
	    System.out.println( "E-I-E-I-O" );
	    System.out.println( "And on that farm he had a " + animal );
	    System.out.println( "E-I-E-I-O" );
	    System.out.println( "With a " + noise + "-" + noise + " here") ;
	    System.out.println( "And a " + noise + "-" + noise + " there" );
	    System.out.println( "Here a " + noise + ", there a " + noise );
	    System.out.println( "Everywhere a " + noise + "-" + noise );
	    System.out.println( "Old MacDonald had a farm" );
	    System.out.println( "E-I-E-I-O" );

	    //increment the counter value
	    numOfVerse++;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 verse( "cow" , "moo" );
		    verse( "duck" , "quack" );
		    //add a few more verses
		    verse("pig", "oink");
		    verse("frog", "ribbit");


		    //print the counter value
		    System.out.println(numOfVerse);

	}

}
