/**************************************************************************
Class:         CS1301
Section:       05
Term:          Spring 2017
Name:          Tarrin Melick
Instructor:    Mr. Robert Thorsen
Lab:           2
Exercise:      5
ProgramName:   Lab2Exercise5
Purpose:       to find the value of the coins in a jar
Operation:     When the program is run, it outputs the information codedin the program.
Input(s):      the differen't coin values
Output(s):     total value, total cents, total dollars
Methodology:   input all the values for the differen't coins then input the
               the math for how to find the value of it
References:    none
Time Spent:    30 minutes
*******************************************************************************/
import java.util.Scanner;
public class Lab2Exercise5
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
           
      int quaters;
      int quatersValue;
      int dimes;
      int dimesValue;
      int nickels;
      int nickelsValue;
      int pennies;
      int penniesValue;
      int totalValue;
      int totalCents;
      int totalDollars;
                
      System.out.print(" Enter number of Quaters\t" );
      quaters = input.nextInt();
      quatersValue = (quaters * 25);
            
      System.out.print(" Enter number of Dimes\t" );
      dimes = input.nextInt();
      dimesValue = (dimes * 10);
            
      System.out.print(" Enter number of nickels\t");
      nickels = input.nextInt();
      nickelsValue = ( nickels * 5 );
            
      System.out.print(" Enter number of pennies\t");
      pennies = input.nextInt(); 
      penniesValue = ( pennies * 1 );
            
      totalValue = ( quatersValue + dimesValue + nickelsValue
            + penniesValue );
      totalCents = (totalValue % 100);
      totalDollars = ((totalValue - totalCents) / 100);
            
      System.out.print(("Total = " + totalDollars + " Dollars and " + 
      totalCents + " Cents "));
     
            
   }
}