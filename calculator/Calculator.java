package calculator;

import java.util.Scanner;

public class Calculator 
{
	
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		//variable declaration
		int n1 = 0;
		int n2 = 0;
		char operation;
		char repeat = 'y'; 
		int a = 0; 
		String s = ("Welcome to your friendly neighborhood calculator!");
		
	
		//User input syntax
		while (repeat == 'y' || repeat == 'Y') 
		{
		
				System.out.println(s + "\n");
				System.out.println("Please enter first number (whole only): ");
				n1 = in.nextInt(); 
				System.out.println("Please enter second number (whole only): ");
				n2 = in.nextInt (); 
				System.out.println("What operation (symbols only)?");
				operation = in.next().charAt(0);
		
		//switch calculation syntax 
				switch (operation) {
				case '+': a = n1 + n2;  
				System.out.println(n1+" "+operation+" "+n2+" = "+a); 
					break; 
				case '-': a = n1 - n2; 
				System.out.println(n1+" "+operation+" "+n2+" = "+a); 
					break;
				case '*': a = n1 * n2; 
				System.out.println(n1+" "+operation+" "+n2+" = "+a); 
					break;
				case '/': a = n1 / n2; 
				System.out.println(n1+" "+operation+" "+n2+" = "+a); 
					break; 
				default: System.out.println ("Incorrect value, try again.");
						a = 0; 
					break; 
				}
			
			System.out.println("Do you want to continue (Y/N)?");
			repeat = in.next().charAt(0);
		}
	}	
}
