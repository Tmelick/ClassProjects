/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 14
Program:    2
ProgramName:TestMyPoint
Purpose:    To test each method within the MyPoint class
Operation:  Create two objects specified in instructions. Then call each
            method from MyPoint to test if they work as intended or not
Input(s):   none
Output(s):  An example of what each method from MyPoint returns when called
            with specific parameters
Methodology:Declare variables, let computer do the math/ sorting
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
public class TestMyPoint
{
   public static void main(String[] args)
   {
      MyPoint pointObjectOne = new MyPoint();
     // System.out.println("No args passed: " + pointObjectOne);
      MyPoint pointObjectTwo = new MyPoint(10, 30.5);
      //System.out.println("45 and 25 passed : " + pointObjectTwo);
      System.out.println("String method: " + pointObjectTwo.toString() + "\n");
      System.out.println("No args points: " + pointObjectOne.getX()+ " " + pointObjectOne.getY());   
      System.out.println("Two args passed: " + pointObjectTwo.getX()+ " " + pointObjectTwo.getY());   
      System.out.println("The distance is: " + pointObjectTwo.distance(1.3, 10.5));
            
   }
}