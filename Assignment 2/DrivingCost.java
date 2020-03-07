/**************************************************************************
Class:       CS 1301
Section:     05
Term:        Spring 2017
Name:        Tarrin Melick
Instructor:  Mr. Robert Thorsen
Assignment:  2
Program:     5
ProgramName: DrivingCost
Purpose:     To print out the cost of a trip
Operation:   program is run, user inputs the variables, and the program
             prints out the total cost
Input(s):    Driving distance, miles per gallon, price per gallon.
Output(s):   the total cost of driving
Methodology: Declare matheods. print out the answers
References:  None
Time Spent:  5 mins
**************************************************************************/

import java.util.Scanner;
public class DrivingCost
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
     
      double Distance;
      double mpg;
      double ppg;
      double gallonsUsed;
      double TotalCost;
      
      
      System.out.println(" Enter the Driving distance please");
      Distance = input.nextDouble();
      System.out.println(" Enter the miles per gallon please");
      mpg = input.nextDouble();
      System.out.println(" Enter the price per gallon");
      ppg = input.nextDouble();
      
     
      gallonsUsed = (Distance / mpg);
      TotalCost = (gallonsUsed * ppg);
      System.out.println( " The cost of driving is " + TotalCost);
   }
}









/* driving distance divided by miles per gallon. 
Miles per gallon times price per gallon = cost of driving*/

