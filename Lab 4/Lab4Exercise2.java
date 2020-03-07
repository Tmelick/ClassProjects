/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        4
Exercise:   2
ProgramName:Lab4Exercise2
Purpose:    To figure out what day it will be
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   current day, and future day
Output(s):  The current day and what day it will be
Methodology:Declare variables, let the computer do the math
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class Lab4Exercise2
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
   
      int today;
      int daysElapsed;
      int futureDay;
      String day = "";
      String future = "";
   
   
      System.out.println("Please enter the day  Sunday = 0, Monday = 1...");
      today = input.nextInt();
   
      switch (today) {
         case 0:  
            day = "Sunday"; 
            break;
         case 1:  
            day = "Monday"; 
            break;
         case 2:  
            day = "Tuesday"; 
            break;
         case 3:  
            day = "Wednesday"; 
            break;
         case 4:  
            day = "Thursday"; 
            break;
         case 5:  
            day = "Friday"; 
            break;
         case 6:  
            day ="Saturday"; 
      }
   
      System.out.println("Please enter days elapsed: ");
      daysElapsed = today + input.nextInt();
   
      futureDay = (( daysElapsed % 7));
   
      switch (futureDay) {
         case 0:  
            future = "Sunday"; 
            break;
         case 1:  
            future = "Monday"; 
            break;
         case 2:  
            future = "Tuesday"; 
            break;
         case 3:  
            future = "Wednesday"; 
            break;
         case 4:  
            future = "Thursday"; 
            break;
         case 5:  
            future = "Friday"; 
            break;
         case 6:  
            future = "Saturday"; 
      }
   
   
      System.out.println("Today is " + day + " and the future day is " + future);
   
   }

}


