/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 10
Program:    2
ProgramName:Statistics
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   10 numbers
Output(s):  The mean and Standrad deviation of those numbers
Methodology:Declare variables, let computer do the math
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Scanner;
public class Statistics
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String again = ("yes");
       
      
      while (again.equalsIgnoreCase("yes"))
      {
      
      double[] myList = new double[10];
      System.out.print("Enter 10 numbers: ");
      for (int i = 0; i < myList.length; i++)
         myList[i] = input.nextDouble();
      
      double deviation = deviation(myList);
      
      System.out.printf("The mean is %.2f" , mean(myList));
      System.out.printf("\nThe standard deviation is %.5f" , deviation );
      
      System.out.print("\nRe-Run? yes/no? ");
      again = input.next();
      
      
   }

   }

   public static double mean(double[] x)
   {
      double mean = 0;
      for(int i = 0; i < x.length; i++)
         mean += x[i];
   
      return mean / x.length;
   }
   public static double deviation(double[] x)
   {
      double trueMean = 0;
      double mean = 0;
      double deviation = 0;
      double standardDeviation = 0;
      
      for(int i = 0; i < x.length; i++)
         mean += x[i];
        
      trueMean = mean / x.length;
       
      for(int j = 0; j < x.length; j++)
         deviation += Math.pow((x[j] - trueMean), 2);
       
   
      return deviation = (Math.sqrt(deviation / (x.length - 1)));
   }
}