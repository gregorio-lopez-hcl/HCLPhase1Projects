package fileproject;

import java.io.IOException;

public class MakingAWarrior {

	public static void main(String[] args) {
		// main will call all create, write, read, and append methods 
		//from other classes in project
		CreateWarrior NewWarrior = new CreateWarrior();
		System.out.println("-------------------------");
		WriteToWarrior NewWWrite = new WriteToWarrior(); 
		System.out.println("-------------------------");
		ReadWarrior NewRead = new ReadWarrior(); 
		System.out.println("-------------------------");
		try {
			AppendWarrior NewAppend = new AppendWarrior();
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
	}

}
