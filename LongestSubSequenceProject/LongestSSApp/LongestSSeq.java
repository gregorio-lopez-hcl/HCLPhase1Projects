package LongestSSApp;

import java.util.ArrayList;

public class LongestSSeq {
	
	public LongestSSeq () { 
	
		//using get method to set local ArrayList to user ArrayList
		ArrayList<Integer> temparr = new ArrayList<Integer> (); 
		temparr = UGenArr.getuArrList(); 
		//iteration variables
		int acstart = 0; 
		int fkstart = 0; 
		int end = 0; 
		int counter = 0; 
		int largest = 0; 
		
		for (int ipos = 0; ipos < temparr.size() - 1; ipos++) { 
			if (temparr.get(ipos) < temparr.get(ipos + 1)) {
				if (counter == 0) { 
					//store potential value of the start of the longest sub-seq. 
					fkstart = ipos; 
					
				}
				counter ++; //continues to count as long as the index position element value is less than the superseding one
			}
			else if (counter > largest) { //this is to check that if the index element value is larger than the next that the 
				//program stores the current subsequence to be later printed
				acstart = fkstart; //setting the starting index position of the subsequence
				largest = counter; //storing the length of the subsequence to make sure it is longest
				end = ipos; //storing the index end of the subsequence to be printed later 
				counter = 0; //resetting the counter to count the length of a potentially bigger subseq. 
			}
			else {
				counter = 0; 
			}
		}
		System.out.println ("\nThe starting and ending postions for your subsequence are: " + acstart+ " " + end);
		System.out.println("\nThe longest sub-sequence in your array is: " + temparr.subList(acstart, end +1));
	}

}
