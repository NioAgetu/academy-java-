package com.bptn.course._13_exceptions._01_checked_exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExemptionExample {
	
	//create a method which reads a file
	
	public static void readFile(String fileName) throws FileNotFoundException {
		//create an object of FileReader
		FileReader fileReader = new FileReader(fileName);
	}

	public static void main(String[] args)  {
		
		try {
			readFile("Result.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
//Filenot found is a checked exception where java wants you to tend to it before running
//
