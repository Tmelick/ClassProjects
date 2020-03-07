/**************************************************************************
Class:       CS 1301
Section:     05
Term:        Spring 2017
Name:        Tarrin Melick
Instructor:  Mr. Robert Thorsen
Assignment:  3
Program:     1
ProgramName: CheckNumber
Purpose:     To determine if a number is postive, negative or zero
Operation:   When the program is run, it prompts the user for the 
             the number then ouputs what it is
Input(s):    An integer
Output(s):   If the integer is positve, negative, or zero
Methodology: Declared the methods and let the computer determine what the
              number is
References:  None
Time Spent:  10mins
**************************************************************************/
import java.util.Scanner;
public class CheckNumber
{
   public static void main(String [] args)
   {
   
      Scanner input = new Scanner(System.in);
   
      int number;
   
      System.out.println(" Please enter the number");
      number = input.nextInt();
   
      if ( number > 0 )
         System.out.print( number + " is positive");
      if ( number < 0 )
         System.out.print( number + " is negative");
      if ( number == 0 )
         System.out.print( number + " is zero");
         
         System.out.println(25 * 5 % 4);
   }
}