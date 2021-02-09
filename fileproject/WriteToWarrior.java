package fileproject;

import java.io.FileWriter;   
import java.io.IOException; 

public class WriteToWarrior {
	
	public WriteToWarrior () { 
		
		final String WInfo = "You made a new warrior character!" ;
		String Wname = " Your warriors default name is: Bob!";
		final String WStat = " Your basic stats for a warrior are as follows: " ;
		String sp = "//n";
		int Str, Intel, Dex;
		Str = 1; Intel = 1; Dex = 1; 
		
		
		
		
		try { 
			FileWriter edit = new FileWriter("YourWarrior.txt"); 
			edit.write(WInfo);
			edit.write(Wname);
			edit.write(WStat);
			edit.close(); 
			System.out.println("Succesfully set your warrior's default name to Bob.");
		}
		catch (IOException e) {
			System.out.println("Error: Your warrior was not assigned a default name.");
			e.printStackTrace();
		}
		
	}

}
