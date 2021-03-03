package VirtualKeyAppProject;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;




//contains all methods to for file handling
public abstract class FileManipulation implements DisMenus {
	
	public static void DisplayExFiles () { 
		File disef = new File("C:\\Users\\Public\\Documents\\");
		System.out.println("The existing files are as follows: \n");
		//File[] files = disef.listFiles(); 
		//ArrayList<File> file = new ArrayList<File>();
		
		//Arrays.sort(files, NameFileCopmarator.length);
		//Collections.sort(file);
		
		for(String filename : disef.list()) {
			System.out.println(filename);
		}
	}
	
	public static void CreateFile () { 
		System.out.println("\nPlease Enter the name of the file you would like to create: "); 
		String fname = DisMenus.GetUStr(); 
		try { 
			File createdf = new File("C:\\Users\\Public\\Documents\\" + fname);
			if (createdf.createNewFile()) {
				System.out.println("\nA new file was successfully created: " + createdf.getName());
			}
		} catch (Exception x) {
			System.err.println(x.getMessage());
		}
	}
	
	public static void RemoveFile () { 
		boolean check = false; 
		DisMenus.display("\nPlease input the name of the file you would like to delete: ");
		String ftdelete = DisMenus.GetUStr(); 
		try { 
			File ef = new File ("C:\\Users\\Public\\Documents\\" + ftdelete);
			check = ef.exists();
			if (check) { 
				ef.delete();
				System.out.println("\nYour selected file has been deleted " + ef);
			} else {
				System.err.println("\nIncorrect file name, please re-enter.");
				
			}	
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}	
	}
	
	public static void FindFile () { 
		boolean check = false; 
		DisMenus.display("\nPlease input the name of the file you would like to find: ");
		String ffind = DisMenus.GetUStr(); 
		File ef = new File("C:\\Users\\Public\\Documents\\"); 
		String[] files = ef.list(); 
		for (String i : files) { 
			if (ffind.equals(i.toLowerCase())) {
				check = true;
			}
		}
		System.out.println(check ? "\nThe file: **" +ffind+ "** has been found in the folder Users\\Public\\Documents \\n" : "\nThe file: **" +ffind+
				 "** has not been found in the folder Users\\Public\\Documents.\n");
	}

}
