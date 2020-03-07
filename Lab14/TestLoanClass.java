 /**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        14
Exercise:   1
ProgramName:TestLoan
Purpose:    Create objects to test methods from another class
Operation:  Test methods from loan and create new objects to test methods
            again
Input(s):   3 values: intrest,years, and loan ammount
Output(s):  none
Methodology:Declare variables, let computer do the sorting / math
References: Book
Time Spent: 15mins
*******************************************************************************/
import java.util.Scanner;

public class TestLoanClass {
 /** Main method */
   public static void main(String[] args) {
   // Create a Scanner
      Scanner input = new Scanner(System.in);
   
   // Enter annual interest rate
      System.out.print(
         "Enter annual interest rate, for example, 8.25: ");
      double annualInterestRate = input.nextDouble();
   
   // Enter number of years
      System.out.print("Enter number of years as an integer: ");
      int numberOfYears = input.nextInt();
   
   // Enter loan amount
      System.out.print("Enter loan amount, for example, 120000.95: ");
      double loanAmount = input.nextDouble();
   
   // Create a Loan object
      Loan loan =
         new Loan(annualInterestRate, numberOfYears, loanAmount);
   
   // Display loan date, monthly payment, and total payment
      System.out.printf("The loan was created on %s\n" +
         "The monthly payment is %.2f\nThe total payment is %.2f\n",
         loan.getLoanDate().toString(), loan.getMonthlyPayment(),
         loan.getTotalPayment());
         System.out.println("\n");
      
   // new loan object      
      Loan carLoan = new Loan(8.5, 5, 15000);
      
      carLoan.setAnnualInterestRate(9.0);
      System.out.println("New interest rate is: " + carLoan.getAnnualInterestRate());
      
      carLoan.setNumberOfYears(8);
      System.out.println("New amount of years is: " + carLoan.getNumberOfYears());
      
      carLoan.setLoanAmount(20000);
      System.out.println("New loan amount is: " + carLoan.getLoanAmount());
      
      
      System.out.println("Monthly Payment is: " + carLoan.getMonthlyPayment());
      System.out.println("Total Payment is: " + carLoan.getTotalPayment());
      System.out.println("Loan Date is: " + carLoan.getLoanDate());
   }
}
// If you read this I didn't know if you wanted me to use the getter methods first
// then set them all and then use the getter methods again. The instructions just say
// to display information about object carLoan after changes are made to the object.
// So I feel like this covers it, however I'm not sure. 