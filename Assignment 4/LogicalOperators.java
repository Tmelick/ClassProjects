/**************************************************************************
Class:       CS 1301
Section:     05
Term:        Spring 2017
Name:        Tarrin Melick
Instructor:  Mr. Robert Thorsen
Assignment:  4
Program:     3
ProgramName: LogicalOperators
Purpose:     To show the user how logical operators work
Operation:   When the program is run, it prompts the user for an integer
             and then tells you if its divisible by 5 and 6, 5 or 6
             5 but not 6
Input(s):    an integer
Output(s):   if its divisible by 5 and 6, 5 or 6
             5 but not 6
Methodology: Declare each variable then have the computer do the math
References:  None
Time Spent:  20 mins
**************************************************************************/
import java.util.Scanner;
public class LogicalOperators
{
public static void main(String[] args)
{
int integer;


Scanner input = new Scanner(System.in);

System.out.println("Enter an integer: ");
integer = input.nextInt();

{
if ((integer % 5 == 0) && (integer % 6 == 0))
System.out.println(" Is " + integer + " divisible by 5 and 6? true");
else
System.out.println(" Is " + integer + " divisible by 5 and 6? false");
}
{
if ((integer % 5 == 0) || (integer % 6 == 0))
System.out.println(" Is " + integer + " divisible by 5 or 6? true");
else
System.out.println(" Is " + integer + " divisible by 5 or 6? false");
}
{
if ((integer % 5 == 0 ) ^ (integer % 6 == 0))
System.out.println(" Is " + integer + " divisible by 5 or 6, but not both? true");
else
System.out.println(" Is " + integer + " divisible by 5 or 6, but not both? false");
}
}
}
