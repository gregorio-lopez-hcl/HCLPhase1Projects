package VirtualKeyAppProject;

import java.util.ArrayList;

public class HomeScreen implements DisMenus{
	
	String wt = "\nWelcome to the Virual Key Application\n"; 
	String dev = "By: Gregorio J. Lopez\n";
	String selOp = "Please choose one of the following options (input an number): "; 
	private ArrayList<String> welopts = new ArrayList<String> (); 
	
	public void welcomeMenu () { 
		welopts.add("1. Display Existing Files ->");
		welopts.add("2. Display File Options Menu ->");
		welopts.add("3. Quit Application ->");
	}
	
	public void DisplayMenu () {
		
		DisMenus.display(wt);
		DisMenus.display(dev);
		
		for (String i : welopts) {
			DisMenus.display(i);
		}
	}

	public void UserOptions () { 
		DisMenus.display(selOp);
		int uop = DisMenus.GetUInt();
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
			System.err.println("You have input an invalid value! Please input 1-3.");
			break; 
		}
	
	}
	
}
