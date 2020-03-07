/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 5
Program:    1
ProgramName:Payroll
Purpose:    to print out the user's net pay
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   User's name, hours, pay, Federal tax, and state tax.
Output(s):  User's name, hours, pay, federal tax, and state tax. It also 
            prints out the federal witholding, state witholding, total
            deductions and the next pay
Methodology:Declare variables, get the correct answer
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class Payroll
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      String name;
      int hours;
      double pay;
      double federalTax;
      double stateTax;
      double wage;
      double totalFederal;
      double totalState;
      double netPay;
   
   
      System.out.print(" Enter employee's name: ");
      name = input.next();
      
      System.out.print(" Enter number of hours worked in a week: ");
      hours = input.nextInt();
      
      System.out.print(" Enter hourly pay rate: ");
      pay = input.nextDouble();
      
      System.out.print(" Enter federal tax withholding rate: ");
      federalTax = input.nextDouble();
      
      System.out.print(" Enter state tax withholding rate: ");
      stateTax = input.nextDouble();
     
      wage = (hours * pay);
      totalFederal = wage * federalTax;
      totalState = wage * stateTax;
      netPay = wage - (federalTax + stateTax);
      
      System.out.print("Employee Name: " + name  +
               "\nHours Worked: $" + hours +
               "\nPay Rate: $" + pay + 
               "\nGross Pay: $" + wage +
               "\nDeductions:" +
               "\n  Federal Witholding (" + federalTax + "): $" + totalFederal + 
               "\n  State Withholding (" + stateTax + "): $" + totalState +
               "\n  Total Deduction: $" + (totalFederal + totalState ) +
               "\nNet pay: $" + netPay);
             
               
   }
}