 /**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        13
Exercise:   3
ProgramName:TestQuadraticEquation
Purpose:    To Test methods created by Stock
Operation:  Create an object that calls from the specified class. Then calls
            methods
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the sorting / math
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Scanner;
public class TestQuadraticEquation
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a, b, and c: ");
   
      QuadraticEquation Equation = new QuadraticEquation(input.nextDouble(), input.nextDouble(), input.nextDouble());
   
      if(Equation.getDiscriminat() > 0)
         System.out.println("Root 1: " + Equation.getRoot1() + 
                         "\nRoot 2: " + Equation.getRoot2());        
      else if (Equation.getDiscriminat() == 0)
         System.out.println("Root 1: " + Equation.getRoot1());
      else
         System.out.println("The equation has no roots.");
         
      System.out.println("\n");   
      System.out.println(Equation.toString());
    
   
   }
}
