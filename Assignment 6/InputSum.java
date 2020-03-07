/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 6
Program:    1
ProgramName:InputSum
Purpose:    To print out all the entered numbers and their sums
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   A series of numbers
Output(s):  The sum of all entered numbers
Methodology:Declare variables, get the correct answer
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;

public class InputSum
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      
      int sum;
      int number;
      boolean condition;
      
      System.out.println("Enter a series of positive integer numbers: (-1 ends input): ");
      sum = 0;
      String numbers = "";
      
      condition = true;
   
      while(condition) 
      {    
         number = input.nextInt();
         if(number == -1)
            break;
         else if(number > -1)
         {sum = sum + number; numbers = numbers + number + ","; } 
         else 
            System.out.println("Invalid input. Enter a valid input");
      }
      if (numbers.endsWith(",")) {
            numbers = numbers.substring(0, numbers.length()-1);
    }
      System.out.println("Entered numbers: " + numbers);
      System.out.println("The sum: " + sum);
   }
}