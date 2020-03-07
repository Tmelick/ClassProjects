/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 11
Program:    4
ProgramName:IdenticalArrays
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   two 3 by 3 arrays
Output(s):  if the lists are identical or not 
Methodology:Declare variables, let computer do the sorting
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Scanner;
public class IdenticalArrays
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
       String again = ("yes");
      while (again.equalsIgnoreCase("yes"))
      {
      int[][] first = new int[3][3];
      int[][] second = new int[3][3];
   
   //Fill
      System.out.print("Enter  matrix1: ");
      for(int i = 0; i < first.length; i++)
      {
         for(int j = 0; j < first.length; j++)
         {
            first[i][j] = input.nextInt();
         }
      }
      
      System.out.print("Enter matrix2: ");
      
      for(int i = 0; i < second.length; i++)
      {
         for(int j = 0; j < second.length; j++)
         {
            second[i][j] = input.nextInt();
         }
      }
      if(equals(first, second) == true)
         System.out.print("Both matrix are strictly identical");
      else
         System.out.print("Both matrix are not strictly identical");
         
         System.out.print("\nRe-Run? yes/no? ");
         again = input.next();
      }
   }
   public static boolean equals(int[][] m1, int[][] m2)
   {
      if(m1.length * m1[0].length != m2.length * m2[0].length)
         return false;
      
      for(int i = 0; i < m1.length; i++)
      {
         for(int j = 0; j <m1.length; j++)
         {
            if(m1[i][j] != m2[i][j])
               return false;
         }
      }
      return true;
   
   }
}