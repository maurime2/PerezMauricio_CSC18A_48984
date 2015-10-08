/*
   Mauricio S. Perez
   CSC18a - 48984
   Proffesor Paul J. Conrad
   Assignment 5, PART 1: Problem 18.12 (What does the following program do?)
 
   Problem:  We are given the following code and asked what it dose:
             (Lines 10 - 32 are code from the book.)

    // Exercise 18.12 Solution: MysteryClass.java
    public class MysteryClass
    {
            public static int mystery(int[] array2, int size){

                    if (size == 1)
                            return array2[0];

                    else
                            return array2[size - 1] + mystery(array2, size - 1);
            }

                     public static void main(String[] args){

                             int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

                             int result = mystery(array, array.length);

                             System.out.printf("Result is: %d%n", result);

                     } // end method main

    } // end class MysteryClass
 
    I can say with great resolve, that the following code creates an array of 
    integers [1-10] named "array", and a method that calls itself recursively
    called "mystery", which adds all of the elements into an integer named 
    "result.

    The program then ends by displaying said result. In the case of integers 
    1-10, said result is 55.

    Within the "mystery" method, I have created two blocks of code whitch 
    prompt what is going on within the "if" and "else" section of the method.
    You can delete the "star slashes" to revele the workings of the method.
    
    !!!UPDATE!!!
    I HAVE COMMENTED OUT THE STAR SLASH TO DISPLAY THE WORKINGS OF THE METHOD.

 */

package mysteryclass;

public class MysteryClass
{       //Method "mystery"
	public static int mystery(int[] array2, int size){
		//METHOD STARTS HERE
		if (size == 1){
                    ///*
                      //COMENT OUT: UNCOMMENT TO SEE WHATS HAPPENING
                        System.out.printf("Called \"if\",   Return: %d",(array2[size-1]));
                        System.out.printf(", Size Final:  %d",size);
                        System.out.print("\n\nRESULT WILL EQUAL THE SUM OF ALL RETURNS: \n\n");
                      //COMENT OUT: UNCOMMENT TO SEE WHATS HAPPENING
                    //*/
                        //Returns value in array2[0]. EXITS METHOD "mystery".
			return array2[0];
                }
		else{
                    ///*
                      //COMENT OUT: UNCOMMENT TO SEE WHATS HAPPENING
                        System.out.printf("Called \"else\", Return: %d",(array2[size - 1]));
                        System.out.printf(". Size: %d",size);
                        System.out.print("\n");
                      //COMENT OUT: UNCOMMENT TO SEE WHATS HAPPENING
                    //*/    
                           //Returns value in array2[size-1], calls "mystery"
                          //method with "array2" and  value of "size - 1"
                         //Whole array is passed, but size will decrement by 1 
                        //each time it is called.
			return array2[size - 1] + mystery(array2, size - 1);
                }
	}
                //MAIN
		 public static void main(String[] args){
                        //Fill Array with int values 1-10. Size of array is 9.
			int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

                          //Set int variable "result with "mystery" method.
                         //"array", and length of "array" will be passe into 
                        //"mystery" method.
			int result = mystery(array, array.length);

                        //Print value of "result"
			System.out.printf("Result is: %d%n", result);
			 
		 } // end method main
		 
} // end class MysteryClass