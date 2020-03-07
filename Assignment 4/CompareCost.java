/**************************************************************************
Class:       CS 1301
Section:     05
Term:        Spring 2017
Name:        Tarrin Melick
Instructor:  Mr. Robert Thorsen
Assignment:  4
Program:     4
ProgramName: CompareCost
Purpose:     To show which package is better
Operation:   When the program is run, it prompts the user for the weight
             and price of package 1 and 2. Then prints out which one is 
             better
Input(s):    Wieght and price of package 1 and 2
Output(s):   Which one is a better deal
Methodology: Declare each variable then have the computer do the math
References:  None
Time Spent:  20 mins
**************************************************************************/
import java.util.Scanner;
public class CompareCost
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double priceOne;
      double priceTwo;
      double weightOne;
      double weightTwo;
      double packageOne;
      double packageTwo;
   
      System.out.println("Please enter the weight and the price for package 1 ");
      weightOne = input.nextDouble();
      priceOne = input.nextDouble();
      packageOne = weightOne / priceOne;
   
      System.out.println("Please enter the weight and the price for package 2 ");
      weightTwo = input.nextDouble();
      priceTwo = input.nextDouble();
      packageTwo = weightTwo / priceTwo;
   
      if(packageOne > packageTwo)
         System.out.print(" Package 1 has a better price");
      else if(packageTwo > packageOne)
         System.out.print(" Package 2 has a better price");
      else
         System.out.print(" Two packages have the same price");
       
   }
}

