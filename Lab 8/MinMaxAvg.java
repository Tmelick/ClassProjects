/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        8
Exercise:   1
ProgramName:MinMaxAvg
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   Three ints
Output(s):  The min max and avearge of three numbers
Methodology:Declare variables, let computer do the math
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class MinMaxAvg
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
   
      int x;
      int y;
      int z;
      int max;
      int min;
      double average;
      String again;
      again = ("yes");
      
      while (again.equalsIgnoreCase("yes"))
      {
      
         System.out.print("Please enter 3 numbers: ");
         x = input.nextInt();
         y = input.nextInt();
         z = input.nextInt();
      
         max = max(x, y, z);
         min = min(x, y, z);
         average = average(x, y, z);
      
         System.out.println("Max value: " + max);
         System.out.println("Min value: " + min);
         System.out.println("Average value: " + average);
      
         System.out.print("\nWould you like to re-run? yes/no ");
         again = input.next();
      }
   
   }

   public static int max(int num1, int num2, int num3)
   {
      int result;
      if (num1 > num2 && num1 > num3)
         result = num1;
      else if ( num2 > num1 && num2 > num3)
         result = num2;
      else 
         result = num3;
      return result;
   }

   public static int min(int num1, int num2, int num3)
   {
      int result2;
      if (num1 < num2 && num1 < num3)
         result2 = num1;
      else if ( num2 < num3 && num2 < num1)
         result2 = num2;
      else
         result2 = num3;
      return result2;
   
   }
   public static double average(double num1, double num2, double num3)
   {
      double result3;
      result3 = ((num1 + num2 + num3) / 3);
      return result3;
   
   }
}
