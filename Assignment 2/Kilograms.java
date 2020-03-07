/**************************************************************************
Class:       CS 1301
Section:     05
Term:        Spring 2017
Name:        Tarrin Melick
Instructor:  Mr. Robert Thorsen
Assignment:  2
Program:     2
ProgramName: Kilograms
Purpose:     To convert pounds to kilograms
Operation:   When the program runs the user inputs the pounds
             and it converts it into kilograms
Input(s):    pounds
Output(s):   pounds converted to kilograms
Methodology: input the punds and have the computer do that math
References:  None
Time Spent:  5 mins
**************************************************************************/

import java.util.Scanner;
public class Kilograms
   {
public static void main(String[] args)
{
   Scanner input = new Scanner(System.in);
   
   double pound;
   double conversoionRate;
   double conversion;
   
   System.out.println(" Please Enter pounds here");
   pound = input.nextDouble();
   conversion = .454;
   conversoionRate = pound * conversion;
   System.out.println((pound) + " pounds is " + conversoionRate + " kilograms ");
   }
   }