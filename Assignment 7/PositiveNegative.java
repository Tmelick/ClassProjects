/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 7
Program:    1
ProgramName:PositiveNegative
Purpose:    To print out the positive sum, negative sum, total, and average
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   A series of numbers
Output(s):  positive sum, negative sum, total, and average
Methodology:Declare variables, let computer do the math
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;

public class PositiveNegative
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      double posSum;
      double negSum;
      double number;
      int posCount;
      int negCount;
      int again = 1;
      
      while (again == 1)
      {
      
         
         posSum = 0;
         negSum = 0;
         posCount = 0;
         negCount = 0;
         
         
         
         
         System.out.print("Enter an integer, the input ends if it is 0: ");
         number = input.nextDouble();
         
         
         
         if (number == 0) 
         {
            System.out.println("No numbers are entered except 0");
            System.out.print("Enter multiple integers, the input ends if it is 00: ");
            number = input.nextDouble();    
         }
         else if ( number != 0)
         {
            while (number != 00)
            {
               
               {
                  while (number != 0)
                  {
                     if (number > 0 )
                     {
                        posSum += number;
                        posCount++;
                     }
                     else
                     {
                        negSum += number;
                        negCount++;
                     }
                     
                     number = input.nextDouble();
                  }
                  
                  System.out.println("Positive sum: " + posCount
                        + "\nNegative sum: " + negCount
                        + "\nThe total is: " + (posSum + negSum)
                        + "\nThe Average is: " + ((negSum + posSum) / (negCount + posCount)));
                  
               }
            }
            
         }
         System.out.print("Test another 1 for yes? ");
         again = input.nextInt();
         
          
      } 
   }
   
}



