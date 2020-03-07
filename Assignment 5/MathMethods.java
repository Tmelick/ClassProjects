/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 5
Program:    4
ProgramName:MathMethods
Purpose:    To practice using Math methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   Negative number, an angle, two floating point numbers, and a 
            positive integer
Output(s):  absolute value, cosine, sin, tangent,x^y, square root and
            negative square root
Methodology:Declare variables, get the correct answer
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class MathMethods
{
public static void main(String[] args)
{

Scanner input = new Scanner(System.in);

int negInt;
double angle;
double floorCeiling;
double x;
double y;
int square;
int negSquare;


System.out.print("Please enter a negative number: ");
negInt = input.nextInt();

System.out.print("Please enter an angle:");
angle = input.nextDouble();
                
System.out.print("Please enter two flaoting point numbers:");
x = input.nextDouble();
y = input.nextDouble();

System.out.print("Please enter a positive integer:");
square = input.nextInt();
negSquare = -(square);



System.out.println("\nThe absolute value:\t" + Math.abs(negInt));
System.out.println("cosine = \t\t" + Math.cos(angle));
System.out.println("sin = \t\t\t" + Math.sin(angle));
System.out.println("tangent = \t\t" + Math.tan(angle));
System.out.println("x^y = \t\t\t" + Math.pow(x, y));
System.out.println("The square root is: \t" + Math.sqrt(square));
System.out.println("The negative root is:\t" + Math.sqrt(negSquare));
}
}