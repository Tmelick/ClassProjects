/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        11
Exercise:   2
ProgramName:LargestRowColumns
Purpose:    To practice two dimensional arrays
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   none
Output(s):  the cordinates of the largest number in each row and column
Methodology:Declare variables, let computer do the sorting / math
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Scanner;
public class LargestRowColumns
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      String again = ("yes");
      while (again.equalsIgnoreCase("yes"))
      {

      int[][] random = new int[4][4];
      int[] rowTotals;
      int[] columnTotals;
      
   // This part is what establishes the array with random numbers between 0 and 1
       
      for(int row = 0; row < random.length; row++)
      {
         for(int column = 0; column < random[row].length; column++)
         {
            random[row][column] = (int)(0 + (Math.random() * 2));
         }
      }
      // this loop prints out the array
      for(int row = 0; row < random.length; row++)
      {
         for(int column = 0; column < random[row].length; column++)
         {
            System.out.print(random[row][column]);
         }
         System.out.println();
      }
   
      // this part creates a new single dimmensional array that aqquries the sum of each row
      rowTotals = new int[random.length];
      for (int row = 0; row < random.length; row++)
      {
         int rowTotal = 0; // creates the variable for row total
         for (int column = 0; column < random[row].length; column++)
            rowTotal += random[row][column]; // this adds the numbers in each row together.
         rowTotals[row] = rowTotal;// sets the total of each row to rowTotal and then continues the loop
      }
       // this part creates a new single dimmensional array that aqquries the sum of each column
      columnTotals = new int[random.length];
      for (int column = 0; column < random[0].length; column++)
      {
         int columnTotal = 0; // creates the variable for column total
         for (int row = 0; row < random.length; row++)
            columnTotal += random[row][column]; // this adds the numbers in each row together.
         columnTotals[column] = columnTotal;// sets the total of each column to columnTotals and then continues the loop
      }
      int rowID = 0;
      int columnID = 0;
     // this  calls the findMaxIndex method which then returns the index 
     // of the row with the highest total sum.
   
      rowID = findMaxIndexOfRows(rowTotals);   
      columnID = findMaxIndexOfColumns(columnTotals);
    
      
      System.out.println("The largest row index is " + rowID);
      System.out.println("The largest column index is " + columnID);
      
     System.out.print("\nRe-Run? yes/no? ");
      again = input.next();
   }
      
   }   
   // finds the index for greatest sum in rows      
   public static int findMaxIndexOfRows(int[] x)
   {
      int max = x[0];
      int rowMaxIndex = 0;
      for (int i = 1; i < x.length; i++)
      {
         if ( x[i] > max)
         {
            max = x[i];
            rowMaxIndex = i;
         }
      }
      return rowMaxIndex;
   
   
   }
   // This method finds the index for greatest sum in columns
   public static int findMaxIndexOfColumns(int[] x)
   {
      int max = x[0];
      int columnMaxIndex = 0;
      for (int i = 1; i < x.length; i++)
      {
         if ( x[i] > max)
         {
            max = x[i];
            columnMaxIndex = i;
         }
      }
      return columnMaxIndex;
   
   
   }
}