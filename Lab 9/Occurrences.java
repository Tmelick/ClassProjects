/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        9
Exercise:   4
ProgramName:Occurrences
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   A string and a specific character from that string
Output(s):  The string and how many times that character is in it
Methodology:Declare variables, let computer print
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class Occurrences
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      String another = "yes";
      String message;
      char specific;
   
      while(another.equalsIgnoreCase("yes"))
      {
         System.out.print("\nEnter a string: ");
         message = input.nextLine();
         
         System.out.print("Enter a specfic chracter: ");
         specific = input.nextLine().charAt(0);
         
         System.out.print("The string \"" + message + "\" contains \"" +
              specific + "\" " + count (message, specific) + " times");
            
         System.out.print("\nEnter another string(yes/no: ");
         another = input.nextLine();
      }
   
   }
   
   public static int count(String str, char specific)
   {
      int max = 0;
      int i = 0;
      while(i < str.length())
      {
         if(str.charAt(i) == specific)
            max++;
         i++;
      }
      return max;
   
   
   }
}