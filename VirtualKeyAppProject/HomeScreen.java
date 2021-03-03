package VirtualKeyAppProject;

import java.util.ArrayList;

public class HomeScreen implements DisMenus{
	
	static String ln = "--------------------------------------------\n";
	static String wt = "Welcome to the Virual Key Application\n"; 
	static String dev = "By: Gregorio J. Lopez\n";
	static String selOp = "Please choose one of the following options (integers only): "; 
	static ArrayList<String> welopts = new ArrayList<String> (); 
	
	public static void welcomeOptions () { 
		welopts.add("1. Display Existing Files ->");
		welopts.add("2. Display File Options Menu ->");
		welopts.add("3. Quit Application ->");
	}
	
	public static void displayMenu () {
		
		DisMenus.display(ln);
		DisMenus.display(wt);
		DisMenus.display(dev);
		DisMenus.display(selOp);
	
		for (String s : welopts) {
			System.out.println(s);
		}
	}

	public void userOptions () { 
	
		int uop = DisMenus.GetUInt(); //calls interface for user input for integer
		this.DisOptions(uop); 
		
	}

	@Override
	public void DisOptions (int option) {
		
		switch (option) {
		case 1: 
			FileManipulation.DisplayExFiles(); //Displays existing files 
			
			break; 
		case 2: 
			FileOpScreen fos = new FileOpScreen (); //go to FileOpScreen
			fos.DisplayMenu();
			fos.UserOptions();
			 
			break; 
		case 3: 
			DisMenus.Exit(); //exit app
			
			break; 
		default: 
			System.err.println("\nYou have input an invalid value! Please input 1-3.");
			break; 
		}
	
	}
	
}
