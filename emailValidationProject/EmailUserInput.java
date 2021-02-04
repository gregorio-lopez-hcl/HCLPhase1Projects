package emailValidationProject;

import java.util.Scanner;

public class EmailUserInput{
    public static void main(String[] args) {

    //variable declaration
    Scanner userInput = new Scanner(System.in);
    boolean emailFound = false; 
    String[] emails = {"Greg@yahoo.com", "GJL@aol.com", "sapientes2@gmail.com", "Beluga@outlook.com ","Baldur1986@tamiu.edu", "GregorioLopez@uk.co"};

    //user input
    System.out.println("Please input the employee email you are searching for: ");
    String inputtedEmail = userInput.nextLine();

    //array search syntax and output
    for(String email : emails){
        if(email.equals(inputtedEmail))
            emailFound = true;
    }
        if(emailFound == true)
            System.out.println("Your email has been found in the database: " + inputtedEmail);
        else
            System.out.println("Your email has not been found in the database.");
    }
}


