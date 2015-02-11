// Korynne Williams
// Lab 03
// Big Mac Java Program

import java.util.Scanner; // import


// Define a Class
public class BigMac {
    
// Add a Main Method
public static void main (String [] args) {
 
 // Declare
Scanner myScanner;

// Construct
myScanner = new Scanner (System.in);

System.out.print("Enter the number of Big Macs (an integer > 0): ");
int nBigMacs=myScanner.nextInt();

System.out.print ("Enter the cost per Big Mac as" + " a double (in the form xx.xx): ");
double bigMac$=myScanner.nextDouble();
System.out.print ("Enter the percent tax as a whole number (xx):");
double taxRate=myScanner.nextDouble ();
taxRate/=100; // user enters percent, but I want a proprtion

double cost$;
int dollars, // whole dollar amount of cost
dimes, pennies; // for storing digits to the right of the decimal point for the cost$
cost$= nBigMacs*bigMac$* (1+taxRate); // Get the whole amount, dropping decimal fraction
dollars=(int) cost$;
// get dimes amount, e.g.,
// (int) (6.73*10) %10 -> 67 %10 -> 7
// where the % (mod) operator returns the remainder
// after the division : 583%100 -> 83, 27%5 -> 2
dimes=(int) (cost$*10) %10;
pennies=(int) (cost$*100) %10;
System.out.println ("The total cost of " +nBigMacs+ " Big Macs, at $" +bigMac$+ " per Big Mac, with a sales tax of "
+ (int)(taxRate*100) + "%, is $" + dollars + '.' +dimes+pennies);


    } // end of main method
} // end of class