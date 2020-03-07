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
public class LabExercise5
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
   
      String s1;
      String s2;
   
      System.out.print("Enter string S1 ");
      s1 = input.nextLine();
   
      System.out.print("Enter the second string ");
      s2 = input.nextLine();
   
      if (s1.contains(s2))
         System.out.print(s2 + " is a substring of " + s1);
      else
         System.out.print(s2 + " is not a substring of " + s1);
   
   }
}