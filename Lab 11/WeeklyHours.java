/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        11
Exercise:   1
ProgramName:WeeklyHours
Purpose:    To practice two dimensional arrays
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   two dimensional arrays
Output(s):  The employee id and the hours they worked
Methodology:Declare variables, let computer do the sorting / math
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Scanner;
public class WeeklyHours
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      double [] rowTotals;
    double [][] weeklyHours = { 
         {2.5, 4.6, 3, 4, 5, 8, 8,},
         {7, 3, 4, 3, 3, 4, 4,},
         {3, 3, 4, 3, 3, 2, 2,},
         {9, 5, 4, 3, 6, 3, 8,},
         {3, 5, 4, 3, 6, 3, 8,},
         {3, 4, 4, 6, 3, 4, 4,},
         {3, 7, 4, 8, 3, 8, 4,},
         {6, 3, 5, 9, 2, 7, 9,},
         }; 
      rowTotals = new double[weeklyHours.length];
      for (int row = 0; row < weeklyHours.length; row++)
      {
         double rowTotal = 0;
         for (int column = 0; column < weeklyHours[row].length; column++)
            rowTotal += weeklyHours[row][column];
         rowTotals[row] = rowTotal;
      }
      double max = 0;
      int id = 0;
      System.out.print("Employee#         Weekly Hours" +
                       "\n------------------------------- \n");
      for (int i = 0; i < rowTotals.length; i++)
      {
         id = findMaxIndex(rowTotals);
         System.out.println(id + "\t\t\t\t\t\t\t" + rowTotals[id]);
         rowTotals[id] = -1;
            
      }
   }
         
         
         
   public static int findMaxIndex(double[] x)
   {
      double max = x[0];
      int maxIndex = 0;
      for (int i = 1; i < x.length; i++)
      {
         if ( x[i] > max)
         {
            max = x[i];
            maxIndex = i;
         }
      }
      return maxIndex;
   
   
   }
                 
}
 

