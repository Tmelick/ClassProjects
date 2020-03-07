/**************************************************************************
Class: CS 1301
Section: 05
Term: Spring 2017
Name: Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab: 3
Exercise: 3
ProgramName: Lab3Exercise3
Purpose: To find the cost of using a pay phone 
Operation: When the program is run, it outputs the information coded
 in the program.
Input(s): Minutes
Output(s): The total cost depending on inputed minutes
Methodology: Declare variables, if greater than 3 computer cost if less than
               3 cost is the standard connection
References: none
Time Spent: 10 minutes
*******************************************************************************/
import java.util.Scanner;
import java.text.NumberFormat;

public class Lab3Exercise3
{
   public static void main(String[] args)
   {
      
      
      double CONNECTION; // 1.99
      double FIRST3; // $2.00
      double ADDITIONAL; // .45
      int minutes;
      int three;
      double cost;
      double centCost;
      double dollarCost;
      
      Scanner input = new Scanner(System.in);
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      
      System.out.println("Please enter minutes on phone");
      minutes = input.nextInt();
      
      CONNECTION = 1.99;
      FIRST3 = 2.00;
      ADDITIONAL = .45;
      three = 3;
   
      
      System.out.println((" The toal time on phone is ") + minutes + (" minutes "));
      if ( minutes > three)
         cost = (CONNECTION + FIRST3) + (ADDITIONAL *( minutes - 3));  
      else
         cost = (CONNECTION + FIRST3);
      System.out.println(" total cost of the call is " + fmt.format(cost));
         
   
      
   }
}