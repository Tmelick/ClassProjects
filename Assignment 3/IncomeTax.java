/**************************************************************************
Class:       CS 1301
Section:     05
Term:        Spring 2017
Name:        Tarrin Melick
Instructor:  Mr. Robert Thorsen
Assignment:  3
Program:     2
ProgramName: IncomeTax
Purpose:     To print out the user's tax bracket
Operation:   When the program is run, it prompts the user for their 
             annual income, and then prints out their bracket
Input(s):    Annual income
Output(s):   Annual income and thir tax bracket
Methodology: Declared the methods and let the computer do the math for me
References:  None
Time Spent:  10 mins
**************************************************************************/
import java.util.Scanner;
public class IncomeTax
{
public static void main(String[] args)
{

Scanner input = new Scanner(System.in);

int income;

System.out.print("please enter your annual income:");
income = input.nextInt();

/*final int LOWEST_BRACKET_THREASHOLD = 50000;
final int LOWEST_BRACKET_RATE = 5;
int outputRate;*/

if (income <= 50000)
   System.out.println("$" + income  + " = Annual Income" +  "\ntax bracket: 5%");
else if (income <= 100000)
   System.out.println("$" + income + " = Annual Income" +  "\ntax bracket: 15%");
else if (income <= 150000)
   System.out.println("$" + income + " = Annual Income" +  "\ntax bracket: 20%");
else if (income <= 250000)
   System.out.println("$" + income + " = Annual Income" +  "\ntax bracket: 30%");
else if (income <= 500000)
   System.out.println( income + " = Annual Income" +  "\n tax bracket: 35%");
else if (income > 500000)
   System.out.print("$" + income + " = Annual Income" +  "\n tax Bracket: 50%");
   
   
   }
   }