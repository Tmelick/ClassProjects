 /**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        14
Exercise:   2
ProgramName:Time
Purpose:    To create methods for another class to use
Operation:  creates multiple methods for other classes to use
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the sorting / math
References: internet/ you
Time Spent: 35mins
*******************************************************************************/
public class Time
{
   long hour;
   long minute;
   long second;

   public Time()
   {
      long millisecond = System.currentTimeMillis();
   
      second = (millisecond / 1000) % 60;
      minute = (millisecond / (1000 * 60)) % 60;
      hour = (millisecond / (1000 * 60 * 60)) % 24;
   }
   public Time(long millisecond)
   {
      second = (millisecond / 1000) % 60;
      minute = (millisecond / (1000 * 60)) % 60;
      hour = (millisecond / (1000 * 60 * 60)) % 24;
   }
   public Time(long second, long minute, long hour)
   {
      this.second = second;
      this.minute = minute;
      this.hour = hour;
   }
   public void setTime(long elapseTime)
   {
      second = (elapseTime / 1000) % 60;
      minute = (elapseTime / (1000 * 60)) % 60;
      hour = (elapseTime / (1000 * 60 * 60)) % 24;
   }
   
   public long getSecond()
   {
      return second;
   }
   public long getMinute()
   {
      return minute;
   }
   public long getHour()
   {
      return hour;
   }
   
}