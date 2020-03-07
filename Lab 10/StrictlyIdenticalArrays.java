/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        10
Exercise:   4
ProgramName:StrictlyIdenticalArrays
Purpose:    To practice arrays
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   2 lists of numbers with the first being the size
Output(s):  If they are identical or not
Methodology:Declare variables, let computer do the sorting
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Scanner;
public class StrictlyIdenticalArrays
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
         System.out.print("Two lists are strictly identical");
      else
         System.out.print("Two lists are not strictly identical");
         
         System.out.print("\nRe-Run? yes/no? ");
      again = input.next();
      
      
   }
   }
   public static boolean equals(int[] list1, int[] list2)
   {
   
      boolean  result = true;
   
      if(list1 == list2)
         result = true;
      else
         result = false;
      
      return result;
   
   
   }
}