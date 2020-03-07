/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 7
Program:    3
ProgramName:Patterns
Purpose:    To print out the patterns
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   none
Output(s):  the specify patterns
Methodology:Declare variables, let computer do the math
References: none
Time Spent: 20 minutes
*******************************************************************************/
public class Patterns
{
   public static void main(String[] args)
   {
      System.out.println("Pattern A\n");
      
      for (int i = 1; i <= 6; i ++)
      {
         for (int j = 1; j <= i; j++)
            System.out.print(j + " ");
         System.out.println();
      
      }
      System.out.println("\nPattern B\n");
      
      for (int i = 6; i >= 1; i--)
      {
         for ( int j = 1; j <= i; j++)
            System.out.print(j + " ");
         System.out.println();
      }
      System.out.println("\nPattern C\n");
      
      for (int i = 1; i <= 6; i++)
      {
         for (int j = i; j <= 5; j++)
            System.out.print("  ");
         for (int k = i; k >= 1; k-- )
            System.out.print(k + " ");
         System.out.println();
      }
      System.out.println("\nPattern D\n");
      
      for (int i = 6; i >= 1; i--)
      {
           for(int j = 5; j >= i; j--)
               System.out.print("  ");
           for(int k = 1; k <= i; k++)
               System.out.print(k + " ");
            System.out.println();    
      }
   }
}