package fileproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendWarrior {
	
	public AppendWarrior() throws IOException { 
		
		String Wlevel = "Congrats your warrior is now level 2!";
		
		BufferedWriter leveler = new BufferedWriter(new FileWriter("YourWarrior.txt", true)); 
		
		leveler.write(Wlevel);
		leveler.close(); 
		System.out.println(Wlevel);
		
	}

}
