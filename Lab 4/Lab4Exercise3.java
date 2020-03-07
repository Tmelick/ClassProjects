/**************************************************************************
Class:         CS 1301
Section:       05
Term:          Spring 2017
Name:          Tarrin Melick
Instructor:    Mr. Robert Thorsen
Lab:           4
Exercise:      3
ProgramName:   Lab4Exercise3
Purpose:       To have the computer flip a coin and tell if the user gets it right
Operation:     When the program is run, it outputs the information coded
               in the program.
Input(s):      1 or 2
Output(s):     The user's guess, and if it was right or wrong
Methodology:   Declare variables, flips the coin
References:    none
Time Spent:    20 mins
*******************************************************************************/
import java.util.Scanner;
public class Lab4Exercise3
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
   
      int heads;
      int tails;
      int guess;
      int random;
      String answer = "";
   
      System.out.println(" Please enter 0 for heads or 1 for tails ");
      guess = input.nextInt();
   
      random = (int)(Math.random() * 2);
      {
         if ( guess == random ) 
            System.out.println(" Correct! ");
         else 
            System.out.println(" Incorrect!");
      }
      {
        
            System.out.println(" Answer was " + (random == 0 ? "heads" : "tails"));
         
      }
   }
}