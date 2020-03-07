/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 5
Program:    3
ProgramName:RandomNumbers
Purpose:    to show how to set up constraints on a random number
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   none
Output(s):  4 random numbers with in the specified constraints
Methodology:Declare variables and constraints. Computer does the work
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Random;
public class RandomNumbers
{
   public static void main(String[] args)
   {
   
      int random1;
      int random2;
      int random3;
      double random4;
      int min1;
      int max1;
      int min2;
      int max2;
      int min3;
      int max3;
      double min4;
      double max4;
   
      Random generator = new Random();
   
      min1 = 30;
      max1 = 50;
      random1 = generator.nextInt(max1 - min1) + min1;
      System.out.println("Random integer between 30 and 50 " + random1);// part a
   
      min2 = -20;
      max2 = 20;
      random2 = generator.nextInt(max2 - min2) + min2;
      System.out.println("Random integer between -20 and 20 " + random2);// part b
   
      min3 = -60;
      max3 = -20;
      random3 = generator.nextInt(max3 - min3) + min3;
      System.out.println("Radnom integer between -20 and -60 " + random3);// part c
   
      min4 = 0.0;
      max4 = 16.0;
      random4 = (double)generator.nextDouble() *
           Math.nextUp((max4 - min4) + 1);
      System.out.println("random floating-point number between 0.0 and 16.0 " + random4);// part d           
   
   
   
   
   
   }
}