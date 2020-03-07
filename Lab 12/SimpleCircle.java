/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        12
Exercise:   1
ProgramName:SimpleCircle
Purpose:    To practice creating objects and calling methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   none
Output(s):  The area of each circle
Methodology:Declare variables, let computer do the sorting / math
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/
public class SimpleCircle {
 /** Main method */
   public static void main(String[] args) {
   // Create a circle with radius 1
      SimpleCircle circle1 = new SimpleCircle();
      System.out.println("The area of the circle of radius "
         + circle1.radius + " is " + circle1.getArea());
   
   // Create a circle with radius 25
      SimpleCircle circle2 = new SimpleCircle(25);
      System.out.println("The area of the circle of radius "
         + circle2.radius + " is " + circle2.getArea());
   
   // Create a circle with radius 125
      SimpleCircle circle3 = new SimpleCircle(125);
      System.out.println("The area of the circle of radius "
         + circle3.radius + " is " + circle3.getArea());
   
   // Create a cricle with  radius 500
      SimpleCircle circle4 = new SimpleCircle(500);
      System.out.println("The area of the circle of radius " 
         + circle4.radius + " is " + circle4.getArea());
    
   // Create a circle with radius 2
      SimpleCircle circle5 = new SimpleCircle(2);
      System.out.println("The area of the circle of radius " 
         + circle5.radius + " is " + circle5.getArea());
   
   // Modify circle radius
      circle2.radius = 100;
      System.out.println("The area of the circle of radius "
         + circle2.radius + " is " + circle2.getArea());
   }

   double radius;

 /** Construct a circle with radius 1 */
   SimpleCircle() {
      radius = 1;
   }

 /** Construct a circle with a specified radius */
   SimpleCircle(double newRadius) {
      radius = newRadius;
   }

 /** Return the area of this circle */
   double getArea() {
      return radius * radius * Math.PI;
   }
   
/** Return the perimeter of this circle */
   double getPerimeter() {
      return 2 * radius * Math.PI;
   }

 /** Set a new radius for this circle */
   void setRadius(double newRadius) {
      radius = newRadius;
   }
}