/**************************************************************************
Class: CS 1301
Section: 05
Term: Spring 2017
Name: Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab: 3
Exercise: 2
ProgramName: Lab3Exercise2
Purpose: To display the letter grade for an assignment
Operation: When the program is run, it outputs the information coded
 in the program.
Input(s): none
Output(s): The grade and the letter associated with it
Methodology: Declare variables, if else statements till the correct grade is 
             reached
References: none
Time Spent: 10 minutes
*******************************************************************************/
import java.util.Scanner;

public class Lab3Exercise2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
       
      double grade;
      double letter;
     
     
      grade = (int)(Math.random() *101);
         System.out.println("The grade is " + grade);
         if ( grade >= 90.0)
         System.out.println(grade + " is an A");
         else if (grade >= 80.0)
         System.out.println(grade + " is an B");
         else if (grade >= 70.0)
         System.out.println(grade + " is an C");
         else if (grade >= 60.0)
         System.out.println(grade + " is an D");
         else
         System.out.println(grade + " is an F");
      
         
      
   }
}