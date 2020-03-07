/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        7
Exercise:   2
ProgramName:Lab7Exercise2
Purpose:    To print out a string one word at a time
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   A string of words
Output(s):  The string divided into words
Methodology:Declare variables, let computer do the math
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class Lab7Exercise2
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
   
      int index;
      String string;
      int wordCount;
      String word;
      int stringLength;
      char character;
      String another = "y";
      
      while (another.equalsIgnoreCase("y"))
      
      {
      
         System.out.print("Please enter a sentence of your choice: ");
         string = input.nextLine(); 
         string = string.trim();
         stringLength = string.length();
      
         index = 0;
         word = "";
         wordCount = 0;
      
      
      
         while (index < stringLength)
         {
            word = "";
         
            while (index < stringLength && string.charAt(index) != ' ' )
            
            {
            
               word += string.charAt(index);
               index++;
            }
            System.out.println("Word #" + wordCount + ":  " + word);
            wordCount++;
         
            while(index < stringLength && string.charAt(index) == ' ')
            {
               index++;
            }
         }
         System.out.print("test another (y/n)? ");
         another = input.nextLine();
      }
   
   }
   
}
