/*
   Mauricio S. Perez
   CSC18a - 48984
   Proffesor Paul J. Conrad
   Assignment 5, PART 2: Problem 18.13 (What does the following program do?)
 
   Problem:  We are given the following code and asked what it dose:
             (Lines 10 - 26 are code from the book.)

            // Exercise 18.13 Solution: SomeClass.java
            public class SomeClass{
                    public static String someMethod(int[] array2, int x){
                             if (x < array2.length)
                                    return String.format(
                                    "%s%d ", someMethod(array2, x + 1), array2[x]);
                            else
                                    return "";
                    }

                    public static void main(String[] args){
                     int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                     String results = someMethod(array, 0);
                     System.out.println(results);
                    }

            } // end class SomeClass
 
    I can say with great resolve, that the following code creates an array of 
    integers [1-10] named "array", and a method that calls itself recursively
    called "someMethod", which adds all of the elements into a string named 
    "results" in avending order. Pretty much stores "array" into "results" in
    reverse order.

    First, the array is declared with values (1-10). Then the array is called, 
    along with a 0, by a method "someMethod" to be stored in a string named 
    "result". The zero will represent the location of elements of the array.

    Method "someMethod" calls itself recursively, so long as the second value 
    passed, dose not excede the size of the array. If this is true, it will 
    call the method "someMethod" again, with the entiere array, and the next 
    value of the element in the array passed. It also returns the curent element
    referenced by x. Initialy it is zero, so in the case of array[1-10], 
    the element would be 1.

    This is where it can get confusing: because the if statement returns both 
    the method and a value in the array, one must pay attention to the order it 
    is done. This order of returning the method first, and then the value, is 
    the cause of why the elements of array "array" will returned in reverse 
    order once the final return is executed. What once read 
    "1 2 3 4 5 6 7 8 9 10" , will now be stored as a string as 
    "10 9 8 7 6 5 4 3 2 1". And this is all because of the order it was
    returned within the if statement.

    Thus when the x is 10, or larger than the bounds of the array length, the 
    else portion of the method will be executed, and reuturn nothing, thus only
    returning all of the previous values (10 9 8 7 6 5 4 3 2 1).

    Within "someMethod", i created prompts that show what the array location and 
    array value are at the time of the "if" and "else" statement is executed. uncoment the 
    "star slash" to see the results

    !!!UPDATE!!!
    I HAVE COMMENTED OUT THE STAR SLASH TO DISPLAY THE WORKINGS OF THE METHOD.

 */
package someclass;


// Class: SomeClass
public class SomeClass{
        //Method "someMethod"
	public static String someMethod(int[] array2, int x){
                //If "x" is less than the length of "array2" 
		if (x < array2.length){
                    
                    ///*
                      //COMENT OUT: UNCOMMENT TO SEE WHATS HAPPENING
                     System.out.print("if called   - Array element Referenced: ");
                     System.out.print(x);
                     System.out.printf(" ,Element Value: %d ", array2[x]);
                     System.out.print("\n");
                      //COMENT OUT: UNCOMMENT TO SEE WHATS HAPPENING
                    //*/
                         //Return recursive method "someMethod" and return 
                        //current value after(i.e: ...(Method)3+2+1 )
                            return String.format(
                            "%s%d ", someMethod(array2, x + 1), array2[x]);
                        }
                else{
                    ///*
                      //COMENT OUT: UNCOMMENT TO SEE WHATS HAPPENING
                            System.out.printf("else called - Array element Referenced: %d",x);
                            System.out.print("\nOUT OF BOUNDS OF LENGTH "
                                    + "OF ARRAY");
                            System.out.print("\n\nEverything will now be"
                                    + " returned into string in acending order:"
                                    + " 10, 9, 8...etc\n\n");
                            System.out.print("Result: ");
                      //COMENT OUT: UNCOMMENT TO SEE WHATS HAPPENING
                    //*/
                            return "";
                    }
	}

	public static void main(String[] args){
            //Declare Array with preset values
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	 
         //Call Method w/array and int 0, store in "returns" as a string.
         String results = someMethod(array, 0);
         
         //Display results in String
	 System.out.println(results);
	}
} // end class SomeClass
