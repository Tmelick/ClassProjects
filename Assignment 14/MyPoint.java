/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 14
Program:    2
ProgramName:MyPoint
Purpose:    To create methods for another class to utalize
Operation:  Creating multiple methods for which another class
            can call to solve the prbolem presented in that class
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the math/ sorting
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
public class MyPoint
{
   private double x;
   private double y;

   public MyPoint()
   {
      this(0, 0);
   }

   public MyPoint(double x , double y)
   {
      this.x = x;
      this.y = y;
   }
   
   public String toString()
   {
   return (getX() + ", " + getY());
   }
   
   public double distance(MyPoint point2)
   {
      return Math.sqrt(Math.pow((this.x - point2.x),2) + Math.pow((this.y - point2.y), 2)); 
   }
   public double distance(double x, double y)
   {
      return distance(new MyPoint(x , y)) ;
   }
   
   public double getY()
   {
      return y;
   }
   public double getX()
   {
      return x;
   }
}
