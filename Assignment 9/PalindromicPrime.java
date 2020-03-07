/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 9
Program:    4
ProgramName:PalindromicPrime
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   none
Output(s):  List of palindromicPrime numbers 10 in a row
Methodology:Declare variables, let computer do the printing
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class PalindromicPrime
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      int index;
      int number;
   
      index = 0;
      number = 2;
   
      while (index != 100)
      {
      
         if (isPalindrome(number) && isPrime(number))
         {
            index++;
            if(index % 10 == 0)
            {
               System.out.printf("%-6d \n", number);
            }
            else
               System.out.printf("%-6d", number);
         
            
         }
         number ++;
      }
   }
   public static boolean isPrime(int number)
   {
      boolean result;
      result = false;
      
      for(int i = 2; i<= number / 2; i++)
         if(number % i == 0)
            return false;
      return true;
        
      
      
   }
   public static boolean isPalindrome(int number)
   {
      int palindrome;
      int original;
      boolean result;
      result = true;
   
      palindrome = 0;
      original = number;
   
      while(number > 0)
      {
         palindrome *= 10;
         palindrome += number % 10;
         number /= 10;
      }
      if(palindrome == original)
         result = true;
      else 
         result = false;
       
       
      return result;
      
   }

  
}