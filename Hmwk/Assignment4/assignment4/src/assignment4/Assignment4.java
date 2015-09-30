/*
 *  Mauricio S. Perez
 *  CSC18a - 48984
 *  Proffesor Paul J. Conrad
 *  Assignment 4: Problem 5.22 (Temperature Conversions)
 *  
 *      Implement the following integer methods: 
 *       a) Method celsius returns the Celsius equivalent of a Fahrenheit 
 *          temperature, using the calculation
 *
 *                  celsius = 5.0 / 9.0 * ( fahrenheit - 32);
 *
 *       b) Method fahrenheit returns the Fahrenheit equivalent of a 
 *          Celsius temperature, using the calculation 
 *
 *                  fahrenheit = 9.0 / 5.0 * celsius + 32;
 *
 *       c) Use the methods from parts (a) and (b) to write an application 
 *          that enables the user either to enter a Fahrenheit temperature
 *          and display the Celsius equivalent or to enter a Celsius 
 *          temperature and display the Fahrenheit equivalent. Make sure to 
 *          include a write up summary about what you learned from the 
 *          assignment. Due: 10/01/15 at beginning of class, for a maximum of
 *          40 points.
 *     
 */
package assignment4;
import java.util.Scanner;       //This library will alow us to scan into console

public class Assignment4 {
    public static void main(String[] args) {
            Scanner input = new Scanner (System.in);//creates a scanner "input"
            
        //Variables
        float value1=0;         //Holds Temp Value for Temperature.
        float value2=0;         //Holds Temp Value for Choice in F or C.
        boolean  celB=false;    //Holds Bool for celsius as a choice.
        boolean  fahrB=false;   //Holds Bool for fahrenheit as a choice.
        float celsius=0;        //Holds final temp value of fahrenheit.
        float fahrenheit=0;     //Holds final temp value of celsius.
        
        //Prompt User for Choice: Celsius or Fahrenheit
        System.out.print("Celsius or Fahrenheit?\n");
        //Ask If value is celsius
        do{
        System.out.print("Will you input a celsius temperature? (1 for yes, 2 for no): ");
        value2=input.nextInt();
            if(value2<=0 || value2>2){
            System.out.print("Invalid Choice, Please try again... \n\n");
            }
        }while(value2<=0 || value2>2);
        
            //Set celsius to true.
            if(value2==1){
            System.out.print("Celsius Choice Selected.");    
            celB=true;
            fahrB=false;
            
                //Lock Choice: Celsius
                do{
                System.out.print("Are you sure you want Celsius? (1 for yes, 2 for no): ");
                value2=input.nextInt();
                    if(value2<=0 || value2>2){
                    System.out.print("Invalid Choice, Please try again... \n\n");
                    } 
                }while(value2<=0 || value2>2);
                    //Lock Value of Celsius after Verification    
                    if(value2==1){        
                    System.out.print("Celsius Choice Locked.");
                    }
            }
                
        //Select Fahrenheit.
        if(value2==2){
            do{
            System.out.print("Will you input a fahrenheit temperature? (1 for yes, 2 for no): ");
            value2=input.nextInt();
                if(value2<=0 || value2>2){
                System.out.print("Invalid Choice, Please try again... \n\n");
                }
            }while(value2<=0 || value2>2);
                    //Fahrenheit Selected 
                    if(value2==1){
                        System.out.print("Fahrenheit Choice Selected.");
                        celB=false;
                        fahrB=true;
                            //System.out.print("Fahrenheit Choice Locked.");
                        }
                    //Lock Choice: Fahrenheit
                    else{
                        do{
                        System.out.print("Are you sure you dont want Fahrenheit ? (1 for yes, 2 for no): ");
                        value2=input.nextInt();
                            if(value2<=0 || value2>2){
                            System.out.print("Invalid Choice, Please try again... \n\n");
                            }
                        }while(value2<=0 || value2>2);
                     
                         //Final Assignment: Fahrenheit
                                if(value2==1){
                                    System.out.print("Celsius Choice Selected.");
                                    celB=false;
                                    fahrB=true;
                                    value2=2;
                                }
                                else{
                                    System.out.print("Fahrenheit Choice Selected.");
                                    celB=true;
                                    fahrB=false;
                                    value2=1;
                                }
                    }
        //Final Assignment: Fahrenheit
        if(value2==1){
            System.out.print("\nFahrenheit Choice Locked.");
        }
        else{
            celB=true;
            fahrB=false;
            System.out.print("\nCelsius Choice Locked.");
        }
        }//End of Select Fahrenheit
        
        //Prompt User for temp
        System.out.print("\n\nInput a temperature (numerical values only): ");
        value1=input.nextFloat();
        
        //Call Cellcius to Fahrenheit and Print
        if((celB)){
            celsius=value1;
            System.out.print(celsius);
            System.out.print(" Celsius is: ");
            System.out.print(Cel2Fahr(celsius, fahrenheit));
            System.out.print(" Fahrenheit.");
        }
        
        //Call Fahrenheit to Cellcius and Print
        if((fahrB)){
            fahrenheit=value1;
            System.out.print(fahrenheit);
            System.out.print(" Fahrenheit is: ");
            System.out.print(Fahr2Cel(celsius, fahrenheit));
            System.out.print(" Celsius."); 
        }                
    }//End of main
    
    //Classes
    public static float Cel2Fahr(float c, float f){
       float a= 9.0f/5.0f;                  //FORCE THE FLOAT INTO THE FLOAT
        
        //fahrenheit = 9.0 / 5.0 * celsius + 32;
        f=((a*c)+32);
        return f;
    }
    
    public static float Fahr2Cel(float c, float f){
       float a= 5.0f/9.0f;                  //FORCE THE FLOAT INTO THE FLOAT
        
        //celsius = 5.0 / 9.0 * ( fahrenheit - 32);
        c=(f-32)*a;
        return c;
    }
}//end of Assignment4