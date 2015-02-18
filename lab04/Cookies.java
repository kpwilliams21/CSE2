// Korynne Williams
// Lab 04
// Cookies Java Program

// Import
import java.util.Scanner;

// Define a Class
public class Cookies { // main method required for every Java Program

// Add a Main Method
public static void main(String [] args) {
 
// Declare
Scanner myScanner;

// Construct
myScanner=new Scanner (System.in);

// Print out statements to input numbers
System.out.print("Enter the number of people: ");

// Check to see if used inputs an int
if(myScanner.hasNextInt () ) // If the user inputs an int then continue with prompting questions

System.out.print("Enter the number of cookies you are planning to buy: ");
System.out.print("How many do you want each person to get? ");
______________________

else{
    System.out.println ("You did not enter an int"); // Prompts user telling them they did not enter an int
    return; // the program terminates
}

    } // end of main method
    
} // end of class