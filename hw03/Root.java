// Korynne Williams
// hw 03
// Root Java Program

// Import
import java.util.Scanner;

// Define a class
public class Root {
    
// Add a main Method
public static void main (String [] args) {
    
// Declare
Scanner myScanner;

// Construct
myScanner=new Scanner (System.in);

// Print out Numbers to Input Numbers
System.out.print ("Enter a double, and I print its cube root - ");

//Establish Variables
double x=myScanner.nextDouble();
double guess = x/3; 
guess=(2*guess*guess*guess+x)/(3*guess*guess);

//Improve Estimate Quesses... Run Calculations and Store Numbers
guess=(2*guess*guess*guess+x)/(3*guess*guess);
guess=(2*guess*guess*guess+x)/(3*guess*guess);
guess=(2*guess*guess*guess+x)/(3*guess*guess);
guess=(2*guess*guess*guess+x)/(3*guess*guess);

// Print Out Numbers
System.out.println("The cube root is " + (guess) + ":" +(guess)+ "*" + (guess) + "*" + (guess) + "=" + (guess*guess*guess) + "."); 

  } // end of main method
} // end of class