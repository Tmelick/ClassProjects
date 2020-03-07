/**************************************************************************
Class: CS 1301
Section: 05
Term: Spring 2017
Name: Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab: 3
Exercise: 1
ProgramName: Lab3Exercise1
Purpose: To find the average, max, and min of a students grades
Operation: When the program is run, it outputs the information coded
 in the program.
Input(s): 4 different grades
Output(s): The highest grade, Lowest grade, and average
Methodology: Declare variables, sort to find max and min
References: none
Time Spent: 10 minutes
*******************************************************************************/
import java.util.Scanner;
public class Lab3Exercise1
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int grade1;
      int grade2;
      int grade3;
      int grade4;
      float average;
      int max;
      int min;
     
      System.out.println(" please enter grade 1");
      grade1 = input.nextInt();
      System.out.println(" please enter grade 2");
      grade2 = input.nextInt();
      System.out.println(" please enter grade 3");
      grade3 = input.nextInt();
      System.out.println(" please enter grade 4"); 
      grade4 = input.nextInt();
      
     
     max = grade1;
     min = grade1;
     
     System.out.println(("The first grade is ") + grade1);
     System.out.println(("The second grade is ") + grade2);
     System.out.println(("The third grade is ")  + grade3);
     System.out.println(("The fourth grade is ") + grade4);
     
     if (grade2 > max)
         max = grade2;
     if (grade3 > max)
         max = grade3;
     if (grade4 > max)
         max = grade4;
       System.out.println(" the highest grade is " + max);
       
     if (grade2 < min)
         min = grade2;
     if (grade3 < min)
         min = grade3;
     if (grade4 < min)
         min = grade4;
        System.out.println(" The lowest grade is " + min);
       
      average = ((float)(grade1 + grade2 + grade3 + grade4)/ 4);   
         System.out.println(" The average grade is " + average);
         
      
       
   }
}
            
