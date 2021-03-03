package VirtualKeyAppProject;

import java.util.Scanner;

//has several highly utilized methods that perform basic user input or general functions
public interface DisMenus {
	//displays strings
	public static void display(String dis) {
		System.out.println(dis);
	}
	
	//for navigating switches in user menus
	public void DisOptions (int option); 
	
	//supposed to allow user input in int format
	public static int GetUInt () {
		Scanner input = new Scanner(System.in); 
		int temp = 0;
		try {
		 temp = input.nextInt();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return temp;
		
	}
	
	//supposed to allow user input for strings
	public static String GetUStr () {
		Scanner input = new Scanner(System.in); 
		return (input.nextLine());
	}
	
	//a simple exit method
	public static void Exit () { 
		System.err.println("\nYou are now closing the Virtual Key App.....");
		System.exit(0);  
		
	}

	
}
