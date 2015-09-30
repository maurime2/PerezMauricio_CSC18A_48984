/*
 *  Mauricio S. Perez
 *  CSC18a - 48984
 *  Proffesor Paul J. Conrad
 *  Assignment 3: Problem 5.27 (Greatest Common Divisor)
 *
 *  Problem:    The greatest common divisor (GCD) of two integers is the largest
 *              integer that evenly divides each of the two numbers. Write a
 *              method gcd that returns the greatest common divisor of two 
 *              integers. 
 *
 *              [Hint: you might want to use Euclid's algorithm. you can find
 *              information about it at
 *              en.wikipedia.org/wiki/Euclidean_algorithm.]
 *
 *              Incorporate the method into an application that reads two values
 *              from the user and displays the result.
 *
 */

package assignment3;
import java.util.Scanner;       //This library will alow us to scan into console

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);//creates a scanner "input"
        
        //Variables
        int value1=0;
        int value2=0;
        int count=0;
        int count1=0;
        int test1=0;
        int test2=0;
        int GCD=0;
        int GCD1=0;
        
        //Prompt User
        System.out.print("Greatest Common Divisor (GCD)\n\n");
        
        //Scan Both Integers
           System.out.print("Input the first nonnegative integer: ");
           value1=input.nextInt();
           System.out.print("Input the second nonnegative integer: ");
           value2=input.nextInt();
        
                //Find Largest of two integers
                if(value1==0){
                System.out.printf("The GCD of %d and %d is: Not Possible!!! Value 1 is 0!!!",value1,value2);
                }
                else if(value2==0){
                System.out.printf("The GCD of %d and %d is: Not Possible!!! Value 2 is 0!!!",value1,value2);
                }
                else if(value1<value2){
                    System.out.print("Value 2 is grater.");
                    count=value1;     //I chose this over value2 for efficiency.
                    count1=value1;   //Value 2 is obviously greater, therefore
                }                   //loop finding GCD should run less time.
                else if(value1>value2){
                    System.out.print("Value 1 is grater.");
                    count=value2;     //I chose this over value1 for efficiency.
                    count1=value2;    //Value 1 is obviously greater, therefore
                }                   //loop finding GCD should run less time.
                else if(value1==value2){
                    count=value1;
                    count1=value1;
                }
                
                
                //GCD with While Loop
                if(count==0){
                    System.out.print("\n\nPROGRAM END: GDC OF 0 NOT POSSIBLE\n\n");
                }
                    else if(value1==value2){
                        GCD=value1;
                        System.out.printf("Both Values are the same!!! GCD is: %d",GCD);   
                    }
                    else if(count>0){
                        System.out.print("\n\n\nGCD is: ");

                        //Will loop so long as GCD is not Found
                        while(GCD==0){

                            if(((value1%count)==0)&&((value2%count)==0)){
                            GCD=count;    
                            System.out.printf("%d",GCD);
                            }
                        count--;    
                        }
                    }
                
            //Output for all values of GCD>0
            if(GCD>0){
            //Output Integers:
            System.out.printf("\n\nThe GCD of %d and %d is: %d\n\n",value1,value2,GCD);
            }
            
            
            //Recursion Function
            if(GCD>0){
            System.out.printf("\nRecursion:\nThe GCD of %d and %d is:",value1,value2);
            System.out.println(recursion(value1, value2, count1, GCD1));
            }
            
            //Function with While Loop
            if(GCD>0){
            System.out.printf("\nWhile Loop Function:\nThe GCD of %d and %d is:",value1,value2);
            System.out.println(function(value1, value2, count1, GCD1));
            }
            
            
    }//END MAIN
    
    public static int recursion(int v1, int v2, int c, int g){
            //GCD
                if(c==0){
                    System.out.print("\n\nPROGRAM END: GDC OF 0 NOT POSSIBLE\n\n");
                }
                    else if(v1==v2){
                        g=v1;
                        //System.out.print("Both Values are the same!!! GCD is: ");   
                    }
                    else if(c>0){
                        //System.out.print("\n\n\nGCD is: ");

                        //Will loop so long as GCD is not Found
                        while(g==0){

                            if(((v1%c)==0)&&((v2%c)==0)){
                            g=c;    
                            //System.out.printf("%d",g);
                            }
                        c--;    
                        System.out.println(recursion(v1, v2, c, g));
                        }
                    }
        
        
        return g;
        
    }

    
    public static int function(int v1, int v2, int c, int g){
        
        //GCD
                if(c==0){
                    System.out.print("\n\nPROGRAM END: GDC OF 0 NOT POSSIBLE\n\n");
                }
                    else if(v1==v2){
                        g=v1;
                        //System.out.print("Both Values are the same!!! GCD is: ");   
                    }
                    else if(c>0){
                        //System.out.print("\n\n\nGCD is: ");

                        //Will loop so long as GCD is not Found
                        while(g==0){

                            if(((v1%c)==0)&&((v2%c)==0)){
                            g=c;    
                            //System.out.printf("%d",g);
                            }
                        c--;    
                        }
                    }
        
        
        return g;
    }
}//End PUBLIC CLASS