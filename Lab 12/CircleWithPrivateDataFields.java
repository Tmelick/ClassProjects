 /**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        12
Exercise:   4
ProgramName:CircleWithPrivateMembers
Purpose:    To create methods for another class to use
Operation:  creates multiple methods for other classes to use
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the sorting / math
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/
public class CircleWithPrivateDataFields {
 /** The radius of the circle */
   private double radius = 1;

 /** The number of objects created */
   private static int numberOfObjects = 0;

 /** Construct a circle with radius 1 */
   public CircleWithPrivateDataFields() {
      numberOfObjects++;
   }

 /** Construct a circle with a specified radius */
   public CircleWithPrivateDataFields(double newRadius) {
      radius = newRadius;
      numberOfObjects++;
   }     

 /** Return radius */
   public double getRadius() {
      return radius;
   }

 /** Set a new radius */
   public void setRadius(double newRadius) {
      radius = (newRadius >= 0) ? newRadius : 0;
   }

 /** Return numberOfObjects */
   public static int getNumberOfObjects() {
      return numberOfObjects;
   }

 /** Return the area of this circle */
   public double getArea() {
      return radius * radius * Math.PI;
   }
}