/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        5
Exercise:   3
ProgramName:Lab5Exercise3
Purpose:    To 
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   A potential answer to the qeustion
Output(s):  The answer and if it is correct or not
Methodology:Declare variables, get the correct answer
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class Lab5Exercise3
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
   
      int asciiCode;
      char asciiChar;
   
      System.out.print(" Enter an ASCII code ");
      asciiCode = input.nextInt();
      asciiChar = (char) asciiCode;
   
      System.out.print("The character for ASCII code " + asciiCode + 
         " is " + asciiChar);
   }
}
