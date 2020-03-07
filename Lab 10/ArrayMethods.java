/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        10
Exercise:   5
ProgramName:ArrayMethods
Purpose:    To practice arrays
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   none
Output(s):  The original array, it's max, min, reverse, and reverse squared
Methodology:Declare variables, let computer do the sorting / math
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/
public class ArrayMethods
{
   public static void main(String[] args)
   {
      int[] myList = new int[5];
   
   
      for(int i = 0; i < myList.length; i++)
         myList[i] = (int)(1 + (Math.random() * 1000));
   
      for(int i = 0; i < myList.length; i++)
         System.out.print(myList[i] + " ");
   
      System.out.print("\n" + arrayMax(myList));
      System.out.print("\n" + arrayMin(myList) + "\n");
      arrayReverse(myList);
      for(int i = 0; i <myList.length; i++)
      System.out.print(myList[i] + " ");
      System.out.println();
      arraySquared(myList);
      for(int i = 0; i <myList.length; i++)
      System.out.print(myList[i] + " ");
      
   
   }
   public static int arrayMax(int[] maxArray)
   {
      int max = maxArray[0];
   
      for(int i = 0; i < maxArray.length; i++)
      {
         if(maxArray[i] > max)
            max = maxArray[i];
      }
   
      return max;
   }
   public static int arrayMin(int[] minArray)
   {
      int min = minArray[0];
   
      for(int i = 0; i < minArray.length; i++)
      {
         if(minArray[i] < min)
            min = minArray[i];
      }
   
      return min;
   }

   public static void arrayReverse(int[] myList)
   {
      int temp;
   
      for(int i = 0; i < myList.length / 2; i++)
      {
         temp = myList[i];
         myList[i] = myList[myList.length - i -1];
          myList[myList.length - i -1] = temp;
      }
   }
   public static void arraySquared(int[] myList)
   {
      for(int i = 0; i < myList.length; i++)
         myList[i] = (int)Math.pow(myList[i], 2);
   }
}


