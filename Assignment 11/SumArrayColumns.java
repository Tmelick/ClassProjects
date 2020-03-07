/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 10
Program:    1
ProgramName:SumArrayColumns
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   3 by 4 array
Output(s):  The sum of each column in the array 
Methodology:Declare variables, let computer do the sorting
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Scanner;
public class SumArrayColumns
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      double[][] sumColumn  = new double[3][4];
      String again = ("yes");
      while (again.equalsIgnoreCase("yes"))
      {
      
      // The input for the array
      System.out.print("Enter a 3-by-4 matrix row by row: ");
      for(int row = 0; row < sumColumn.length; row++)
      {
         for(int column = 0; column < sumColumn[row].length; column++)
         {
            sumColumn[row][column] = input.nextDouble();
         }
      }
      // loop that prints out the sum array
      for(int columnIndex = 0; columnIndex < 4; columnIndex++)
         System.out.print("Sum of the elements at column 0 is " + (sumColumn(sumColumn, columnIndex)) + "\n");
      System.out.println();
      
       System.out.print("\nRe-Run? yes/no? ");
      again = input.next();
   }
   }
   // method designed to add the columns together
   public static double sumColumn(double[][] m, int columnIndex)
   {
      int sum = 0;
      for(int i = 0; i < m.length; i++)
      {
         sum += m[i][columnIndex];
      }
      return sum; 
   }
}
      

