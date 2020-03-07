/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        6
Exercise:   2
ProgramName:Lab6Exercise2
Purpose:    To print out a upside down triangle
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   none
Output(s):  upside down triangle
Methodology:Declare variables, let the computer do the loop
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
public class Lab6Excerise2
{
   public static void main (String[] args)
   {
      final int MAX_ROWS = 1;
      int star;
      int row;
      int beta;
      
      
      {
         for (row = 10; row >= MAX_ROWS; row--)
         {
            for (star = 1; star <= row; star++)
               System.out.print ("*");
            System.out.println();
         }
      }
   }
}