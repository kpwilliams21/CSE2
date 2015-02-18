// Korynne Williams
// hw 03
// Bicycle Java Program

// Import
import java.util.Scanner;

// Define a Class
public class Bicycle {
    
// Add a Main Method
public static void main (String [] args) {

// Declare
Scanner myScanner;

// Construct
myScanner=new Scanner (System.in);

// Print out Statements to Input Numbers
System.out.print("Enter the number of counts (an integer > 0): ");
int nCounts=myScanner.nextInt();
System.out.print("Enter the number of seconds when the counts occurred (a double in the form xx.xx: ");
double nSeconds=myScanner.nextDouble();

// Input Data
double wheelDiameter=27.0; // the diamter of the wheel

// Intermediate Variables and Output Data
double PI=3.14159; // value of pi, to help find distance traveled
double feetPerMile=5280.0; // converting feet to miles
double inchesPerFoot=12.0; // converting inches to feet
double secondsPerMinute=60.0; // converting secconds to minutes
double minutesPerHour=60.0; //converting minutes to hours
double totalDistance; // establishing new variable

// Run Calculations and Store Numbers
totalDistance=(nCounts*wheelDiameter*PI); // gives the distance in inches (for each count, a rotation of the wheel travels the diameter in inches times pi)
totalDistance/=(inchesPerFoot*feetPerMile); // gives distance in miles
double nMinutes; // declare variable
nMinutes=(nSeconds/secondsPerMinute); // gives time in minutes
double avgMph=(totalDistance/(nMinutes/60)); // gives average Miles per hour

// Truncating Decimals
totalDistance=totalDistance*100;
totalDistance=(int) totalDistance;
totalDistance=totalDistance/100;

nMinutes=nMinutes*100;
nMinutes=(int) nMinutes;
nMinutes=nMinutes/100;

avgMph=avgMph*100;
avgMph=(int) avgMph;
avgMph=avgMph/100;

// Print Out Numbers
System.out.println("The distance was " + (totalDistance) + " miles and took " + (nMinutes) + " minutes.");
System.out.println("The average mph was " + (avgMph) + ".");

  } // end of main
 
} // end of class