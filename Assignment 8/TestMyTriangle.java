/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 8
Program:    3
ProgramName:TestMyTriangle
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   The sides of a triangle
Output(s):  the area of the triangle if it is valid, if its invalid then say
            valid
Methodology:Declare variables, let computer do the math
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class TestMyTriangle
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double side1;
      double side2;
      double side3;
      double area;
      String again;
      again = ("yes");
      
      while (again.equalsIgnoreCase("yes"))
      {

   
      System.out.print("Enter three sides for a triangle: ");
      side1 = input.nextDouble();
      side2 = input.nextDouble();
      side3 = input.nextDouble();
     
     
      if (MyTriangle.isValid(side1, side2, side3))
      {
         System.out.print(MyTriangle.area(side1, side2, side3));
      }
      else 
         System.out.print("Sides are invalid");
      
       System.out.print("\nWould you like to re-run? yes/no ");
         again = input.next();
      }

   }
}
