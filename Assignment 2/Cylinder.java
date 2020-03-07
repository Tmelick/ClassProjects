/**************************************************************************
Class:       CS 1301
Section:     05
Term:        Spring 2017
Name:        Tarrin Melick
Instructor:  Mr. Robert Thorsen
Assignment:  2
Program:     1
ProgramName: Cylinder
Purpose:     To print out the cross sectional area and volume
Operation:   When the program is run, it prompts the user for the 
             radius and length then prints out the corss sectional
             area and volume
Input(s):    radius and length
Output(s):   Cross sectional area and volume of a cylinder
Methodology: Declared the methods and let the computer do the math for me
References:  None
Time Spent:  5 mins
**************************************************************************/

import java.util.Scanner;
public class Cylinder
{
   public static void main(String[] args)
   {   
      Scanner input = new Scanner(System.in);
      double radius;
      double area;
      double length;
      double volume;
      double pi;
      
      System.out.println(" Enter the Radius please");
      radius = input.nextDouble();
      System.out.println(" Enter the Length here please");
      length = input.nextDouble();
      pi = 3.14159;
      area = radius * radius * pi;
      volume = area * length;
      
      
      
      System.out.println(" The coss-sectional area is " + area);
      System.out.println(" The volume is " + volume);
   }
}