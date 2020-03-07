/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 9
Program:    2
ProgramName:CheckPassword
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   Potential password
Output(s):  If the password is valid or not
Methodology:Declare variables, let computer do the checking
References: none
Time Spent: 20 minutes
*******************************************************************************/
import java.util.Scanner;
public class CheckPassword
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String another;
      another = "yes";
      
      while(another.equalsIgnoreCase("yes"))
      {
      
         System.out.println("A password must have at least eight characters."
                      + "\nA password consits of only letters and digits."
                      + "\nA password must contain at least two digits. ");
         System.out.print("Check password: ");
      
         if (checkPassword(input.next()))
            System.out.print("Valid Password");
         else 
            System.out.print("Invalid Password");
            
            
         System.out.print("\nEnter another string(yes/no: ");
         another = input.next();   
         
         
      }
     
   
   }

   public static boolean checkPassword(String password)
   {
      if( checkLength(password))
         if(onlyLettersDigits(password))
            if(atLeast2Digits(password))
               return true;
            else 
               return false;
         else 
            return false;
      else 
         return false;
   }

   public static boolean atLeast2Digits(String password)
   {
      int digitCounter = 0;
   
      for (int i = 0; i < password.length(); i++)
         if (Character.isDigit(password.charAt(i)))
            digitCounter++;
      
      if (digitCounter >= 2)
         return true;
         
      return false;
   }

   public static boolean onlyLettersDigits(String password)
   {
      for (int i = 0; i < password.length(); i++)
         if (!(Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i))))
            return false;
            
      return true;
      
   
   }

   public static boolean checkLength(String password)
   {
   
      if(password.length() <= 7)
         return false;
         
      return true;
   }
}
