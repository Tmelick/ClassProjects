/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 8
Program:    1
ProgramName:InvestmentValue
Purpose:    To practice method
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   The amount and intrest rate
Output(s):  Table showing the investmentValue
Methodology:Declare variables, let computer do the math
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class InvestmentValue
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      double amount;
      double intrestRate;
      int year = 1;
      
      System.out.print("\nThe amount invested: ");
      amount = input.nextDouble();
      System.out.print("Annual intrest rate: ");
      intrestRate = (input.nextDouble() /100) /12;
      
      System.out.printf("\n%-8s%-14s", "Years", "Future Value");
      
      while(year <= 30)
      {
         System.out.printf("\n%-8d%8.2f", year,
            futureInvestmentValue(amount, intrestRate, year));
         year++;
      }
   }
   
    
    
   public static double futureInvestmentValue( double amountInvested, double intrestRate, int years)
   {
      double futureValue;
   
      futureValue = amountInvested * Math.pow((1 + intrestRate), (years * 12));
   
      return futureValue;
   
   }
    

  
 
  
      
}
