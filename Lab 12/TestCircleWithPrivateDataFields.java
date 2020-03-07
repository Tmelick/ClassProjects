 /**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        12
Exercise:   4.2
ProgramName:TestCircleWithPrivateMembers
Purpose:    To use other clases to print out information
Operation:  creates objects and calls methods from other clases
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the sorting / math
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/
public class TestCircleWithPrivateDataFields {
 /** Main method */
   public static void main(String[] args) {
   // Create a circle with radius 5.0
      CircleWithPrivateDataFields myCircle =
         new CircleWithPrivateDataFields(5.0);
      System.out.println("The area of the circle of radius "
         + myCircle.getRadius() + " is " + myCircle.getArea());
   
   // Increase myCircle's radius by 10%
      myCircle.setRadius(myCircle.getRadius() * 1.1);
      System.out.println("The area of the circle of radius "
         + myCircle.getRadius() + " is " + myCircle.getArea());
   
      System.out.println("The number of objects created is "
         + CircleWithPrivateDataFields.getNumberOfObjects());
     
     // create new circle
      CircleWithPrivateDataFields yourCircle = new CircleWithPrivateDataFields(40);
      System.out.println("Before modifying the Radius");
      System.out.println("Radius = " + yourCircle.getRadius() + " Area = " + yourCircle.getArea());
      System.out.println("After modifying the Radius");
      yourCircle.setRadius(yourCircle.getRadius() * 1.5);
      System.out.println("Radius = " + yourCircle.getRadius() + " Area = " + yourCircle.getArea());
      System.out.println("The number of objects created is " 
         + CircleWithPrivateDataFields.getNumberOfObjects());
      
   }
}