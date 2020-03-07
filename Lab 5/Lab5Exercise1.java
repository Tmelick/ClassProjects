/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        5
Exercise:   1
ProgramName:Lab5Exercise1
Purpose:    To find the area of the pentagon
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   The length from the center to a vertex
Output(s):  The area of the pentagon with only 2 decimal
Methodology:Declare variables, get the correct answer
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class Lab5Exercise1
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      double s;
      double r;
      double area;
   
   
      System.out.println(" Enter the length from the center to a vertex ");
      r = input.nextDouble();
      s = 2 * r * Math.sin((Math.PI / 5));
      area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
   
      System.out.printf("The area of the pentagon is %.2f", area);
   
   
   }
}
