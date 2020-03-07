/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 11
Program:    2
ProgramName:AddMatricies
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   two seperate arrays
Output(s):  The sum of the two arrays
Methodology:Declare variables, let computer do the math
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Scanner;
public class AddMatricies
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String again = ("yes");
      while (again.equalsIgnoreCase("yes"))
      {
         int row = 3;
         int column = 3;
      
         double[][] first = new double[row][column];
         double[][] second = new double[row][column];
         double[][] answer = new double[row][column];
      
      // Fill
         System.out.print("Enter  matrix1: ");
      
      
         for(int i = 0; i < first.length; i++)
         {
            for(int j = 0; j < first.length; j++)
            {
               first[i][j] = input.nextDouble();
            }
         }
      
         System.out.print("Enter matrix2: ");
      
         for(int i = 0; i < second.length; i++)
         {
            for(int j = 0; j < second.length; j++)
            {
               second[i][j] = input.nextDouble();
            }
         }
      
      // Calling
         if(first.length == second.length)
            answer = addMatrix(first, second);
         else
            System.out.print("Invalid");
      
         System.out.print("The matricies are added as follows \n");
      
      //Display
         for(int i = 0; i < first.length; i++)
         {
            for(int j = 0; j < first[i].length; j++)
            {
               System.out.printf("[%.2f] " , first[i][j]);
            }
            if ((first.length -1 ) / 2 == i)
            
               System.out.printf("%-3s", "+");
            else
               System.out.printf("%-3s", "");
         
         
            for(int j = 0; j < second[i].length; j++)
            {
               System.out.printf("[%.2f] " , second[i][j]);
            }
            if ((first.length -1 ) / 2 == i)
               System.out.printf("%-3s", "=");
            else
               System.out.printf("%-3s", "");
          
               
            for(int j = 0; j < answer[i].length; j++)
            {
               System.out.printf("[%.2f] " , answer[i][j]);
            }
         
            System.out.println();
         }
         System.out.print("\nRe-Run? yes/no? ");
         again = input.next();
      }
   }
   
// method adds the matrix together. 
   public static double[][] addMatrix(double[][] a, double[][] b)
   {
      double[][] temp = new double[a.length][a.length];
   
      for(int i = 0; i < a.length; i++)
      {
         for(int j = 0; j < a[i].length; j++)
         {
            temp[i][j] = a[i][j] + b[i][j];
         }
      }
   
   
      return temp;
   }
}