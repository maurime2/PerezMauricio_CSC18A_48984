/*
An Invoice should include four pieces of information as instance variables:
    - A part number (type String).
    - A part description (type String).
    - A quantity of the item being purchased (type int).
    - A price per item (double). 


*/

//Libraries
package invoiceclass;

//Class Invoice
public class Invoice {
    //4 Instance Variables
     public String partNumber;
     public String partDescription;
     public int quantity;
     public double ppItem;
    
    //constructor initializes part with paremeter part
    public Invoice(String partNumber, String partDescription, int quantity, int ppItem)     //Constructor name is class name
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.ppItem = ppItem;
    }
    
                //method to set the Part Number
                public void setpartNumber(String partNumber)
                {
                    this.partNumber = partNumber;
                }

                //Method to retrive the Part Number 
                public String getpartNumber()
                {
                    return partNumber;
                }
    
                //method to set the Part Description
                public void setpartDescription(String partDescription)
                {
                    this.partDescription = partDescription;
                }

                //Method to retrive the Part Number 
                public String getpartDescription()
                {
                    return partDescription;
                }
    
                //method to set the quantity
                public void setquantity(int quantity)
                {
                    this.quantity = quantity;
                }

                //Method to retrive the quantity 
                public int getquantity()
                {
                    return quantity;
                }
                
                //method to set the quantity
                public void setppItem(double ppItem)
                {
                    this.ppItem = ppItem;
                }

                //Method to retrive the ppItem 
                public double getppItem()
                {
                    return ppItem;
                }
    
    
}//End Class Invoice
