/**************************************************************************
Class:       CS 1301
Section:     05
Term:        Spring 2017
Name:        Tarrin Melick
Instructor:  Mr. Robert Thorsen
Assignment:  3
Program:     3
ProgramName: PhoneBill
Purpose:     To print out the user's account, service, and bill.
Operation:   When the program is run, it prompts the user for their
             account number, service, and total minutes
Input(s):    account number, service, and total minutes
Output(s):    account number, service, and total ammount due
Methodology: Declared the methods and let the computer do the math for me
References:  None
Time Spent:  40mins
**************************************************************************/
import java.util.Scanner;
public class PhoneBill
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
     // Acount number
      int accountNumber;
     
      System.out.println("Please enter your Account number");
      accountNumber = input.nextInt(); 
      
      // Service
      char service;
      
      System.out.println("Please enter your Service");
      service = input.next().charAt(0);
      
        // Regular service
    final  double TEN;
    final double FIFTY;
    final double REGULARCHARGE; // .20
      int minutes;
      double rCost;
      
      TEN = 10;
      FIFTY = 50;
      REGULARCHARGE = .20;
      rCost = 0;
      {
         if (service == 'r' || service == 'R'){
            System.out.println(" Please enter amount of minutes ");
            minutes = input.nextInt();
            if ( minutes <= FIFTY )
               rCost = TEN;
            else if ( minutes > FIFTY)
               rCost = (( minutes - FIFTY ) * REGULARCHARGE + TEN  );
            System.out.println("Account number is " + accountNumber);
            System.out.println("Service plan is " + service);
            System.out.println("Number of Minutes is " + (minutes));
            System.out.println("Total Cost is: $" + ( rCost ));
          
         }
      // Premium service
      
         int dayMinutes;
         int nightMinutes;
       final int SEVENTYFIVE; // minutes for day fee
       final int TWENTYFIVE; // monthly fee 
       final int HUNDREAD; // first 100 minutes Night
       final double DAYRATE; // .10
       final double NIGHTRATE; // .05
       final double DAYCOST; // total day cost
       final double NIGHTCOST; // total night cost
      
         SEVENTYFIVE = 75;
         TWENTYFIVE = 25;
         HUNDREAD = 100;
         DAYRATE = .10;
         NIGHTRATE = .05;
         DAYCOST = 0;
         NIGHTCOST = 0;
      
         if  (service == 'p' || service == 'P'){
            System.out.println(" Please enter the minutes used during the day: ");
            dayMinutes = input.nextInt();
            System.out.println(" Please enter the minutes used during the night: ");
            nightMinutes = input.nextInt();
            if (dayMinutes <= SEVENTYFIVE)
               DAYCOST = (TWENTYFIVE);
            else if ( dayMinutes > SEVENTYFIVE )
               DAYCOST = (( dayMinutes - SEVENTYFIVE) * DAYRATE + TWENTYFIVE );
           
            if (nightMinutes <= HUNDREAD)
               NIGHTCOST = (TWENTYFIVE);
            else if ( nightMinutes > HUNDREAD) 
               NIGHTCOST = ((nightMinutes - HUNDREAD) * NIGHTRATE + TWENTYFIVE );
            System.out.println("Account number is " + accountNumber);
            System.out.println("Service plan is " + service);
            System.out.println("Number of Day Minutes is " + (dayMinutes ));
            System.out.println("Number of Night Minutes is " + (nightMinutes));
            System.out.println("Total Cost is: $" + ( (NIGHTCOST + DAYCOST) - TWENTYFIVE));
         
         } 
          }  
   }   
}
