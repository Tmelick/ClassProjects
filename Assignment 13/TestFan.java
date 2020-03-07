/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 13
Program:    1
ProgramName:TestFan
Purpose:    To create an object that that calls each method from the other class
Operation:  Create the object then call each method in the other class
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the math/ sorting
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
public class TestFan
{
   public static void main(String[] args)
   {
   
      Fan maxFan = new Fan();
   
      maxFan.setSpeed(maxFan.FAST);
      maxFan.setRadius(10);
      maxFan.setColor("yellow");
      maxFan.setOn(true);
      System.out.print(maxFan.toString());
      System.out.println("\n");
   
      Fan medFan = new Fan();
   
      medFan.setSpeed(medFan.MEDIUM);
      medFan.setRadius(5);
      medFan.setColor("blue");
      medFan.setOn(false);
      System.out.print(medFan.toString());
   
   
   }
}