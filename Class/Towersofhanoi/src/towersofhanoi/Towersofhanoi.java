/*

*/
package towersofhanoi;

public class Towersofhanoi {
    static int step_counter;
    
    //disks = numbers od disks to move
    //pegA =  siurce peg
    //pegB = temporary peg
    //pegC = destination peg
    public static void solveTowers(int disks, int source, int dest, int temp)
    {
        if (disks == 1 ){ //base case
            step_counter++;
            System.out.printf("%nStep #%d: %d ==> %d",step_counter,source,dest);
            return;     //No recursive call for base case
        }
            
            solveTowers(disks-1,source,temp,dest);
            step_counter++;
            System.out.printf("%nStep #%d: %d ==> %d",step_counter,source,dest);
            solveTowers(disks-1,temp,dest,source);
    }
    
    public static void main(String[] args) {
            int start=1;
            int temp=2;
            int end=3;
            int number_of_disks =10;
            
            step_counter=0;
            
            //Prompt User
            System.out.print("Towers Of Hanoi\n\n");
            
            //Call Function
            solveTowers(number_of_disks, start, end, temp);
            
            //Print Extra Lines
            System.out.println("\n\n");
        
    }
    
}
