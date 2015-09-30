/*
 *  Mauricio S. Perez
 *  CSC18a - 48984
 *  Proffesor Paul J. Conrad
 *  Assignment 2: Problem 3.37 (Factorial)
 *
 *  Problem:    The Factorial of a non negative integer is written as n!
 *              (pronounced "n factorial") as is defined as follows:
 *              
 *                      n! = n*(n-1)*(n-2)*...1
 *              and
 *                      n!=1    (for n=0)
 *              For Example, 5! = 5*4*3*2*1 = 120
 *
 *          1)  Write an application that reads a nonnegative integer that
 *              computes and prints its factorial.
 *
 *          2)  Write an application that estimates the value of the
 *              mathematical constant e by using the following formula. allow  
 *              the user to enter the number of terms to calculate.
 *                  
 *                      e = 1 + (1/1!) + (1/2!) + (1/3!) ...
 *
 *          3)  Write an application that computes the value of e^x by using the
 *              following formula. Allow the user to enter the number of the
 *              terms to calculate.
 *
 *                      e^x = (x^0/0!) + ((x^1/1!)) + ((x^2)/2!) + ((x^3)/3!)
 */

package assignment2;
import java.util.Scanner;       //This library will alow us to scan into console


public class Assignment2 {    
    public static void main(String[] args) {
            Scanner input = new Scanner (System.in);//creates a scanner "input"

           //Variables
           int value1 = 0;        //Will Hold value of n to find the factorial.
           int value2 = 0;        //Will Hold value of terms to approximate "e".
           int value3 = 0;        //will hold value of "x" in the equation "e^x".
           int count = 0;         //Will hold count of loops;
           int count2 = 0;         //Will hold count of loops;
           int count3 = 0;         //Will hold count of loops;
           float ansT = 0;        //Will Hold temp answer.
           float ans1 = 0;        //Will Hold answer of "n!"
           float ans2 = 0;        //Will Hold answer of "e".
           float ans3 = 0;        //Will Hold answer of "e^x".

           //Part 1: N Factorial
           System.out.print("1: Input a nonnegative integer: ");
           value1=input.nextInt();
           

                //Output Result 1: N FACTORIAL CALCULATION
                System.out.printf("     %d! is: ",value1);

                     //Loop 1: N! CALCULATED
                    //n! = n*(n-1)*(n-2)*...1
                    count=value1;                    //ans1 holds last number,
                    ans1=count;                     //while count holds the next
                    while (count>1){               //number to be multiplied.
                    System.out.printf("%d*",count);
                    count--;                    //Loop will only exicute for  
                    ans1=ans1*count;           //values greater than 1.
                    }
                    System.out.print("1 ");
                    
                    if(value1==0){
                    ans1=1;
                    }
                    
                    //Print answer: N!
                    System.out.print("= ");
                    System.out.print(ans1);
                    System.out.println();                  //Prints new line 
                    System.out.println();                  //Prints new line 
                 
           //Part 2: Calculating e
           System.out.print("2: Input number of terms you wish to calulate \"e\": ");
           value2=input.nextInt();

                    
           
                    //Output Result 2: e to "x" terms.
                    System.out.printf("     e to its %d terms is: ",value2);

                         //Loop 2: Calculating e to "x" terms.
                        //e = 1 + (1/1!) + (1/2!) + (1/3!) ...
                        count=0;                    //ans2 holds last number,
                        ans2=0;                     //while count holds the next
                        if(value2>0){
                        ans2=1;
                            //Test output - Account for 1/1! 
                            //System.out.print("in if: ");
                            //System.out.print(ans2);
                        }
                        
                            while(value2>1){
                            count++;
                            System.out.printf("1/(%d!) + ",count);

                                //FACTORIAL FRACTION
                                count2=value2;                    //ans1 holds last number,
                                ansT=1; 

                                while (count2>1){               //number to be multiplied.
                                    //Test out - n!
                                    //System.out.printf("%d*",count2);  //
                                ansT=ansT*count2;           //values greater than 1.
                                count2--;                    //Loop will only exicute for  
                                }

                                        //Test out - n! answer
                                        /*   System.out.print("1 = ");  //
                                            System.out.print(ansT);  //
                                            System.out.println();
                                        */
                                ans2=ans2+(1/ansT);
                            value2--;
                            }
                    //Output last term if grater than n=0        
                    if(value2==1){    
                    count++;
                    System.out.printf("1/(%d!) + ",count);
                    }
                    //Else, output 0 as last term
                    else{
                    System.out.print("1 ");
                    ans2=1;
                    }
                    
                    //Print Answer: e to "x" terms.
                    System.out.print("= ");
                    System.out.print(ans2);
                    System.out.println();                  //Prints new line
                    System.out.println();                  //Prints new line 
//*****************                
           //Part 3: Calculating e^x
           System.out.print("3: Input value of \"x\" in the expression \"e^x\": ");
           value3=input.nextInt();

                //Output Result 3: e^x.
                System.out.printf("     e^%d is: ",value3);
                
                    //loop 3: Calculate e^x.
                   //Calculated e times itself,x amount of times
                    count = 0;          //will have count of instance x
                    count2 = 0;        //will have count of factorial group
                    ansT = 0;         //Temp answer
                    count3 = value3; // Holds main Loop Count
                    ans3 = 0;       //holds main answer
                    int x = 0;      //holds loop count for numerator count loop
                    int y = 0;      //holds loop count for denominator count loop
                    float xans = 0;   //numerator answer
                    float yans = 0;   //denominator answer
                    float div = 0;  //division answer
                    
                    //Loop will output each term, plus calculate num/den fraction.
                    while(count3>0){
                    count++;
                    System.out.printf(" (%d^%d)/%d! +",count,count,count);
                            
                            //calculate x^x
                            //count 2 controls this loop
                            count2=count3;
                            xans = 1;
                            x = count3;
                            while(count2>0){
                                xans=xans*x;
                                        //Test x^x: outputs times multiplied
                                        //System.out.printf("%d*",x);
                            count2--;
                            }           //Test x^x: outputs times multiplied
                                        //System.out.printf("= %d",xans);
                    
                    
                            //calculate y!
                            //count 2 controls this loop
                            count2=count3;
                            yans = 1;
                            y = count3;
                            while(count2>0){
                                yans=yans*y;
                                        //Test y!: outputs factorial
                                       //System.out.printf("%d*",y);
                            y--;            
                            count2--;
                            }           //Test y!: outputs answer to factorial
                                       // System.out.printf("= %d",yans);                    
                    //Find Division of (x^x)/x!
                    div = xans/yans;    //TEST Div: outputs Division of x/y
                                        /*System.out.print(xans);
                                        System.out.print("/");
                                        System.out.print(yans);
                                        System.out.print("=");              */
                    ans3=ans3+div;      //Test Div: outputs division result
                                        //System.out.print(div);
                    count3--;
                    }

                    //output last term: 0! = 1, x^0= 1
                    if(value3 > 0){    
                    System.out.printf(" (%d^%d)/(%d!) ",value3,value3,value3);
                    ans3=ans3+1;
                    }
                    else{
                    System.out.printf(" (%d^%d)/(%d!) ",value3,value3,value3);
                    ans3=1;
                    }
                    
                //Print Answer: e^x
                System.out.print("= ");
                System.out.print(ans3);
                System.out.println();                  //Prints new line
                System.out.println();                  //Prints new line 
                
                        
          /* int sum;
           sum = value1 + value2;
                      System.out.print("The value equals: ");  //
                      System.out.print(sum);                  //
                      System.out.println();                  //Prints new line
                      System.out.printf("printf: %d + %d = %d",value1,value2, sum);
                      System.out.println();                  //Prints new line
          */        
    }
    
}
