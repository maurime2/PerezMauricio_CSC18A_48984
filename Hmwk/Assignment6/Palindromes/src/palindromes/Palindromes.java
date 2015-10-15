/*
   Mauricio S. Perez
   CSC18a - 48984
   Proffesor Paul J. Conrad
   Assignment 6: Problem 18.14 (Palindromes)
 
   Problem: Chapter 18 Exercise #14 due 10/15/15 at the beginning of class
            for a maximum of 40 points with write up.

            18.14 (Palindromes)
            A palindrome is a string that is spelled the same way forward and
            backward. Some examples of palindromes are “radar,” 
            “able was i ere i saw elba” and (if spaces are ignored) 
            “a man a plan a canal panama.” 
			
                Write a recursive method "testPalindrome".
                        - "testPalindrome" returns boolean value true if the
                          string stored in the array is a palindrome.
                        - false otherwise. 

                The method should ignore:
                        - spaces.
                        - punctuation.
 */

package palindromes;
    //Utility Scanner
    import java.util.Scanner; 

//Class Palindromes
public class Palindromes {

    //Main
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);   
        
        //Declare Variables
        String Original= "";       // Original String
        String Copy = "";          // Copy String
        String Reverse = "";      // Palendrome
        int Length = 0;     // Length of Manipulated String
        int End = 0;       //Last Element of Manipulated String
        boolean dummy = false;
                
        //Enter a String
        System.out.print("Please Enter a Palendrome: ");
        Original = input.nextLine(); // read a line of text
        Copy = Original;
        System.out.println("Your Original Input is   : "+Copy);
        
        //Prepare String Array to be manipulated
        Copy = Copy.replaceAll("\\s+","");          //Removes All Spaces.
        Copy = Copy.toLowerCase();                  //Converts All to Lowercase.
        Copy = Copy.replaceAll("[^0-9a-zA-Z ]", "");//Removes All Punctuation.
        System.out.println("Fixed String             : "+Copy);
        
        //Manupulate Copy to be reversed
        Length = Copy.length();                         //Length
        System.out.printf("String Length is: %d",Length);
        End = (Copy.length())-1;                        //End Element
        System.out.printf("\nLast Element @  : %d",End);
            //Reverse String
            for(int i=0;i<Length;i++){
                Reverse += Copy.charAt(End);
                End--;
                // System.out.printf("\nInstance   : %d",i); //Test Instance.
            }
        System.out.println("\nString in Reverse Order  : "+Reverse);
        
        //testPalindrome Method Called: TEST FOR PALENDROME
        End = (Copy.length())-1;                        //End Element
        dummy = (testPalindrome(Copy,Reverse, End, Length));
        
        //Re Afirm Results in main.
        if(dummy==true){
        System.out.println(Original+" , without spaces or punctuation, "
                + "is a Palendrome!!!");
        }
        else{
        System.out.println(Original+" , is not a Palendrome, even without "
                + "spaces or punctuation ");
        }
        
        
    }//End Main
    
    //Classes
    public static boolean testPalindrome
        ( String COPY, String REVERSE, int END, int LENGTH){
        boolean pal = false;

        //Test Palendrome
        for(int i=0;i<LENGTH;i++){
                if(COPY.charAt(END) == REVERSE.charAt(END)){
                    END--;
                    i++;
                }
                if(COPY.charAt(END) != REVERSE.charAt(END)){
                    System.out.println("This is not a Palindrome...");
                    //System.out.print("The Input is not a Palendrome!!!");
                    pal = false;
                    return pal;
                }
            
            }
        //It is a palendrome
        System.out.print("YOU HAVE ENTERED A PALENDROME!!! CONGRATS!!!\n");
        pal = true;
        return pal; 
    }
    
}//End Class Palindromes
