/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        10
Exercise:   2
ProgramName:AverageArray
Purpose:    To practice arrays
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   10 double values
Output(s):  The average of the inputed values
Methodology:Declare variables, let computer do the math
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class AverageArray
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double answer;
      answer = 0;
       String again;
       again = ("yes");
      
      while (again.equalsIgnoreCase("yes"))
      {

      double[] myList = new double[10];
      System.out.print("Please enter 10 double values: ");
      for (int x = 0; x < myList.length; x++)
         myList[x] = input.nextDouble();
      
      System.out.print("Average " + average(myList)); no
      
      System.out.print("\nRe-Run? yes/no? ");
      again = input.next();
      
      
   }
    
   }
   public static double average(int[] array)
   {
      double answer;
      answer = 0;
      for (int i = 0; i < array.length; i++)
         answer += array[i]; 
      return (answer/array.length);
   }
   public static double average(double[] array)
   {
      double answer;
      answer = 0;
      for (int i = 0; i < array.length; i++)
         answer += array[i]; 
      return (answer/array.length);
   
   }
}