/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        8
Exercise:   4
ProgramName:ComputeCommissions
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   none
Output(s):  table that shows sales amount and commission
Methodology:Declare variables, let computer do the math
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
public class ComputeCommissions
{
   public static void main(String[] args)
   {
      int amount = 2500;
   
      System.out.printf("%-15s%-15s", "Sales Amount","Commission");
      System.out.print("\n__________________________________");
   
      while(amount <= 100000)
      {
         System.out.printf("\n%-15d%6.1f", amount, computeComission(amount));
      
         if (amount == 7500)
            amount += 2500;
         else
            amount += 5000;
      }
   }
   public static double computeComission(double salesAmount)
   {
      double commission;
   
      if(salesAmount <= 5000)
         commission = salesAmount *.08;
      else if (salesAmount <= 10000)
         commission = (salesAmount - 5000) * .10 + (5000 * .08);
      else commission = (salesAmount - 10000) * .12 + (5000 * .10)
                         + (5000 * .08);
      return commission;
   
   
   
   
   }
}