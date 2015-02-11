// Korynne Williams
// hw 03
// Four Digits Java Program

// Import
import java.util.Scanner;

// Define a Class
public class FourDigits {
    
// Add a Main Method
public static void main (String [] args) {
  
// Declare
Scanner myScanner;

// Construct
myScanner=new Scanner (System.in);

// Print out Statements to enter values 
System.out.print("Enter a double and I display the four digits to the right of the decimal point - ");
double x= myScanner.nextDouble();
x=x - ((int) x);
x=x*10000;
int digits=(int) x;

// Print out Numbers
System.out.print("The four digits are ");
System.out.print(digits/1000);
System.out.print((digits/100)%10);
System.out.print((digits/10)%10);
System.out.print(digits%10);
System.out.println();

   } // End of Main Method
    
} // end of class