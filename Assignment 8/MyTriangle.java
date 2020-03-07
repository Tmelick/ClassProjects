/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 8
Program:    3
ProgramName:MyTriangle
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   none
Output(s):  Returns if its an actual triangle, and the area
Methodology:Declare variables, let computer do the math
References: none
Time Spent: 20 minutes
*******************************************************************************/
public class MyTriangle
{
   public static boolean isValid(double side1, double side2, double side3)
   {
      
   
      return((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1));
         
   
      
   }


   public static double area(double side1, double side2, double side3)
   {
      double area;
      double s;
      double formula;
      s = ((side1 + side2 + side3)/2);
      area = Math.sqrt(s * (s-side1) * (s - side2 )* (s - side3));
   
      return area;
   }
}

