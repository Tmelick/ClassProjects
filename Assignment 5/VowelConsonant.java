/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 5
Program:    5
ProgramName:VowelConsonant
Purpose:    to check if a letter is a vowel or consonant
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   A letter
Output(s):  If its a consonant vowel or invalid
Methodology:Declare variables, get the correct answer
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class VowelConsonant
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
   
      char letter;
   
      System.out.print("Enter a letter grade: ");
      letter = input.next().charAt(0);
   
   
   
      {
         if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' ||
         letter == 'o' || letter == 'O' ||letter == 'u' || letter == 'U')
            System.out.print(letter + " is a vowel ");
         else if(letter == 'b' || letter == 'B' || 
         letter == 'C' || letter == 'c' || letter == 'd' || letter == 'D' ||
         letter == 'f' || letter == 'F' || letter == 'g' || letter == 'G' || 
         letter == 'h' || letter == 'H' || letter == 'j' || letter == 'J' || 
         letter == 'k' || letter == 'K' || letter == 'l' || letter == 'L' || 
         letter == 'm' || letter == 'M' || letter == 'n' || letter == 'N' || 
         letter == 'P' || letter == 'p' || letter == 'Q' || letter == 'q' ||
         letter == 'r' || letter == 'R' || letter == 's' || letter == 'S' ||
         letter == 't' || letter == 'T' || letter == 'v' || letter == 'V' || 
         letter == 'w' || letter == 'W' || letter == 'x' || letter == 'X' ||
         letter == 'y' || letter == 'Y' || letter == 'z' || letter == 'Z')
            System.out.print(letter + " is a consonant");
      
         else
            System.out.print(letter + " is an invalid input");
      } 
   
   
   }
}
   
   

