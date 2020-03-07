/**************************************************************************
Class:         CS1301
Section:       05
Term:          Spring 2017
Name:          Tarrin Melick
Instructor:    Mr. Robert Thorsen
Lab:           2
Exercise:      1
ProgramName:   Lab2Exercise1
Purpose:       to print out the average of 3 numbers
Operation:     When the program is run, it outputs the information coded in the program.
Input(s):      Differen't numbers for x,y,z
Output(s):     Average of x,y,z
Methodology:   import scanner and then input code that allows programer to
               input varibables for x,y,z
References:    none
Time Spent:    10 minutes
*******************************************************************************/
import java.util.Scanner; 

public class Lab2Exercise1
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
      int x;
      int y;
      int z;
      double average;
      
      System.out.print(" Enter Integer for X : ");
      x = input.nextInt() ;
      System.out.print(" Enter Integer for Y : ");
      y = input.nextInt() ;
      System.out.print(" Enter Integer for Z : ");
      z = input.nextInt();
      average = ( (double)(x + y + z) / 3.0 );
      System.out.println ((" Average of X Y Z = ") + ( average ));
   }
}