/**************************************************************************
Class:         CS1301
Section:       05
Term:          Spring 2017
Name:          Tarrin Melick
Instructor:    Mr. Robert Thorsen
Lab:           2
Exercise:      2
ProgramName:   Lab2Exercise2
Purpose:       To print out the sum, difference, and product of two varribles
Operation:     When the program is run, it outputs the information codedin the program.
Input(s):      two numbers for R and T
Output(s):     Sum, difference, and product for the variables inputed
Methodology:   declared the varibles, then input code that allows user 
               input for said varibles.
References:    none
Time Spent:    10 minutes
*******************************************************************************/
import java.util.Scanner;
 
public class Lab2Exercise2
{
   public static void main(String[] args)
   { 
      Scanner input = new Scanner(System.in);
      float floatR;
      float floatT;
      float sum;
      float difference;
      float product;
      
      System.out.println(" Enter integer for R " );
      floatR = input.nextFloat() ; 
      System.out.println(" Enter Integer for T " );
      floatT = input.nextFloat() ;
      System.out.println((" R = ") + floatR );
      System.out.println((" T = ") + floatT );
      sum = (floatR + floatT) ;
      System.out.println((" Sum of R + T = ") +  sum );
      difference = (floatR - floatT) ;
      System.out.println((" Difference of R + T = ") +  difference);
      product = ( floatR * floatT ) ;
      System.out.println((" Product of R + T = ") +  product); 
   }
}