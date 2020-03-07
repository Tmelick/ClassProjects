/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        9
Exercise:   1
ProgramName:SumDigits
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   A number
Output(s):  The sum of the digits
Methodology:Declare variables, let computer do the math
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class SumDigits
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      long num;
      int sum;
      String again;
       again = ("yes");
      
      while (again.equalsIgnoreCase("yes"))
      {
      
         System.out.print("Please enter a number: ");
         num = input.nextLong();
      
         sum = sumDigits(num);
      
         System.out.println("The sum is " + sum);
         
         System.out.print("Re-Run? yes/no? ");
      again = input.next();
      }
      
      
   }

   public static int sumDigits(long n)
   {
      long sum;
      
      long series;
      sum = 0;
      
   
      while (n > 0)
      {
         series = n % 10;
         n = n / 10;
      
         sum = (sum += series);
      }
      return (int)sum;
   }
}