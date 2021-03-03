package theDeskAppBugFixedProject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Display {

	


	public void optionsSelection() {
	        String[] arr = {"1. I wish to review my expenditure",
	                "2. I wish to add my expenditure",
	                "3. I wish to delete my expenditure",
	                "4. I wish to sort the expenditures",
	                "5. I wish to search for a particular expenditure",
	                "6. Close the application"
	        } ;
	        
	        int  slen = arr.length;
	        for(int i=0; i<slen;i++){
	            System.out.println(arr[i]);
	           
	        }
	  
	        final ArrayList<Integer> expenses = new ArrayList<Integer>();
	        expenses.add(1000);
	        expenses.add(2300);
	        expenses.add(45000);
	        expenses.add(32000);
	        expenses.add(110);
	       
	        System.out.println("\nEnter your choice:\t");
	        
	        int options; 
	        Scanner sc = new Scanner(System.in);
	        
	       	try {
	        options =  sc.nextInt();
	        }
	       catch (InputMismatchException e) {
	    	   System.err.println("You have input an invalid value! Please use an integer. \n");
	    	   return; 
	       }
	       	
	       			switch (options){
	                    case 1:
	                        System.out.println("Your saved expenses are listed below: \n");
	                        System.out.println(expenses+"\n");
	                        
	                        break;
	                    case 2:
	                        System.out.println("\nEnter the value to add your Expense:");
	                        int uval = 0;
	                        try { 
	                        uval = sc.nextInt();
	                        expenses.add(uval);
	                        System.out.println("Your value is updated\n");
	                        System.out.println(expenses+"\n");
	                        } catch (InputMismatchException f) {
	                        	System.err.println("\nYou have input an invalid value! Please use an integer. \n");
	                        }
	                       
	                        break;
	                    case 3:
	                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
	                        int uchoice = 0; 
	                        try {
	                        uchoice = sc.nextInt();
	                        if(uchoice==options){
	                               expenses.clear();
	                            System.out.println(expenses+"\n");
	                            System.out.println("All your expenses are erased!\n");
	                        	}
	                        } catch (InputMismatchException g) {
	                        	System.err.println("\nYou have input an invalid value! Please use an integer. \n");
	                        }
	                       
	                        break;
	                    case 4:
	                        System.out.println("\nYour expenses will now be sorted in ascending order.");
	                        SortExpenses sorted = new SortExpenses (); 
	                        sorted.SortedExpenses(expenses);
	                        System.out.println("\n");
	                   
	                        break;
	                    case 5:
	                    	SearchExpenses findexp = new SearchExpenses();
	                    	findexp.searchUExpenses(expenses); 
	                    	 
	                        
	                        break;
	                    case 6:
	                        closeApp();
	                        break;
	                    default:
	                        System.out.println("\nYou have made an invalid choice! Choose within 1-6.\n");
	                        break;
	                }
	                
	                
	            }
	       
	 
	 private static void closeApp() {
	        System.err.println("\nClosing your application... \nThank you!");
	        System.exit(0);
	            }
	    
	}
	

