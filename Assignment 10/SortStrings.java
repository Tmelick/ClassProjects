/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 10
Program:    3
ProgramName:SortStrings
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   size of class and names of students
Output(s):  The list before sorting and after sorting
Methodology:Declare variables, let computer do the sorting
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Scanner;
public class SortStrings
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String again = ("yes");
       
      
      while (again.equalsIgnoreCase("yes"))
      {
   
      System.out.print("Please enter size of class: ");
      int size = input.nextInt();
   
      String[] myList = new String[size];
      System.out.print("Please enter names of your students: ");
      for( int i = 0; i < myList.length; i++)
         myList[i] = input.next();
         
      System.out.print("List Before Sorting: \n");   
      for( int i = 0; i < myList.length; i++)
         System.out.print( myList[i] + " \n");
         
      sortString(myList);
      System.out.print("List after sorting: \n");
      for( int i = 0; i < myList.length; i++)
         System.out.print(myList[i] + " \n");
         
        System.out.print("\nRe-Run? yes/no? ");
      again = input.next();
      
      
   }
     
   
   } 
   public static void sortString(String[] list)
   {
       for (int i = 0; i < list.length - 1; i++)
      {
         String currentMin = list[i];
         int currentMinIndex = i;
      
         for (int j = i + 1; j < list.length; j++)
         {
            if (currentMin.compareToIgnoreCase(list[j]) > 0)
            {
               currentMin = list[j];
               currentMinIndex = j;
            }
         }
       
         if(currentMinIndex != i)
         {
            list[currentMinIndex] = list[i];
            list[i] = 
            currentMin;
         }
      }
}
}
//