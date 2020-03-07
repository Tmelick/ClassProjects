/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 5
Program:    2
ProgramName:StringMethods
Purpose:    to practice using string
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   string 1 and string 2
Output(s):  Length of both strings, concatenate of string1 and string2 
            if the two strings are equal, string1 upper case, string 2 lower
            case, and if string1 is a valid substring.
Methodology:Declare variables, get the correct answer
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class StringMethods
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner (System.in);
   
      String string1;
      String string2;
   
      System.out.print("Please enter your favorite word:");
      string1 = input.next();
      System.out.print("Please enter your first Name:");
      string2 = input.next();
      
      System.out.println(string1.length());// Length of string 1
      System.out.println(string2.length());// Length of string 2
      System.out.println(string1.concat(string2));// Concatenate string 1 and string 2
      System.out.println(string1.equals(string2));// Check if the two strings are equal
      System.out.println(string1.toUpperCase());// convert string1 to upper case.
      System.out.println(string2.toLowerCase());// convert string2 to lower case.
      if(string1.length() > 1)
      System.out.println(string1.substring(0,5));//Extract a valid sub-string
      else
      System.out.println("String1 doesn't have enough characters");
      
   
   
   }
}



