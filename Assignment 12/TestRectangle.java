/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 12
Program:    1.2
ProgramName:TestRectangle
Purpose:    To print out information using methods from Rectangle
Operation:  Creates objects and uses methods from the Rectangle class
            to modify these objects
Input(s):   none
Output(s):  Multiple information for each rectangle object
Methodology:Declare variables, let computer do the math/ sorting
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
public class TestRectangle
{
public static void main(String[] args)
{
Rectangle r1 = new Rectangle();

Rectangle r2 = new Rectangle(4, 40);

Rectangle r3 = new Rectangle(3.5, 35.9);

System.out.println("\n\nRectangle 1\n");
System.out.print("Width " + r1.width
                  + "\nHeight " + r1.height
                  + "\nArea " + r1.getArea()
                  + "\nPerimeter " + r1.getPerimeter());

System.out.println("\n\nRectangle 2\n");

System.out.print("Width " + r2.width
                  + "\nHeight " + r2.height
                  + "\nArea " + r2.getArea()
                  + "\nPerimeter " + r2.getPerimeter());
                  
System.out.println("\n\nRectangle 3");

System.out.print("Width " + r3.width
                  + "\nHeight " + r3.height
                  + "\nArea " + r3.getArea()
                  + "\nPerimeter " + r3.getPerimeter());

}
}
