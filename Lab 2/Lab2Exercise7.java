/**************************************************************************
Class:         CS1301
Section:       05
Term:          Spring 2017
Name:          Tarrin Melick
Instructor:    Mr. Robert Thorsen
Lab:           2
Exercise:      7
ProgramName:   Lab2Exercise7
Purpose:       To print out the min runway length
Operation:     When the program is run, it outputs the information codedin the program.
Input(s):      take off speed and acceleration
Output(s):     min runway length
Methodology:   same as previous exercises
References:    none
Time Spent:    10 mins
*******************************************************************************/
import java.util.Scanner;
public class Lab2Exercise7
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double velocity;
      double acceleration;
      double length;
         
      System.out.println(" Enter take off speed ");
      velocity = input.nextDouble();
      System.out.println(" Enter acceleration ");
      acceleration = input.nextDouble();
      length = ((velocity * velocity) / ( 2 * acceleration));
         
      System.out.println((" Minimum runway length = ") + ( length));
         
   }
}