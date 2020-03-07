/**************************************************************************
Class:       CS 1301
Section:     05
Term:        Spring 2017
Name:        Tarrin Melick
Instructor:  Mr. Robert Thorsen
Assignment:  4
Program:     1
ProgramName: ISBN
Purpose:     To print out the ISBN-10
Operation:   When the program is run, it prompts the user for 9 numbers
Input(s):    9 numbers
Output(s):   ISBN number
Methodology: Declare each variable then have the computer do the math
References:  None
Time Spent:  10 mins
**************************************************************************/
import java.util.Scanner;
public class ISBN
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);

int first;
int second;
int third;
int fourth;
int fifth;
int sixth;
int seventh;
int eigth;
int ninth;
int tenth;

System.out.println(" Enter 9 numbers with spaces inbetween: Ex 1 2 3 ");
first = input.nextInt();
second = input.nextInt();
third = input.nextInt();
fourth = input.nextInt();
fifth = input.nextInt();
sixth = input.nextInt();
seventh = input.nextInt();
eigth = input.nextInt();
ninth = input.nextInt();

tenth = (first * 1 + second * 2 + third * 3 + fourth * 4 + fifth * 5 + sixth * 6
         + seventh * 7 + eigth * 8 + ninth * 9) % 11;

System.out.print(("The ISBN-10 number is ") + (first) + (second) + (third) + (fourth) + (fifth) + (sixth)
                   + (seventh) + (eigth) + (ninth) + (tenth));

}
}