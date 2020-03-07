/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 9
Program:    3
ProgramName:PhoneKeypad
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   A Phone number
Output(s):  The corresponding numbers equivalent to the letters
Methodology:Declare variables, let computer do the math
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class PhoneKeypad
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a phone number: ");
      displayNumber(input.next());
   }

   public static void displayNumber(String phoneNumber)
   {
      String number = phoneNumber.toUpperCase();
   
      for(int i = 0; i < number.length(); i++)
      {
         if (number.charAt(i) == '-')
            System.out.print('-');
         else if (Character.isDigit(number.charAt(i)))
            System.out.print(number.charAt(i)); 
         else if (Character.isLetter(number.charAt(i)))
            System.out.print(getNumber(number.charAt(i)));   
      }
   }
   public static int getNumber(char uppercaseLetter)
   {
      if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C')
         return 2;
      else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F')
         return 3;
      else if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I')
         return 4;
      else if (uppercaseLetter >= 'J' && uppercaseLetter <= 'L')
         return 5;
      else if (uppercaseLetter >= 'M' && uppercaseLetter <= 'O')
         return 6;
      else if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S')
         return 7;
      else if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V')
         return 8;
      else
         return 9;
   }
}