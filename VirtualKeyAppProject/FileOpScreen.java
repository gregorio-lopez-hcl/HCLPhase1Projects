package VirtualKeyAppProject;

import java.util.ArrayList;

public class FileOpScreen implements DisMenus {

	String subm = "\n------------------------------------------------------- \nWelcome to the File Options Submenu, please choose an option (integers only): ";
	ArrayList<String> fopts = new ArrayList<String>(); 
	
	public void fileOpScreen () { 
		
		fopts.add("1. Add a file ->");
		fopts.add("2. Remove a file ->");
		fopts.add("3. Search for a file ->");
		fopts.add("4. Return to Home Screen ->");
	}
	
	public void DisplayMenu () {
		fileOpScreen();
		DisMenus.display(subm);
		
		for (String i: fopts) {
			System.out.println(i);
		}
	}
	
	public void UserOptions () { 
		int uop = DisMenus.GetUInt();
		this.DisOptions(uop); 
	}
	
	@Override
	public void DisOptions (int option) {
		
		switch (option) {
		case 1: 
			FileManipulation.CreateFile();
			
			break; 
		case 2:
			FileManipulation.RemoveFile();
			 
			break; 
		case 3: 
			FileManipulation.FindFile();
			
			break; 
		case 4: 
			HomeScreen hs = new HomeScreen();
			hs.displayMenu();
			hs.userOptions();
			
			break; 
		default: 
			System.err.println("\nYou have input an invalid value! Please input 1-4");
			break; 
		}
	}
	
}
