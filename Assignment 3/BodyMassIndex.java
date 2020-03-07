/**************************************************************************
Class:       CS 1301
Section:     05
Term:        Spring 2017
Name:        Tarrin Melick
Instructor:  Mr. Robert Thorsen
Assignment:  3
Program:     4
ProgramName: BodyMassIndex
Purpose:     To print out the user's BMI
Operation:   When the program is run, it prompts the user for their weight
               and height.then prints our their BMI
Input(s):    Weight, and Height
Output(s):   BMI
Methodology: Declare each variable then have the computer do the math
References:  None
Time Spent:  10 mins
**************************************************************************/
import java.util.Scanner;
public class BodyMassIndex
{
public static void main(String[] args )
{
Scanner input = new Scanner(System.in);

double weight;
double feet;
double inches;
double totalInches;


double bMI;


System.out.print(" Please enter weight in pounds: ");
weight = input.nextInt();
System.out.print(" Please enter feet: ");
feet = input.nextInt();
System.out.print(" Please enter inches: ");
inches = input.nextInt();

totalInches = (( feet * 12 ) + inches);

bMI = ((weight * 703) / (totalInches * totalInches));

System.out.print(" BMI is " + bMI);

if ( bMI < 18.5 )
   System.out.print(" \n Underweight ");
else if (bMI <= 24.9)
   System.out.print(" \n Normal weight ");
else if (bMI <= 29.9)
   System.out.print(" \n Overweight ");
else if (bMI >= 30.0)
   System.out.print(" \n Obese ");

}
}
