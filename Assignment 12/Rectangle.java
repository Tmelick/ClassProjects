/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 12
Program:    1
ProgramName:Rectangle
Purpose:    To create methods for another class to utalize
Operation:  Creating multiple methods for which another class
            can call
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the math/ sorting
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
public class Rectangle
{
   double width;
   double height;

   Rectangle()
   {
      width = 1;
      height = 1;
   }
   Rectangle(double width, double height)
   {
      this.width = width;
      this.height = height;
   }
   double getArea()
   {
      return(width * height);
   }
   double getPerimeter()
   {
      return( 2 * (width + height));
   }

}

