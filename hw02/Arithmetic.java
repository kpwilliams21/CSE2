// Korynne Williams
// hw02
// Arithmetic Calculations

// Define a class
public class Arithmetic {
    
// Add a main method
public static void main(String [] args) {
    
// Input Data
int nSocks=3; // Number of pairs of socks
double sockCost$=2.58; // Cost per pair of socks ('$' is part of the variable name)
int nGlasses=6; // Number of drinking glasses
double glassessCost$=2.29; // Cost per glass
int nEnvelopes=1; //Number of envelopes
double envelopeCost$=3.25; // Cost per box of envelopes
double taxPercent=0.06;

// Cost of Socks, Glasses and Envelopes
double costSocks, costGlasses, costEnvelopes; 

// Total Cost of Socks, Glasses and Envelopes
double subtotalPurchases;

// Tax on Socks, Glasses and Envelopes
double taxSocks, taxGlasses, taxEnvelopes, totalSalesTax;

//Total Cost of Transaction
double totalSocks, totalGlasses, totalEnvelopes, totalTransaction;

// Cost of Socks, Glasses and Envelopes 
costSocks=(nSocks*sockCost$); // total cost of socks before sales tax
costGlasses=nGlasses*glassessCost$; // total cost of drinking glasses before sales tax
costEnvelopes=nEnvelopes*envelopeCost$; // total cost of envelopes before sales tax

// Print out Cost of Socks, Glasses and Envelopes
System.out.println("The cost of socks is $" + (costSocks) +".");
System.out.println("The cost of drinking glasses is $" + (costGlasses) + ".");
System.out.println("The cost of envelopes is $" + (costEnvelopes) + ".");

// Total Cost of Purchases before Sales Tax
subtotalPurchases= costSocks + costGlasses + costEnvelopes; // Subtotal of complete purchase before sales tax

// Print out the Total Cost of Purchases before Sales Tax
System.out.println("The total cost of purchases is $" + subtotalPurchases +" before taxes.");

// Sales tax for Socks, Glasses and Envelopes
taxSocks=costSocks*taxPercent; // Total sales tax for the purchase of socks
taxGlasses=costGlasses*taxPercent; //Total sales tax for the purchase of drinking glasses
taxEnvelopes=costEnvelopes*taxPercent; // Total sales tax for the purchase of envelopes
totalSalesTax=taxSocks+taxGlasses+taxEnvelopes; // Total sales tac for all purchases

// Truncating Decimals
taxSocks=taxSocks*100;
taxSocks=(int) taxSocks;
taxSocks=taxSocks/100;

taxGlasses=taxGlasses*100;
taxGlasses=(int) taxGlasses;
taxGlasses=taxGlasses/100;

taxEnvelopes=taxEnvelopes*100;
taxEnvelopes=(int) taxEnvelopes;
taxEnvelopes=taxEnvelopes/100;

totalSalesTax=totalSalesTax*100;
totalSalesTax=(int) totalSalesTax;
totalSalesTax=totalSalesTax/100;

// Print out Sales Tax for Socks, Glasses and Envelopes
System.out.println("The sales tax for socks is $" + (taxSocks) + ".");
System.out.println("The sales tax for drinking glasses is $" + (taxGlasses) + ".");
System.out.println("The sales tax for envelopes is $" + (taxEnvelopes) + ".");
System.out.println("The total sales taxes for all purchases is $" + (totalSalesTax) + ".");

// Total Cost of Socks, Glasses and Envelopes including Sales Tax
totalSocks=costSocks + taxSocks; // Total cost for the purchase of socks including sales tax
totalGlasses=costGlasses + taxGlasses; // Total cost for the purchase of drinking glasses including sales tax
totalEnvelopes=costEnvelopes + taxEnvelopes; // Total cost for the purchase of envelopes including sales tax

// Truncating Decimals
totalSocks=totalSocks*100;
totalSocks=(int) totalSocks;
totalSocks=totalSocks/100;

totalGlasses=totalGlasses*100;
totalGlasses=(int) totalGlasses;
totalGlasses=totalGlasses/100;

totalEnvelopes=totalEnvelopes*100;
totalEnvelopes=(int) totalEnvelopes;
totalEnvelopes=totalEnvelopes/100;

// Print Total Cost of all items
System.out.println("The total cost (including sales tax) for socks is $" + totalSocks + ".");
System.out.println("The total cost (including sales tax) for drinking glasses is $" + totalGlasses + ".");
System.out.println("The total cost (including sales tax) for envelopes is $" + totalEnvelopes + ".");

// Total Cost of the Transaction
totalTransaction=subtotalPurchases+totalSalesTax;

// Truncate Decimal
totalTransaction=totalTransaction*100;
totalTransaction=(int) totalTransaction;
totalTransaction=totalTransaction/100;

// Print out total cost for Socks, Glasses and Envelopes
System.out.println("The total cost of the transaction, including sales tax, is $" + (totalTransaction) + ".");



   } // end of main method
} // end of class