/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 13
Program:    1
ProgramName:Fan
Purpose:    To create methods for another class to utalize
Operation:  Creating multiple methods for which another class
            can call
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the math/ sorting
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
class Fan
{
   final int SLOW = 1;
   final int MEDIUM = 2;
   final int FAST = 3;
   private int speed = SLOW;
   private boolean on = false;
   private double radius = 5;
   String color = "blue";
   
   public Fan()
   {
      getSpeed();
      isOn();
      getRadius();
      getColor();
   }
   
   public String toString()
   {
      if(isOn())
         return("Speed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius());
      else
         return("Color: " + getColor() + "\nRadius: " + getRadius() + "\nFan is off.");
              
   }
   public int getSpeed()
   {
      return speed;
   }
   public void setSpeed(int speed)
   {
      this.speed = speed;
   }
   public boolean isOn()
   {
      return on;
   }
   public void setOn(boolean on)
   {
      this.on = on;
   }
   public double getRadius()
   {
      return radius;
   }
   public void setRadius(double radius)
   {
      this.radius = radius;
   }
   public String getColor()
   {
      return color;
   }
   public void setColor(String color)
   {
      this.color = color;
   } 
}