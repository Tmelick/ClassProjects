 /**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        12
Exercise:   3.2
ProgramName:TestCircleWithStaticMembers
Purpose:    To use other clases to print out information
Operation:  creates objects and calls methods from other clases
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the sorting / math
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/
public class TestCircleWithStaticMembers {
 /** Main method */
 public static void main(String[] args) {
 System.out.println("Before creating objects");
 System.out.println("The number of Circle objects is " +
 CircleWithStaticMembers.numberOfObjects);

 // Create c1
 CircleWithStaticMembers c1 = new CircleWithStaticMembers();

 // Display c1 BEFORE c2 is created
 System.out.println("\nAfter creating c1");
 System.out.println("c1: radius (" + c1.radius +
 ") and number of Circle objects (" +
 c1.numberOfObjects + ")");

 // Create c2
 CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);

// Create c3
 CircleWithStaticMembers c3 = new CircleWithStaticMembers();
 
// Create c4
 CircleWithStaticMembers c4 = new CircleWithStaticMembers();                 

 // Modify c1
 c1.radius = 9;
 
 // Modify c3
 c3.radius = 20;
 
 // Modify c4
c4.radius = 100;

 // Display c1 and c2 AFTER c2 was created
 System.out.println("\nAfter creating c2 c3 c4 and modifying c1");
 System.out.println("c1: radius (" + c1.radius +
 ") and number of Circle objects (" +
 c1.numberOfObjects + ")");
 System.out.println("c2: radius (" + c2.radius +
 ") and number of Circle objects (" +
 c2.numberOfObjects + ")");
 
 System.out.println("c3: radius (" + c3.radius +
 ") and the area is " + c3.getArea());
 
 System.out.println("c4: radius (" + c4.radius + 
 ") and the area is " + c4.getArea());
 }
 }