/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 7
Program:    5
ProgramName:OccurrenceOfMaxNumbers
Purpose:    To print out the occurrence of max numbers
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   A series of numbers
Output(s):  The biggest number entered and how many times it was entered
Methodology:Declare variables, let computer do the math
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class OccurrenceOfMaxNumbers
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);   
   
      int count;
      int number;
      int max;
      int again = 1;
      
      while (again == 1)
      {
         {
            System.out.print("Please enter a sereis of integers"  
               + "\nany number less then 1 will end it: ");
            number = input.nextInt();
            max = number;
            count = 1;  
         
            while (number > 0)
            
            {
               number = input.nextInt();
               if (max < number)
               {
                  max = number;
                  count = 1;
               } 
               else if (number == max)
                  count++;
        
            }
            System.out.println("The largest number is " + max);
            System.out.println("The occurrence count of the largest number is " + count);
         
         }
         System.out.print("test another 1 for yes? ");
         again = input.nextInt();
      }
   }
     
}








