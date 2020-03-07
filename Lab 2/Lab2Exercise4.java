/**************************************************************************
Class:         CS1301
Section:       05
Term:          Spring 2017
Name:          Tarrin Melick
Instructor:    Mr. Robert Thorsen
Lab:           2
Exercise:      4
ProgramName:   Lab2Exercise4
Purpose:       to display area and perimeter of a square
Operation:     When the program is run, it outputs the information codedin the program.
Input(s):      length of one side of the square
Output(s):     area and permiter of a square with user inputed varibles
Methodology:   declared the varibles, then input code that allows user 
               input for said varibles.
References:    none
Time Spent:    10 minutes
*******************************************************************************/
import java.util.Scanner;
public class Lab2Exercise4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int side;
      int area;
      int perimeter;
      
      
      System.out.print(" Enter Int value ");
      side = input.nextInt();
      System.out.println(" Side of Square = " + side );
      area = ( side * side );
      perimeter = ( side + side + side + side );
      System.out.println(" Area = " + area );
      System.out.print(" Perimeter = " + perimeter );
      
   }
}