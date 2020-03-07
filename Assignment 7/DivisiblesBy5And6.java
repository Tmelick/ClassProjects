/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 7
Program:    2
ProgramName:DivisbleBy5And6
Purpose:    To print out all the numbers between the entered integers that are 
            divisble by 5 and 6
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   Begining and ending integers
Output(s):  All numbers divisible by 5 and 6 of the two integers
Methodology:Declare variables, let computer do the math
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class DivisiblesBy5And6
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner (System.in);
   
   
      int ending;
      int integer;
      int begining;
      int count2;
     
      
      
      System.out.print("Please enter begining integers and ending: ");
      begining = input.nextInt();
      ending = input.nextInt();
      
      while (begining != 9999)
      {
         int counter = 0;
         
         for (int i = begining; i <= ending; i ++)
         {
            if ( i % 5 == 0 ^ i % 6 == 0)
            {
               counter++;
               
               if (counter % 10 == 0)
                  System.out.println(i + " ");
               else
                  System.out.print(i + " ");
               
            }
         }
         System.out.print("\nPlease enter begining integers and ending "
                        + "\nEnter 9999 if you want to end the run "
                        + "\nOtherwise enter begining and ending again:");
         begining = input.nextInt();
         ending = input.nextInt();
      }
         
       
   }    
   
}
