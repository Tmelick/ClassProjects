/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 9
Program:    1
ProgramName:FeetMeters
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   none
Output(s):  Feet to meters and meters to feet table
Methodology:Declare variables, let computer do the printing
References: none
Time Spent: 20 minutes
*******************************************************************************/

public class FeetMeters
{
   public static void main(String[] args)
   {
      
      double feet;
      double meter;
   
      
      feet = 1;
     
      meter = 20.0;
     
      System.out.println("Feet\t\tMeters\t\t|\t\tMeters\tFeet");
      System.out.println("---------------------------------------------");
      for ( feet = 1; feet < 11; feet++ )
      {
      
      System.out.print((feet) + " \t\t" + (footToMeter(feet) + "\t\t\t|\t\t" + 
                        meter + "\t\t" + (meterToFoot(meter)) + "\n"));
      meter += 5.0;
      }
   }
   
   
   public static double footToMeter(double foot)
   {
      return(.305 * foot);
   
   }
 
 
   public static double meterToFoot(double meter)
   {
      return(3.279 * meter);
   
   }
}