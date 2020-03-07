/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        9
Exercise:   2
ProgramName:DisplayPattern
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   an integer
Output(s):  a pattern of numbers descending left to right
Methodology:Declare variables, let computer print
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class DisplayPattern
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      int number;
      System.out.print("Enter an integer: ");
      number = input.nextInt();
      displayPattern(number);
   }
   public static void displayPattern(int n)
   {
      for(int i = 1; i <= n; i++)
      {
         for(int j = n; j >= i; j--)
         {
            System.out.print("  ");
         }
         for(int k = i; k >= 1; k--)
         {
            System.out.print(" " + k);
         }
         System.out.println();
      }
   }
}