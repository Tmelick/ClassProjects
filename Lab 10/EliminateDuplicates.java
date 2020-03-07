/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        10
Exercise:   3
ProgramName:EliminateDuplicates
Purpose:    To practice arrays
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   10 integers
Output(s):  The distinct numbers of the 10 integers
Methodology:Declare variables, let computer do the sorting
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;
public class EliminateDuplicates
{
   static int size = 10; // change this number to change the size of the array
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      // This part takes input for the array
      int[] myList = new int[size];
      int[] distinct = new int[size];
      String again = ("yes");
       
      
      while (again.equalsIgnoreCase("yes"))
      {
      
      System.out.print("Enter 10 numbers: ");
      for (int i = 0; i < myList.length; i++)
         myList[i] = input.nextInt();
     
      distinct = eliminateDuplicates(myList); // calls the eliminateDuplicates
                   // method and sets the original array as the returned one
      
      System.out.print("The distinct numbers are: ");
       // creates the begining outside of the loop
      
      for (int i = 0; i < distinct.length; i++)
         System.out.print(distinct[i] + " ");
          // Prints out the list returned from eliminate duplicates
      
     
    System.out.print("\nRe-Run? yes/no? ");
      again = input.next();
      
      
   }
   }
   public static int[] eliminateDuplicates(int[] list)
   {
      boolean[] checkArray = new boolean[size];
      Arrays.fill(checkArray, Boolean.TRUE); // sets the vales to true or false
      
      for (int i = 0; i < size - 1; i++)
      {
         if(checkArray[i] == false)
            continue;               
 // checks the array for false value if the number is false it goes to 
 //the next number in the index
         for (int j = i + 1; j < size; j++)
            if(list[i] == list[j])  
               checkArray[j] = false;
      }     // if a number equals the specific indexed number changes value to false
      int[] tempArray = new int[getCount(checkArray)]; 
      // creates new array changing the size to the total number of true value
         
      int counter = 0;
      int trueCounter = 0;
         
      while(counter != tempArray.length)
      {
         if(checkArray[trueCounter] == true)
         {
         // sorts through the index of temp to find true value, 
         //Then compares to original and takes the original number only if true
            tempArray[counter] = list[trueCounter]; 
            counter++;
            trueCounter++;
         }
         else
            trueCounter++;
      } 
      return tempArray; 
      // returns new array of only true numbers from original array  
   }
   public static int getCount(boolean[] checkArray)   
   // this method returns the total true count for the size of the temp array
   { 
      int trueCounter = 0;
      
      for(int i = 0; i < size; i++)
         if (checkArray[i] == true) 
            trueCounter++;d  
      return trueCounter;
   
   }
}