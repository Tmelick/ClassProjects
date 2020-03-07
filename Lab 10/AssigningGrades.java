/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        10
Exercise:   1
ProgramName:AssigningGrades
Purpose:    To practice arrays
Operation:  When the program is run, it outputs the information coded
            in the program.y
Input(s):   number of students and their grades
Output(s):  list of their respective grades corresponding to the higest in the
            class
Methodology:Declare variables, let computer do the math
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class AssigningGrades
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      
      int largest = 0;
      int i;
      int students;
      int max = 0; 
       String again;
       again = ("yes");
      
      while (again.equalsIgnoreCase("yes"))
      {

      i= 0;
      
      
      System.out.print("Please enter number of students: ");
      students = input.nextInt();
      int[] myList = new int [students];
      
      
      System.out.print("Please enter " + myList.length + " grades: ");
      for (int x = 0; x < myList.length; x++)
         myList[x] = input.nextInt();
     
      
      for (int y = 0; y < myList.length; y++)
      {
         if (myList[y] > largest)
         {
            largest = myList[y];
            
         }
      }
         
      for (int t = 0; t <myList.length; t++)
      {
         if (myList[t] >= largest - 10)
            System.out.println("Student " + t + " score is " + myList[t]  + " and grade is A");
         else if (myList[t] >= largest - 20)
            System.out.println("Student " + t + " score is " + myList[t]  + " and grade is B");
         else if (myList[t] >= largest - 30)
            System.out.println("Student " + t + " score is " + myList[t]  + " and grade is C");
         else if (myList[t] >= largest - 40)
            System.out.println("Student " + t + " score is " + myList[t]  + " and grade is D");
         else 
            System.out.println("Student " + t + " score is " + myList[t]   + " and grade is F");
      }ye
      
      largest = 0;
     
      System.out.print("Re-Run? yes/no? ");
      again = input.next();
      
      
   }
     
   }
}
   
   




