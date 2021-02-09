package fileproject;

import java.io.File;  
import java.io.FileNotFoundException; 
import java.util.Scanner; 


public class ReadWarrior {
	
	public ReadWarrior () {
		
		try {
		      File wread = new File("YourWarrior.txt");
		      Scanner wsearch = new Scanner(wread);  
		      while (wsearch.hasNextLine()) {
		        String data = wsearch.nextLine();
		        System.out.println(data);
		      }
		      wsearch.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		   } 
	 }  
} 