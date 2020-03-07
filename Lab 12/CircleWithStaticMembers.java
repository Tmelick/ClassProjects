 /**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        12
Exercise:   3
ProgramName:CircleWithStaticMembers
Purpose:    To create methods for another class to use
Operation:  creates multiple methods for other classes to use
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the sorting / math
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/
 public class CircleWithStaticMembers {
 /** The radius of the circle */
 double radius;

 /** The number of objects created */
 static int numberOfObjects = 0;

 /** Construct a circle with radius 1 */
 CircleWithStaticMembers() {
 radius = 1;
 numberOfObjects++;
 }

 /** Construct a circle with a specified radius */
 CircleWithStaticMembers(double newRadius) {
 radius = newRadius;
 numberOfObjects++;
 }

 /** Return numberOfObjects */
 static int getNumberOfObjects() {
 return numberOfObjects;
 }

 /** Return the area of this circle */
 double getArea() {
 return radius * radius * Math.PI;
 }
 }