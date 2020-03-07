/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        6
Exercise:   1
ProgramName:Lab6Exercise1
Purpose:    To print out the the sum of all integers between 1 and 100
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   none
Output(s):  The sum of all the integers
Methodology:Declare variables, let computer do the math
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
public class Lab6Excerise1
{
public static void main(String[] args)
{

int sum;
int i;

sum = 0;
i = 0;

while (i <= 100){
sum = sum + i;
i++;
}
System.out.println("sum is " + sum);
}
}