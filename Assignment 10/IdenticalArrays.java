/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 10
Program:    4
ProgramName:IdenticalArrays
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   two lists using first number as size
Output(s):  if the lists are identical or not 
Methodology:Declare variables, let computer do the sorting
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;
public class IdenticalArrays
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
       String again = ("yes");
       
      
      while (again.equalsIgnoreCase("yes"))
      {
      
      System.out.print("Enter the Fisrt list: ");
      int[] list1 = new int[input.nextInt()];
      for (int i = 0; i < list1.length; i++)
         list1[i] = input.nextInt();
      
   
      System.out.print("Enter the Second list: ");
      int[] list2 = new int[input.nextInt()];
      for (int i = 0; i < list2.length; i++)
         list2[i] = input.nextInt();
         
         
      if(equals(list1, list2) == true)
         System.out.print("Two lists are identical");
      else
         System.out.print("Two lists are not identical");
         
      System.out.print("\nRe-Run? yes/no? ");
      again = input.next();
      
      
   }
      
   }
   public static boolean equals(int[] list1, int[] list2)
   {
      for (int i = 0; i < list1.length - 1; i++)
      {
         int currentMin = list1[i];
         int currentMinIndex = i;
      
         for (int j = i + 1; j < list1.length; j++)
         {
            if (currentMin > list1[j])
            {
               currentMin = list1[j];
               currentMinIndex = j;
            }
         }
       
         if(currentMinIndex != i)
         {
            list1[currentMinIndex] = list1[i];
            list1[i] = (int)currentMin;
         }
      }
        
      for (int i = 0; i < list2.length - 1; i++)
      {
         int currentMin = list2[i];
         int currentMinIndex = i;
      
         for (int j = i + 1; j < list2.length; j++)
         {
            if (currentMin > list2[j])
            {
               currentMin = list2[j];
               currentMinIndex = j;
            }
         }
       
         if(currentMinIndex != i)
         {
            list2[currentMinIndex] = list2[i];
            list2[i] = currentMin;
         }
      }
      
      
      boolean  result = true;
   
      if(Arrays.equals(list1, list2))
         result = true;
      else
         result = false;
      
      return result;
   
   
   }
}
/*
for (int i = 0; < i list.length - 1; i++)
{
   double currentMin = list[i];
   int currentMinIndex = i;
   
   for (int j = i + 1; j < list.length; j++)
   {
      if (currentMin > list[j])
      {
         currentMin = list[j];
         currentMinIndex = j;
       }
       }
       
       if(currentMinIndex != i)
       {
         list[currentMinIndex] = list[i];
         list[i] = currentMin;
       }
      }
     }
*/
