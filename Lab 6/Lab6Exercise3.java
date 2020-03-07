/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        6
Exercise:   3
ProgramName:Lab6Exercise3
Purpose:    To print all even numbers and all odd numbers on seperate lines
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   none
Output(s):  All even numbers and all odd numbers on two sperate lines
Methodology:Declare variables, let computer do the sorting
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
public class Lab6Exercise3
{
public static void main(String[] args)
{
int number;
int even;
int odd;

number = 50;

{
while (number <= 100)  {
if (number == 50)
   System.out.print("Even numbers between 50 and 100: \t");
if (number == 100)
   System.out.print(number);
if (number % 2 == 0 && number != 100)
   System.out.print(number + ","); 
   number++;
}


number = 50;
while (number <= 100) {
if (number == 51)
   System.out.print("Odd numbers between 50 and 100:  \t");
if (number <= 50)
   System.out.println("");
if (number == 99)
   System.out.print(number);
if (number % 2 != 0 && number != 99)
   System.out.print(number + ",");
   number++;

}
}
}
}

