/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        6
Exercise:   4
ProgramName:Lab6Exercise4
Purpose:    To print the string, Each number, and in descending order
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   none
Output(s):  all the requested information
Methodology:Declare variables, let computer do the sorting
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class Lab6Exercise4
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);




String a;
int length;


System.out.print("Please enter a string:");
a = input.nextLine();
for (int i = 0, n = length = a.length(), number = 1; i < length; i++, number++)
    System.out.println("Character #" + number + "\t" + a.charAt(i));
    


}

}

