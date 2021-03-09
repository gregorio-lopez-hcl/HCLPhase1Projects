package LongestSSApp;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UGenArr {
	
	//creating all necessary variables and objects needed
	static int ui = 0;
	int assign; 
	Scanner inp = new Scanner(System.in); 
	Random ran = new Random (); 
	static ArrayList<Integer> uArrList = new ArrayList<Integer>(ui); 
	
	
	
	public UGenArr() { 
	
	//accept user input to determine length of arraylist 
	System.out.println ("Please enter the capacity of the array you would like to generate: ");
	ui = inp.nextInt();
	 
	//assign random elements to specified user length of array 
	for (int i = 0; i < ui; i ++) {
		assign = ran.nextInt(100);
		uArrList.add (assign);	
		}
	//print out ArrayList
	System.out.println("You have succesffully generated an array with the length: '" + ui + "' with the contents of: '" + uArrList + "'");
	
		
	}



	public static ArrayList<Integer> getuArrList() {
		return uArrList;
	}



	public static void setuArrList(ArrayList<Integer> uArrList) {
		UGenArr.uArrList = uArrList;
	}

	


}
