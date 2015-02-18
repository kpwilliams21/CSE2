// Korynne Williams
// Hw 04
// Which Number Java Program

// Import Scanner
import java.util.Scanner;

// Define A Class
public class WhichNumber {

// Add a Main Method
public static void main (String [] args) {
    
// Declare
Scanner myScanner;

// Construct
myScanner=new Scanner (System.in);

// Print out Statements to promt the user
System.out.print("Enter a number between 1 and 10 inclusive: "); // Promts question to user
    if (myScanner.hasNext()) { // Check to see if int was entered by user
    int number = myScanner.nextInt(); // assign variable
System.out.print("Is the number even? "); // prompts question to user
    String answer1=myScanner.next(); // assign variable
    
// What happens if the number inputted is even
if(answer1.equalsIgnoreCase("Y")) {
System.out.print("Is it divisible by 3? "); // prompts question to user
String answer2=myScanner.next(); // assigns variable

if(answer2.equalsIgnoreCase("Y")) { // what happens if the number is divisible by 3
System.out.println("The number you choose is 6!"); // Prints statement to user
return; // ends program
}


else { // what happens if number inputted is not divisible by 3
if (answer2.equalsIgnoreCase("N")) { // if the number is not divisible by 3
System.out.println("Is your number divisble by 4? "); // Prompts question to user
String answer3=myScanner.next(); //assigns variable

// What happens if the number inputted is divisible by 4
if(answer3.equalsIgnoreCase("Y")) { 
System.out.print("Is the number divided by 4 greater than 1? "); // prompt question to user
String answer4=myScanner.next(); //assigns variable

if(answer4.equalsIgnoreCase("Y")) { // what happens if the number divided by four is greater than 1
System.out.println("The number you chose is 8!"); // Prints statement
return; //ends program
} 
 else {
if(answer4.equalsIgnoreCase("N")) { // What happens if the number divided by 4 is not greater than 1
System.out.println("The number you chose is 4!"); // Prints statement
return; // ends program
}
else { // what happens if user did not input 'Y' or 'N'
System.out.println("Sorry. that is not a valid input!"); // Prints error statement to the user
return; //end the program
        }
    }
}

else { // what happens if the number is not divisible by 4
if(answer3.equalsIgnoreCase("N")) { 
System.out.println("Is your number divisible by 5? "); //Prompts statement to user
String answer5=myScanner.next(); //assigns variable

if(answer5.equalsIgnoreCase("Y")) { // what happens if the number is divisible by 5
System.out.println("The number you chose is 10!"); // Print Statement to user
return; //ends program
}

else { // what happens if the number inputted is not divisible by 5
if(answer5.equalsIgnoreCase("N")) { 
System.out.println("The number you chose is 2!"); // Prits statement to user
return; //ends program
}
else{ // What happens if user did not enter 'Y' or 'N'
System.out.println("Sorry, that is not a valid input!"); //Print error statement
return; //ends program
        }
    }
}
else{ // What happens if user did not enter 'Y' or 'N'
System.out.println("Sorry, that is not a valid input!"); //Print error statement
return; //ends program
        }
    }
}
else{ // What happens if user did not enter 'Y' or 'N'
System.out.println("Sorry, that is not a valid input!"); //Print error statement
return; //ends program
        }
    }
}

// Now we can test to see if the number inputted is odd.... YAY!
else { // what happens if the number is not even aka odd
if (answer1.equalsIgnoreCase("N")) { 
System.out.println("Is the number divisible by 3? "); // prompt question to user
String answer6=myScanner.next(); //assigns variable

if(answer6.equalsIgnoreCase("Y")) { // what happens if the number inputted is divisible by 3
System.out.println("Is the number divided by 3 greater than 2? "); //ask a follow up question
String answer7=myScanner.next(); // assigns variable

if(answer7.equalsIgnoreCase("Y")) { // what happens if the number dvidied by 3 is greater than 2
System.out.println("The number you chose is 9!"); // Prints statement to user
return;
}
else { // what happens if answer is not greater than 2
if (answer7.equalsIgnoreCase("N")) { 
System.out.println("The number you chose is 3!"); // Prints tstatement to suer
return; // ends program
}
else { // what happens if the user does not input 'Y' or 'N'
System.out.println("Sorry, that is not a valid input!"); // prints error statement to user
return; //end program
        }
    }
}
else { // What happens if the odd number is not divisible by 3
if(answer6.equalsIgnoreCase("N")) {
System.out.print("Is the number greater than 6? "); //prompt statement to user
String answer8=myScanner.next(); //assign variable

if (answer8.equalsIgnoreCase("Y")) { //what happens if the number is greater than 6
System.out.println("The number you chose is 7!"); //prints statement to user
return; //ends program
}

else { //what happens if the number is not greater than 6
    if (answer8.equalsIgnoreCase("N")) {
System.out.println("Is the number less than 3? "); //prompt question to user
String answer9=myScanner.next(); //assigns vairiable
if (answer9.equalsIgnoreCase("Y")) { // what happens if number is less than 3
System.out.println("The number you chose is 1!"); //the number is 1
return; //ends program
}

else { // what happens if the number is not less than 3
if (answer9.equalsIgnoreCase("N")) {
System.out.println("The number you chose is 5!"); //Prints statement to user... 5 is the last possible number it could be
return; //ends program
}

else { 
System.out.println("Sorry, that is not a valid input!"); //prints error message to user
        }
    }
}

else { 
System.out.println("Sorry, that is not a valid input!"); // prints error message to user
return; //ends program
        }
    }
}

else{
System.out.println("Sorry, that is not a valid input!"); // prints error message to user
return; //ends program
        }
    }
}
else { 
System.out.println("Sorry, that is not a valid input!"); // prints error message to the user
        }
    }
}
else{ 
System.out.println("Sorry, that is not a valid input!"); // prints error message to the user
return;
        }
    } // end of main method
} // end of class
    
