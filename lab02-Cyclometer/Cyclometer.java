// Korynne Williams
// lab02
// Cyclometer Java Program


// Define a Class
public class Cyclometer { 
    
// Add Main Method
public static void main (String[] args) { 
    
// Our Input Data
int secsTrip1=480; // seconds for trip 1
int secsTrip2=3220; // seconds for trip 2
int countsTrip1=1561; // number of counts for trip 1
int countsTrip2=9037; // number of counts for trip 2

// Our Intermediate Variable and Output Data
double wheelDiameter=27.0, // the diameter of the wheel
PI=3.14159, // value of pi, to help find distance traveled
feetPerMile=5280, // converting feet to miles
inchesPerFoot=12, // converting inches to feet
secondsPerMinute=60; // converting seconds to minutes
double distanceTrip1, distanceTrip2, totalDistance;

// Print Out Numbers
System.out.println("Trip 1 took " + 
(secsTrip1/secondsPerMinute) + " minutes and had " + 
countsTrip1 + " counts.");
System.out.println("Trip 2 took " + 
(secsTrip2/secondsPerMinute) + " minutes and had " + 
countsTrip2 + " counts.");

// run the calculations; store the values. 
distanceTrip1=(countsTrip1*wheelDiameter*PI);
// Above gives the distance in inches
// (for each count, a rotation of the wheel travels 
// the diameter in inches times PI)
distanceTrip1/=inchesPerFoot*feetPerMile; // Gives Distance in Miles
distanceTrip2=(countsTrip2*wheelDiameter*PI);
distanceTrip2/=(inchesPerFoot*feetPerMile);
totalDistance=distanceTrip1 + distanceTrip2;

//Print out the output data
System.out.println ("Trip 1 was " + distanceTrip1 + " miles");
System.out.println("Trip 2 was " + distanceTrip2 + " miles");
System.out.println("The total distance was " + totalDistance + " miles");

  }  // End of main 

    
} // end of class

