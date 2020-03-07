/**************************************************************************
Class:       CS 1301
Section:     05
Term:        Spring 2017
Name:        Tarrin Melick
Instructor:  Mr. Robert Thorsen
Assignment:  3
Program:     5
ProgramName: PalindromeNumber
Purpose:     To print out if a nubmer is a palindrome
Operation:   When the program is run, it prompts the user for a number
             then outputs if its a palindrome or not
Input(s):    Three digit number
Output(s):   Palindrome or not
Methodology: Declares the number. User inputs it, Then comapres the first
             number with the last, If they are the same its a palindrome
             or not 
References:  None
Time Spent:  10mins
**************************************************************************/
import java.util.Scanner;
public class PalindromeNumber
{
public static void main(String[] args)
{

Scanner input = new Scanner(System.in);

int number;

System.out.println(" Please enter a Three-digit integer: ");
number = input.nextInt();


if (number %10 == number/100)
   System.out.println(number + " is a plaindrom");
else if (number %10 != number/100)
   System.out.println(number + " is not a palindrome");
   }
   }