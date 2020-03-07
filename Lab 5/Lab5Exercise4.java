/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        4
Exercise:   1
ProgramName:Lab4Exercise1
Purpose:    to generate a random porblem and have the user input their answer
            and it tells them weither or not they are right
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   A potential answer to the qeustion
Output(s):  The answer and if it is correct or not
Methodology:Declare variables, get the correct answer
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class Lab5Exercise4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      System.out.print(" Enter a letter ");
      char letter = input.next().charAt(0);
   
      if (letter == 'a' || letter == 'b' || letter == 'c' ||
            letter == 'A' || letter == 'B' || letter == 'C')
      {
         System.out.print(letter + "is the number 2");
      }
      else if (letter == 'd' || letter == 'e' || letter == 'f' ||
            letter == 'D' || letter == 'E' || letter == 'F')
      {
         System.out.print(letter + "is the number 3");
      }
      else if (letter == 'g' || letter == 'h' || letter == 'i' ||
            letter == 'G' || letter == 'H' || letter == 'I')
      {
         System.out.print(letter + "is the number 4");
      }
      else if (letter == 'j' || letter == 'k' || letter == 'l' ||
            letter == 'J' || letter == 'K' || letter == 'L')
      {
         System.out.print(letter + "is the number 5");
      }
      else if (letter == 'm' || letter == 'n' || letter == 'o' ||
            letter == 'M' || letter == 'N' || letter == 'O')
      {
         System.out.print(letter + "is the number 6");
      }
      else if (letter == 'p' || letter == 'q' || letter == 'r' || letter == 's' ||
            letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S')
      {
         System.out.print(letter + "is the number 7");
      }
      else if (letter == 't' || letter == 'u' || letter == 'v' ||
            letter == 'T' || letter == 'U' || letter == 'V')
      {
         System.out.print(letter + "is the number 8");
      }
      else if (letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z' ||
            letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z')
      {
         System.out.print(letter + "is the number 7");
      }
      else
      {
         System.out.print(letter + " is an invalid input ");
      }
   }
}