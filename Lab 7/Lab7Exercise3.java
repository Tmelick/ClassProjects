/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        7
Exercise:   3
ProgramName:Lab7Exercise3
Purpose:    To print out a pyramid
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   none
Output(s):  A pyramid
Methodology:Declare variables, let computer do the sorting
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
public class Lab7Exercise3
{
public static void main(String[] args)
{
final int MAX_ROWS = 16;
for (int row = 1; row <= MAX_ROWS; row += 2)
{
for (int space = 1; space <= 8 - (row / 2); space++)
      System.out.print(" ");
for (int star = 0; star < row; star++)
   System.out.print("*");
   
   System.out.print("\n");
}
}
}


