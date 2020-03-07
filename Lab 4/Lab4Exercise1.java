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
public class Lab4Exercise1
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
   
      int first;
      int second;
      int third;
      int inputAnswer;
      int correctAnswer;
   
   
      first = (int)(System.currentTimeMillis()% 10);
   
      second = (int)(System.currentTimeMillis() / 7 % 10 );
   
      third = (int)(System.currentTimeMillis() / 11 % 10);
   
   
      System.out.println("What is the sum of "
         + first + " + "  + second + " + "  + third );
   
      correctAnswer = (first + second + third);
   
      System.out.println("Please enter your answer:");
      inputAnswer = input.nextInt();
      {
         if (inputAnswer == correctAnswer) 
            System.out.print("Correct "); 
         else 
            System.out.print("Incorrect ");
      }
   
   }
}
