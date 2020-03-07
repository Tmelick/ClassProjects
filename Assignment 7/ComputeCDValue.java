/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 7
Program:    4
ProgramName:ComputeCDValue
Purpose:    To print out the monthly value
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   The ammount, annual percentage, number of months
Output(s):  Value for each 18 months
Methodology:Declare variables, let computer do the math
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class ComputeCDValue
{
   public static void main(String[] args)
   {
   
      double amount;
      double monthlyIR;
      int nMonths;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the amount: ");
      amount = input.nextDouble();
   
      System.out.print("Enter annual percentage: ");
      monthlyIR = input.nextDouble() / 1200;
   
      System.out.print("Enter number of months: ");
      nMonths = input.nextInt();
   
      for (int i = 1; i <= nMonths; i++)
      {
         amount += (amount * monthlyIR);
      
         System.out.printf("Month %d Value: %.2f \n", i, amount);
      }
   
   }
}