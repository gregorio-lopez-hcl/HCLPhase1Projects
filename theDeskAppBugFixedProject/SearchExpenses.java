package theDeskAppBugFixedProject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchExpenses {
	
	public void searchUExpenses(ArrayList<Integer> temparr) {
	
		int cap = temparr.size();
		int userexp = 0; 
		System.out.println("Please enter the expense you would like to search: \t" );
		Scanner uexp = new Scanner(System.in);
		
		
		try {
		userexp = uexp.nextInt();
		}catch (InputMismatchException e) {
			System.err.println("\nYou have entered in an invalid value, please use an integer!");
		}
		for (int ipos =0; ipos < cap; ipos ++) {
				if (temparr.get(ipos) == userexp) {
						int exvalue = temparr.get(ipos); 
						System.out.println("\nThe expense you entered has been found and is recorded: " + exvalue  + ".\n");
						return;
					}
				 
				
				}
				
				System.out.println("\nThe expense you entered has not been found. Please re-enter: \n");
				
			} 
}
		


	
	 
//Complete the method, OP 5 searching for particular expense, linear search
 