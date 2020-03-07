/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        4
Exercise:   4
ProgramName:Lab4Exercise4
Purpose:    to judge what the windchill is and if the values inputed are correct
            or not
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   temperature and wind speed
Output(s):  The windchill and if the inputs were invalid
Methodology:Declare variables, let computer do the math
References: none
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Scanner;
public class Lab4Exercise4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      double temp; // ta
      double windSpeed;// v
      double speedExp; // v^.16
      double windChillTemp;
   
   
      System.out.print(" Enter the temperature in Fahrenheit between -58F and 41F: ");
      temp = input.nextDouble();
      System.out.print(" Enter the wind speed (>=2) in miles per hour: ");
      windSpeed = input.nextDouble();
   
      speedExp = Math.pow(windSpeed, .16);
      windChillTemp = (35.74 + (.6215 * (temp)) - (35.75 * (speedExp)) + 
         (.4275 * ((temp) * (speedExp))));
   
      {
         if (temp >= -58 && temp <= 41  && windSpeed >= 2)
            System.out.println("The wind chill index is " + windChillTemp);
         else if(temp < -58 && windSpeed < 2)
            System.out.println("Both temerature and wind speed are invalid.");
         else if(temp > 41 && windSpeed < 2)
            System.out.println("Both temerature and wind speed are invalid.");
         else if  ( windSpeed < 2)
            System.out.println("Invalid wind speed.");
         else if (temp < -58 || temp > 41)
            System.out.println("Invalid temperature.");
      }
   }
}

