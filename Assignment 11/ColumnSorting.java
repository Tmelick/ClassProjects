/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 11
Program:    3
ProgramName:ColumnSorting
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   a 3 by 3 array
Output(s):  The sorted array 
Methodology:Declare variables, let computer do the sorting
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Scanner;
public class ColumnSorting
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String again = ("yes");
      while (again.equalsIgnoreCase("yes"))
      {
      
         double[][] list = new double[3][3];
         System.out.print("Enter a 3-by-3 matrix row by row: ");
         for(int row = 0; row < list.length; row++)
         {
            for(int column = 0; column < list[row].length; column++)
            {
               list[row][column] = input.nextDouble();
            }
         }
         double[][] temp = sortColumns(list);
         System.out.print("The column-sorted array is \n");
         for(int row = 0; row < temp.length; row++)
         {
            for(int column = 0; column < temp[row].length; column++)
            {
               System.out.print(temp[row][column] + " ");
            }
            System.out.println();
         }
         System.out.print("\nRe-Run? yes/no? ");
         again = input.next();
      }
      
   }
   
   
   public static double[][] sortColumns(double[][] m)
   {
      double[][] output = new double[m.length][m[0].length];
      double[] array = new double[m[0].length];
      
         
      for(int column = 0; column < m[0].length; column++)
      {
         for(int row = 0; row < m.length; row++)
         {
            array[row] = m[row][column];
         }
         sort(array);
         for(int row = 0; row < m.length; row++)
         {
            output[row][column] = array[row];  
         }
      }
      return output;
   }
      
   public static void sort(double[] list)
   {
      for(int i = 0; i < list.length - 1; i++)
      {
         double currentMin = list[i];
         int currentMinIndex = i;
      
         for (int j = i + 1; j < list.length; j++)
         {
            if (currentMin > list[j])
            {
               currentMin = list[j];
               currentMinIndex = j;
            }
         }
       
         if(currentMinIndex != i)
         {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
         }
      }              
      
   }
}