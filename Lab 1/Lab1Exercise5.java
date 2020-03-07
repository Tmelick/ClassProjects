/**************************************************************************
Class:         CS1301
Section:       05
Term:          Spring 2017
Name:          Tarrin Melick
Instructor:    Mr. Robert Thorsen
Lab:           1
Exercise:      5
ProgramName:   Lab1Exercise5
Purpose:       To print out information about the coder.
Operation:     When the program is run, it outputs the information codedin the program.
Input(s):      None
Output(s):     Name, birthday, hobbies, favorite book, and favorite movie.
Methodology:   Had one line sovling distance, one solving time, then the last two lines solving it 
References:    Differen't websites to figure out the math aspect. 
Time Spent:    1 hour or so cause I couldn't figure out the math. 
*******************************************************************************/

public class Lab1Exercise5 
{
   public static void main(String[] args)
   {
      System.out.println("Distance = 75 miles =" + (75 * 1.6) + " kilometers\n");
      System.out.println("Time = 50 minuetes" + " = " + ((((50.0 / 60.0))) + 
                           " hours.\n"));
      System.out.print("Average Speed In kilometers per hour = ");
      System.out.println((((75.0 / 50 ) * 60)* 1.6 ) + " kph.");
   }
}