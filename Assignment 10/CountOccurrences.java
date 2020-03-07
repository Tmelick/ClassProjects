/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 10
Program:    1
ProgramName:CountOccurrences
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   numbers between 1 and 100
Output(s):  How many times a number was inputed
Methodology:Declare variables, let computer do the checking
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Scanner;
public class CountOccurrences
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
       String again = ("yes");
       
      
      while (again.equalsIgnoreCase("yes"))
      {
      int[] count = new int[101];
      int value = 1;
    

      System.out.print("Enter numbers between 1 and 100: ");
      while(value != 0)
      {
         value = input.nextInt();
         
         while( value < 0 || value > 100)
         {
            System.out.print("Entered an invalid number. Please Enter new number: ");
            value = input.nextInt();
         }
         if(value != 0) 
            count[value]++;
      }
      for( int i = 0; i < count.length; i++)
      {
         if(count[i] > 0)
         {
            System.out.print( i + " occurs " + count[i]);
            if(count[i] > 1)
               System.out.print(" times\n");
            else
               System.out.print(" time\n");
                  
            count[value] = 0;
         }
      }
       System.out.print("\nRe-Run? yes/no? ");
      again = input.next();
      
      
   }
      
      
   }
}