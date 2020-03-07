/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        8
Exercise:   3
ProgramName:PalindromeInteger
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   a number
Output(s):  If a number is a palindrome or not
Methodology:Declare variables, let computer do the math
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class PalindromeInteger
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
   
      int number;
      String again;
      
      again = "yes";
   
      while (again.equalsIgnoreCase("yes"))
      {
         {
            System.out.print("\nCheck if a number is a palindrome: ");
            number = input.nextInt();
         
            if(isPalindrome(number))
               System.out.print(number + " is a palindrome");
            
            else
               System.out.print(number + " is not a palindrome");
         }
         
         System.out.print("\nTest another palindrome (yes/no)?: ");
         again = input.next();
         
      }
      
      
      
   
   }

   public static int reverse(int number)
   {
      int result = 0;
   
      while(number != 0)
      { 
         result *= 10;
         result = result + (number % 10);
         number /= 10;
      }
    
      return result;
   
   }
   public static boolean isPalindrome(int number)
   {
   
      return (number == reverse(number));
   }
   
}