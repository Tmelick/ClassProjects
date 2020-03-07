/**************************************************************************
Class:       CS 1301
Section:     05
Term:        Spring 2017
Name:        Tarrin Melick
Instructor:  Mr. Robert Thorsen
Assignment:  4
Program:     2
ProgramName: DayOfTheWeek
Purpose:     To print out the day of the week
Operation:   When the program is run, it prompts the user for the year
             the month, and the day. Then prints out the name of the
             day
Input(s):    Year, month, and day
Output(s):   The name of the day
Methodology: Declare each variable then have the computer do the math
References:  None
Time Spent:  20 mins
**************************************************************************/
import java.util.Scanner;
public class DayOfTheWeek
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int century;
      int year;
      int month;
      int day;
      int yearCentury;
      int dayWeek;
      int january;
      int february;
      
      System.out.print("Please enter the year ");
      year = input.nextInt();
      System.out.print("Please enter the month ");
      month = input.nextInt();
      System.out.print("Please enter the day ");
      day = input.nextInt();
      
      switch(month) {
      case 1: month = 13;
      break;
      case 2: month = 14;
      break;
      }
      
      
      
      if (month == 13 || month == 14){
      century = year/100;
      yearCentury = year % 100;
      dayWeek = (day + ((26 *(month + 1)) / 10) + yearCentury + (yearCentury /4)
      + ((century - 1) / 4) + (5 * century)) % 7;}
      else {
      century = year/100;
      yearCentury = year % 100;
      dayWeek = (day + ((26 *(month + 1)) / 10) + yearCentury + (yearCentury /4)
      + (century  / 4) + (5 * century)) % 7;
      }
      
   
      
      if(dayWeek == 0)
         System.out.print("The day of the week is Saturday");
      if(dayWeek == 1)
         System.out.print("The day of the week is Sunday");
      if(dayWeek == 2)
         System.out.print("The day of the week is Monday");
      if(dayWeek == 3)
         System.out.print("The day of the week is Tuesday");
      if(dayWeek == 4)
         System.out.print("The day of the week is Wednesday");
      if(dayWeek == 5)
         System.out.print("The day of the week is Thursday");
      if(dayWeek == 6)
         System.out.print("The day of the week is Friday");
      }
      }
      