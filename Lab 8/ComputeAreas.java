/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        8
Exercise:   2
ProgramName:ComputeAreas
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   Shape, and specific requirements for area of that shape
Output(s):  The area of the the user's chosen shape
Methodology:Declare variables, let computer do the math
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;

public class ComputeAreas
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      double side;
      double sArea;
      double width;
      double length;
      double rArea;
      double radius;
      double cArea;
      double base;
      double height;
      double tArea;
      String shape;
      String again;
      
      again = ("yes");
      
      while (again.equalsIgnoreCase("yes"))
      {
      
         System.out.print("Please input the shape you are using: ");
         shape = input.next();
      
         if (shape.equalsIgnoreCase("Square"))
         {
            System.out.print("Please enter the side: ");
            side = input.nextDouble();
            sArea = squareArea(side);
            System.out.println("Square Side =  " + side);
            System.out.printf("%-15s%-5.2f","Square Area = " , sArea);
         }
         else if(shape.equalsIgnoreCase("Rectangle"))
         {
            System.out.print("Please enter the width and length: ");
            width = input.nextDouble();
            length = input.nextDouble();
            rArea = rectangleArea(width,length);
            System.out.println("Rectangle Width = " + width);
            System.out.println("Rectangle Length = " + length);
            System.out.printf("%-15s%-5.1f","Rectangle Area = " , rArea);
         }
         else if (shape.equalsIgnoreCase("Circle"))
         {
            System.out.print("Please enter the radius: ");
            radius = input.nextDouble();
            cArea = circleArea(radius);
            System.out.println("Circle Raidus =   " + radius);
            System.out.printf("%-15s%-5.3f","Circle Area =     " , cArea);
         }
         else
         {
            System.out.print("Please enter the base and height: ");
            base = input.nextDouble();
            height = input.nextDouble();
            tArea = triangleArea(base, height);
            System.out.println("Triangle Base = " + base);
            System.out.println("Triangle Height = " + height);
            System.out.printf("%-15s%-5.2f","Triangle Area = " , tArea);
         }
         System.out.print("\nWould you like to re-run? yes/no ");
         again = input.next();
      }
      
   }

   public static double squareArea(double num1)
   {
      double result;
      result = (num1 * num1);
      return result;
   
   }

   public static double rectangleArea(double num1, double num2)
   {
      double result2;
      result2 = (num1 * num2);
      return result2;
   
   }

   public static double circleArea(double num1)
   {
      double result3;
      result3 = Math.PI * (num1 * num1);
      return result3;
   }

   public static double triangleArea(double num1, double num2)
   {
      double result4;
      result4 = ((num1 * num2) / 2);
      return result4;
   
   }


}