/**************************************************************************
Class:         CS1301
Section:       05
Term:          Spring 2017
Name:          Tarrin Melick
Instructor:    Mr. Robert Thorsen
Lab:           2
Exercise:      8
ProgramName:   Lab2Exercise8
Purpose:       To print out information a table
Operation:     When the program is run, it outputs the information codedin the program.
Input(s):      None
Output(s):     the specified table
Methodology:   had to individually create each line
References:    none
Time Spent:    20 minutes because had to get creative cause i wasn't 
                  sure how to make a table
*******************************************************************************/
import java.util.Scanner;
public class Lab2Exercise8
{
   public static void main(String[] args)
   {
      float a = 1;
      float b = 2;
      System.out.println((int) a + "\t" + (int) b + "\t" + (int) Math.pow(a, b));
      System.out.println((int) ++a + "\t" + (int) ++b + "\t" + (int) Math.pow(a, b));
      System.out.println((int) ++a + "\t" + (int) ++b + "\t" + (int) Math.pow(a, b));
      System.out.println((int) ++a + "\t" + (int) ++b + "\t" + (int) Math.pow(a, b));
      System.out.println((int) ++a + "\t" + (int) ++b + "\t" + (int) Math.pow(a, b));
   }
}