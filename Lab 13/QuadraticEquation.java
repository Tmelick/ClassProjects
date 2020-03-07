 /**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        13
Exercise:   3
ProgramName:QuadraticEquation
Purpose:    To create methods for another class to use
Operation:  creates multiple methods for other classes to use
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the sorting / math
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/
class QuadraticEquation
{
   private double a;
   private double b;
   private double c;

   public QuadraticEquation(double a, double b, double c)
   {
      this.a = a;
      this.b = b;
      this.c = c;
   }

   public double getA()
   {
      return a;
   }
   public double getB()
   {
      return b;
   }
   public double getC()
   {
      return c;
   }
   public double getDiscriminat()
   {
      return (( b * b) - (4 * a * c));
   }
   public double getRoot1()
   {
      return ((-b + Math.sqrt(( b * b) - (4 * a * c))) / (2 * a));
   }
   public double getRoot2()
   {
      return ((-b - Math.sqrt(( b * b) - (4 * a * c))) / (2 * a));
   }
   public String toString()
   {
      if(getDiscriminat() > 0)
         return ("A = " + getA() + " B =" + getB() + " C = " + 
               getC() + " Discriminat = " + getDiscriminat() + "\nRoot1 = " + getRoot1() +
               " Root2 = " + getRoot2()); 
      else if(getDiscriminat() == 0)
         return ("A = " + getA() + " B = " + getB() + " C = " + 
               getC() + "\nDiscriminat = " + getDiscriminat() + "\nRoot1 = " + getRoot1()); 
      else
         return ("A = " + getA() + " B = " + getB() + " C = " + 
               getC() + "\nDiscriminat = " + getDiscriminat() + "\nNo roots ");      
   }
}