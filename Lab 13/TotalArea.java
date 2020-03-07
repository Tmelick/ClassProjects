 /**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        13
Exercise:   1
ProgramName:TotalArea
Purpose:    To create methods for another class to use
Operation:  creates multiple methods for other classes to use
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the sorting / math
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/
public class TotalArea {
 /** Main method */
   public static void main(String[] args) {
   // Declare circleArray
      CircleWithPrivateDataFields[] circleArray;
   
   // Create circleArray
      circleArray = createCircleArray();
   
   // Print circleArray and total areas of the circles
      printCircleArray(circleArray);
      
      printCircleArrayMinMax(circleArray);
      
      
   }

 /** Create an array of Circle objects */
   public static CircleWithPrivateDataFields[] createCircleArray() {
      CircleWithPrivateDataFields[] circleArray =
         new CircleWithPrivateDataFields[5];
   
      for (int i = 0; i < circleArray.length; i++) {
         circleArray[i] =
            new CircleWithPrivateDataFields(Math.random() * 100);
      }
   
   // Return Circle array
      return circleArray;
   }

 /** Print an array of circles and their total area */
   public static void printCircleArray(
   CircleWithPrivateDataFields[] circleArray) {
      System.out.printf("%-30s%-15s\n", "Radius", "Area");
      for (int i = 0; i < circleArray.length; i++) {
         System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
            circleArray[i].getArea());
      }
   
      System.out.println("------------------------------------------");
   
   // Compute and display the result
      System.out.printf("%-30s%-15f\n", "The total area of circles is",
         sum(circleArray) );
   }

 /** Add circle areas */
   public static double sum(CircleWithPrivateDataFields[] circleArray) {
   // Initialize sum
      double sum = 0;
   
   // Add areas to sum
      for (int i = 0; i < circleArray.length; i++)
         sum += circleArray[i].getArea();
   
      return sum;
   }
   public static void printCircleArrayMinMax(CircleWithPrivateDataFields[] circleArray)
   {
      double max = circleArray[0].getRadius();
      double radius = 0;
      double min = circleArray[0].getRadius();
      for (int i = 0; i < circleArray.length; i++)
      {
         radius = circleArray[i].getRadius(); 
         if (radius > max ) 
            max = radius;
         else if (radius < min )
            min = radius;
      }
         
         
      System.out.printf("The smallest circle has radius %-5.2f", min);
      System.out.printf("\nThe largest circle has radiues %-5.2f", max); 
   }
}