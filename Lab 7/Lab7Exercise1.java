/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        7
Exercise:   1
ProgramName:Lab7Exercise1
Purpose:    To print out the sum of even numbers bettwen 2 and 
            user inputed number
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   Number between 20 and 60
Output(s):  The sum of all the even integers
Methodology:Declare variables, let computer do the math
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class Lab7Exercise1
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
   
      int number;
      int two;
      int sum;
   
      int again = 1;
      
      while (again == 1)
      {
      
      
         {
         
         
            System.out.print("Please enter a number between 20 and 60: ");
            number = input.nextInt();
            two = 2;
            sum = 0;
         
            while (two <= number){
               if (two % 2 == 0){
                  sum+= two;     
               }
               two++;
            
            }
         
            System.out.println("Entered value:\t\t\t\t " + number);
            System.out.println("Sum of even numbers between 2 and " + number + " is: " + sum);
         
         }
         System.out.print("Test another 1 for yes? ");
         again = input.nextInt();
      }
   
   }
}