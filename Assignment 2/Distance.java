/**************************************************************************
Class:       CS 1301
Section:     05
Term:        Spring 2017
Name:        Tarrin Melick
Instructor:  Mr. Robert Thorsen
Assignment:  2
Program:     4
ProgramName: Distance
Purpose:     to solve the equation
Operation:   Prompts the user to enter the variables then prints out 
             the answer to the math problem
Input(s):    The 4 variables
Output(s):   the answer to the math problem
Methodology: Declare methods, Requests input, and then prints out the 
               answer to the equation.
References:  None
Time Spent:  5 mins
**************************************************************************/

import java.util.Scanner;
public class Distance 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      double equation;
      double percent;
      double x;
      double y;
      double x1;
      double y1;
      
      System.out.println(" please enter x ");
      x = input.nextDouble();
      System.out.println(" please enter y ");
      y = input.nextDouble();
      System.out.println(" please enter x1 ");
      x1 = input.nextDouble();
      System.out.println(" please enter y1 ");
      y1 = input.nextDouble();
      
      equation = (((x1 - x) * (x1 - x)) + (( y - y1) * (y - y1)));
      
      percent = Math.pow(equation, 0.5);
      
      System.out.println(" the distance between the two points is " + percent );
   }
}