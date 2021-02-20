package theDeskAppBugFixedProject;

import java.util.ArrayList;


public class SortExpenses{
	
	
	 int partition(int arr[], int low, int high) 
	    { 
	        int pivot = arr[high];  
	        int i = (low-1); 
	        for (int j=low; j<high; j++) 
	        { 
	            
	            if (arr[j] < pivot) 
	            { 
	                i++; 
	  
	                 
	                int temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	            } 
	        } 
	  
	        
	        int temp = arr[i+1]; 
	        arr[i+1] = arr[high]; 
	        arr[high] = temp; 
	  
	        return i+1; 
	    } 
	 
	    void sort(int arr[], int low, int high) 
	    { 
	        if (low < high) 
	        { 
	            
	            int pi = partition(arr, low, high); 
	  
	           
	            sort(arr, low, pi-1); 
	            sort(arr, pi+1, high); 
	        } 
	    } 
	  
	    public void SortedExpenses(ArrayList<Integer> expenses) 
	    { 
	    	int n = expenses.size();
	        int [] texp = expenses.stream().mapToInt(i -> i).toArray();
	        
	  
	        SortExpenses usort = new SortExpenses(); 
	        usort.sort(texp, 0, n-1); 
	  
	        System.out.println("\nYour sorted expenses are: \n"); 
	        for (int ipos =0; ipos < n; ipos++) {
	        	System.out.print("[" +texp[ipos] + "]");
	        }
	        	
	         
	    } 
} 
	
       //Complete the method. The expenses should be sorted in ascending order.


