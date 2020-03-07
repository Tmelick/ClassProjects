/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 12
Program:    2.2
ProgramName:TestAccount
Purpose:    To print out information using methods from Account
Operation:  Creates objects and uses methods from the Account class
            to modify these objects
Input(s):   none
Output(s):  Multiple information for each rectangle object
Methodology:Declare variables, let computer do the math/ sorting
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Date;
public class TestAccount
{
   public static void main(String[] args)
   {
      Account.setAnnualInterestRate(4.5);
     
      Account basic = new Account(1122, 20000);
      basic.setBalance(25000);
      System.out.println("Account balance of basic = " + basic.getBalance());
      basic.withdraw(2500);
      System.out.println("Account balance of basic = " + basic.getBalance());
      basic.deposit(3000);
      System.out.println("Account balance of basic = " + basic.getBalance());
      // Printed out requirements for original problem
      System.out.print("\nUSING TOSTRING\n");
      System.out.print(basic.toString());
      
      System.out.print("\n\nUSING GETTER METHODS");
      basic.setId(1234);
      System.out.println("\nAccount ID: " + basic.getId());
      System.out.println("Account Balance: " + basic.getBalance());
      System.out.println("Annual Interest Rate: " + basic.getAnualIntrestRate());
      System.out.println("Monthly Interest: " + basic.getMonthlyInterest());
      System.out.println("Monthly Inerest Rate: " + basic.getMonthlyInterestRate());
      System.out.println("Date Opened: " + basic.getDateCreated());
      System.out.println();
      
      
      // Create myAccount object and set all the possible information
      Account myAccount = new Account(535237, 2000);
      System.out.println("Account balance of myAccount = " + myAccount.getBalance());
      myAccount.setBalance(5000);
      System.out.println("Account balance of myAccount = " + myAccount.getBalance());
      myAccount.withdraw(636);
      System.out.println("Account balance of myAccount = " + myAccount.getBalance());
      myAccount.deposit(5000);
      System.out.println("Account balance of myAccount = " + myAccount.getBalance());
   
      // Print out and access all Account methods for the first object
      System.out.print("\nUSING TOSTRING\n");
      System.out.print(myAccount.toString());
      
      System.out.print("\n\nUSING GETTER METHODS");
      myAccount.setId(9876);
      System.out.println("\nAccount ID; " + myAccount.getId());
      System.out.println("Account Balance: " + myAccount.getBalance());
      System.out.println("Annual Intrest Rate: " + myAccount.getAnualIntrestRate());
      System.out.println("Monthtly Interst: " + myAccount.getMonthlyInterest());
      System.out.println("Monthly Interset Rate: " + myAccount.getMonthlyInterestRate());
      System.out.println("Date Opened: " + myAccount.getDateCreated());
      System.out.println();
      
      
      // Create yourAccount object and set all possible information
      Account yourAccount = new Account();
      yourAccount.setBalance(500);
      System.out.println("Account balance of myAccount = " + yourAccount.getBalance());
   
      yourAccount.withdraw(5000);
      System.out.println("Account balance of myAccount = " + yourAccount.getBalance());
   
      yourAccount.deposit(10000);
      System.out.println("Account balance of myAccount = " + yourAccount.getBalance());
   
      // Print out all and access all Account methods for the second object
      System.out.print("\nUSING TOSTRING\n");
      System.out.print(yourAccount.toString());
      
      System.out.print("\n\nUSING GETTER METHODS");
      yourAccount.setId(567);
      System.out.println("\nAccount ID; " + yourAccount.getId());
      System.out.println("Account Balance: " + yourAccount.getBalance());
      yourAccount.setAnnualInterestRate(5.3);
      System.out.println("Annual Interest Rate " + yourAccount.getAnualIntrestRate());
      System.out.println("Monthly Interest: " + yourAccount.getMonthlyInterest());
      System.out.println("Monthly interset Rate: " + yourAccount.getMonthlyInterestRate());
      System.out.println("Date Opened: " + yourAccount.getDateCreated());
     
      
      
      
      
   }
}