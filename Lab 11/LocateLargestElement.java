/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        11
Exercise:   3
ProgramName:LocateLargestElement
Purpose:    To practice two dimensional arrays
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   two dimensional arrays
Output(s):  The location of the largest element in the array
Methodology:Declare variables, let computer do the sorting / math
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/

import java.util.Scanner;
public class LocateLargestElement
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String again = ("yes");
      while (again.equalsIgnoreCase("yes"))
      {

      int rowSize = 0;
      int columnSize = 0;
      
      
      // asks for the size of the array
     
      
      System.out.print("Enter the number of rows and colums of the array: ");
      rowSize = input.nextInt();
      columnSize = input.nextInt();
      
      // declares the array with the inputed size
      
      double[][] locateLargest = new double[rowSize][columnSize];
   
      System.out.print("Enter the array: "); 
      for(int row = 0; row < locateLargest.length; row++)
      {
         for(int column = 0; column < locateLargest[row].length; column++)
         {
            locateLargest[row][column] = input.nextDouble();
         }
      }
      
      int[] sorted = locateLargest(locateLargest);
      System.out.print("The location of the largest elemnt is at (" + sorted[0] + 
                       ", " + sorted[1] + ")");
   System.out.print("\nRe-Run? yes/no? ");
      again = input.next();
      }
   }
   public static int[] locateLargest(double[][] a)
   {
      double number = 0;
      int[] temp = new int[2];
      
      for (int i = 0; i < a.length; i++)
      {
         for (int j = 0; j < a.length; j++)
         {
            if(number < a[i][j])
            {
               number = a[i][j];
               temp[0] = i;
               temp[1] = j;
            }
         }
      }
      return temp;
   }
}
            
      
      /*
      for(int row = 0; row < locateLargest.length; row++)
      {
         for(int column = 0; column < locateLargest[row].length; column++)
         {
            System.out.print(locateLargest[row][column] + " ");
         }
         System.out.println();
      }
      This prints out the array for testing 
      */
      

