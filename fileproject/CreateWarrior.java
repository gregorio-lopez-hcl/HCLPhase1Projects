package fileproject;

import java.io.File;
import java.io.IOException;


public class CreateWarrior {

	public CreateWarrior () {
		
		try { 
			File NWarrior = new File("YourWarrior.txt");
			if (NWarrior.createNewFile()) {
				System.out.println("Your new warrior file has been created: " + NWarrior.getName()); 
			} else { 
				System.out.println("A warrior with that file name already exists!"); 
			}
		} catch (IOException e) {
			System.out.println("An error occurred."); 
			e.printStackTrace(); 
		}
	
	}
	
}


