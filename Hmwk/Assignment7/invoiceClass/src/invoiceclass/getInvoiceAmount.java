//Libraries
package invoiceclass;

//Class getInvoiceAmount
public class getInvoiceAmount {
        //Declare Global instance Variables
        public int quantity;
        public double ppItem = 10.01f;
        public double mult = 10.01f;

    getInvoiceAmount(int quantity, double ppItem)     //Constructor name is class name
    {
        //Declare Variables
        this.quantity = quantity;
        this.ppItem = ppItem;
    }
    
    
    public void setMult()
    {
     this.mult=quantity*ppItem;        
    }
    
    public double getMult()
    {
        return mult;
    }
    
    
    
}//End Class getInvoiceAmount
