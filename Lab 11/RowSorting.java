/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        11
Exercise:   4
ProgramName:RowSorting
Purpose:    To practice two dimensional arrays
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   3 by 3 array
Output(s):  the array sorted by rows
Methodology:Declare variables, let computer do the sorting / math
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/

import java.util.Scanner;
public class RowSorting
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      double[][] array = new double[3][3];
       String again = ("yes");
      while (again.equalsIgnoreCase("yes"))
      {
      System.out.print("Enter array: ");
      for(int row = 0; row < array.length; row++)
      {
         for( int column = 0; column < array[row].length; column++)
         {
            array[row][column] = input.nextDouble();
         }
      }
      double[][] temp = sortRows(array);
      System.out.print("The row-sorted array is \n");
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
    
 
   public static double[][] sortRows(double[][] m)
   {
      double[][] output = new double[m.length][m[0].length];
      double[] array = new double[m[0].length];
     
      for(int row = 0; row < m.length; row++)
      {
         for(int column = 0; column < m[row].length; column++)
         {
            array[column] = m[row][column];
            
         }
         sort(array);
         for(int column = 0; column < m[row].length; column++)
         {
            output[row][column] = array[column];
            
         }
      }
      return output;
   }
      
   public static void sort(double[] list)
   {
      for (int i = 0; i < list.length - 1; i++)
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
     

/*

      
          for(int row = 0; row < m.length; row++)
      {
         for(int column = 0; column < m[row].length; column++)
         {
            System.out.print(temp[row][column] + " ");
         }
         System.out.println();
      }
      */