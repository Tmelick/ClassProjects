/**************************************************************************
Class:         CS1301
Section:       05
Term:          Spring 2017
Name:          Tarrin Melick
Instructor:    Mr. Robert Thorsen
Lab:           2
Exercise:      6
ProgramName:   Lab2Exercise6
Purpose:       To print out the average acceleration
Operation:     When the program is run, it outputs the information codedin the program.
Input(s):      random numbers for the variables
Output(s):     Average acceleration
Methodology:   used the same methods from previous exercises
References:    none
Time Spent:    10 minutes
*******************************************************************************/
import java.util.Scanner;
public class Lab2Exercise6
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double v1;
      double v0;
      double time;
      double acceleration;
         
      System.out.println(" Enter ending velocity" );
      v1 = input.nextDouble();
         
      System.out.println(" Enter starting velocity");
      v0 = input.nextDouble();
         
      System.out.println(" Enter time span " );
      time = input.nextDouble();
         
      acceleration = (( v1 - v0) / time );
         
      System.out.println(("The average acceleration = ") + acceleration );
   }
}