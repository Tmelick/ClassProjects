/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 12
Program:    2
ProgramName:Account
Purpose:    To create methods for another class to utalize
Operation:  Creating multiple methods for which another class
            can call
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the math/ sorting
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Date;
import java.util.Scanner;
class Account
{
   private int id;
   private double balance;
   private static double annualInterestRate;
   Date dateCreated;
   public String information;
   

   public Account()
   {
      setId(0);
      setBalance(0);
      setAnnualInterestRate(0);
      dateCreated = new Date();
      
   }
   
   public Account(int id, double balance)
   {
      this.id = id;
      this.balance = balance;
      dateCreated = new Date();
      information = ("Test this method");
   } 
   
   public String toString()
   {
      return ("Account ID: " + id + "\n" +
              "Account Balance: " + balance +
              "\nInterestRate: " + annualInterestRate +
              "\nDate Opened: " + dateCreated);
   }
   public int getId()
   {
      return id;
   }
   public void setId(int id)
   {
      this.id = id;
   }
   public double getBalance()
   {
      return balance;
   }
   public void setBalance(double balance)
   {
      this.balance = balance;
   }
   public static double getAnualIntrestRate()
   {
      return annualInterestRate;
   }
   public static void setAnnualInterestRate(double annualInterestRate)
   {
      Account.annualInterestRate = annualInterestRate;   
   }
   public Date getDateCreated()
   {
      return dateCreated;
   }
   public static double getMonthlyInterestRate()
   {
      return (getAnualIntrestRate() / 100 / 12);
   }
   
   public double getMonthlyInterest()
   {
      return (getBalance() * (getMonthlyInterestRate()));
   }
   
   public double withdraw(double withdraw)
   {  
      balance -= withdraw;
      return(getBalance() - withdraw);
   }
   
   public double deposit(double deposit)
   {
      balance += deposit;
      return(getBalance() + deposit);
   }
    
   
   
}