/*
   Mauricio S. Perez
   CSC18a - 48984
   Proffesor Paul J. Conrad
   Assignment 7: Problem 7.11 (Invoice Class)
 
   Problem: Chapter 7 Exercise #11 (Invoice Class), due 11/5/15 by the beginning
            of class, working source code and 3-4 sentence write up must be 
            emailed for up to 40 points.

            7.11 (Invoice Class)

            Create a class called Invoice that a hardware store might use to 
            represent an invoice for an item sold at the store. An Invoice
            should include four pieces of information as instance variables:
                - A part number (type String).
                - A part description (type String).
                - A quantity of the item being purchased (type int).
                - A price per item (double). 

            Your class should have a constructor that initializes the four 
            instance variables. Provide a set and a get method for each instance
            variable.
            
            In addition, provide a method named getInvoiceAmount that calculates
            the invoice amount (i.e., multiplies the quantity by the price per
            item), then returns the amount as a double value. 
                If the quantity is not positive, it should be set to 0. 
                If the price per item is not positive, it should be set to 0.0. 
            
            Write a test app named InvoiceTest that demonstrates class Invoice’s 
            capabilities.
 */
//Libraries
package invoiceclass;
//Utility Scanner
import java.util.Scanner; 

//Invoice Class
public class InvoiceClass {

    //Main Start
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);

        //Declare Variables
        
        
         //Create two account objects
        Invoice item1 = new Invoice("001","To Nail",30,30.20);
        item1.setpartNumber(item1.partNumber);
        item1.setpartDescription(item1.partDescription);
        item1.setquantity(item1.quantity);
        item1.setppItem(item1.ppItem);

        
        System.out.println(item1.getpartNumber());
        System.out.println(item1.getpartDescription());
        System.out.println(item1.getquantity());
        System.out.println(item1.getppItem());


        //Totals
        getInvoiceAmount total1 = new getInvoiceAmount(item1.quantity,item1.ppItem);
        total1.setMult();
        System.out.println(total1.getMult());
        
        
        //System.out.println(item1.getppItem());
        
    }//Main End
    
}//Invoice Class End
