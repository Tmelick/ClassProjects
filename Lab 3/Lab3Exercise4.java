/**************************************************************************
Class: CS 1301
Section: 05
Term: Spring 2017
Name: Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab: 3
Exercise: 4
ProgramName: Lab3Exercise4
Purpose: To discern if an integer pair is the origin 
         on the x-axis, y-axis, or which quadrant it is in
Operation: When the program is run, it outputs the information coded
 in the program.
Input(s): x-axis, y-axis
Output(s): if the integer pair is the origin 
         on the x-axis, y-axis, or which quadrant it is in
Methodology: Declare variables, enter the x and y, and 
               declare where they belong
References: none
Time Spent: 10 minutes
*******************************************************************************/
import java.util.Scanner;
public class Lab3Exercise4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      int x;
      int y;
   
      System.out.println("Please enter x-coordinate");
      x = input.nextInt();
      System.out.println("please enter y-coordinate");
      y = input.nextInt();
   
      if (x == 0 && y == 0)
         System.out.println( x + y + " is the origin");
      else if  (y == 0)
         System.out.print(("(") + x + (",") + y + (")") + 
                              " is on the x-axis");
      else if (x == 0)
         System.out.println(("(") + x + (",") + y + (")") +
                              " is on the y-axis");
      else if (x > 0 && y > 0)
         System.out.println(("(") + x + (",") + y + (")") +
                              " is in the first quadrant ");
      else if (x > 0 && y < 0)
         System.out.println(("(") + x + (",") + y + (")") +
                              " is in the fourth quadrant ");
      else if (x < 0 && y > 0)
         System.out.println(("(") + x + (",") + y + (")") +
                              " is in the second quadrant ");
      else
         System.out.println(("(") + x + (",") + y + (")") +
                              " is in the third quadrant ");
   
   
   
   
   }
}