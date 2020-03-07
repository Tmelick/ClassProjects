/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        5
Exercise:   2
ProgramName:Lab5Exercise2
Purpose:    to find the area of a hexagon
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   The side of the hexagon
Output(s):  The area of the hexagon with two decimals
Methodology:Declare variables, get the correct answer
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class Lab5Exercise2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      double side;
      double area;
   
      System.out.print("Enter the side of the hexagon ");
      side = input.nextDouble();
      area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
   
      System.out.printf("The area of the hexagon is %.2f", area);
   
   }
}