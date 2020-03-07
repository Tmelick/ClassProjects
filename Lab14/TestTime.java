/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        14
Exercise:   2
ProgramName:TestTime
Purpose:    Create objects to test methods from another class
Operation:  Test methods from Time and create new objects to test methods
            again
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the sorting / math
References: internet/you
Time Spent: 25mins
*******************************************************************************/
public class TestTime
{
   public static void main(String[] args)
   {
      Time T1 = new Time();
      System.out.print("No Args \n");
      System.out.print("Time now is " + T1.getHour() + ":" + 
                     T1.getMinute() + ":" + T1.getSecond());
      System.out.println("\n");
      
      Time T2 = new Time(555550000);
      System.out.print("One arg ");
      System.out.print("\nTime now is " + T2.getHour() + ":" + 
                     T2.getMinute() + ":" + T2.getSecond());
      System.out.println("\n");
      
      Time T3 = new Time(42, 35, 6);
      System.out.print("3 args passed");
      System.out.print("\nTime now is " + T3.getHour() + ":" + 
                     T3.getMinute() + ":" + T3.getSecond());
      T3.setTime(10000000);
      System.out.print("\nAfter set time");
      System.out.print("\nTime now is " + T3.getHour() + ":" + 
                     T3.getMinute() + ":" + T3.getSecond());
   }
}