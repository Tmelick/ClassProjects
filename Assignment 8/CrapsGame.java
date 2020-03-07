/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 8
Program:    4
ProgramName:CrapsGame
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   none
Output(s):  The dice rolls, if you won or lost
Methodology:Declare variables, let computer do the math
References: none
Time Spent: 20 minutes
*******************************************************************************/
public class CrapsGame
{
   public static void main(String[] args)
   {
      int dice = 0;
      int roll = rollDie(dice);
      int roll2 = rollDie(dice);
      int sum = roll + roll2;
      int sum2 = 0;
      
      
      
      
      
                      
      if (sum == 2 || sum == 3 || sum == 12)
      {
         System.out.print("You rolled " + roll + 
                       " + " + roll2 + " = "
                       + sum);
         System.out.println("\nYou lose");
      }
      else if (sum == 7 || sum == 11)
      {
         System.out.print("You rolled " + roll + 
                       " + " + roll2 + " = "
                       + sum);
         System.out.println("\nYou win");
      }
      else
      {
         System.out.print("You rolled " + roll + 
                       " + " + roll2 + " = "
                       + sum);
          
         System.out.println("\npoint is " + sum);
         do
         {
            roll = rollDie(dice);
            roll2 = rollDie(dice);
            sum2 = roll + roll2;
            
            System.out.println("You rolled " + roll + 
                       " + " + roll2 + " = "
                       + sum2);
            
            if (sum2 == 7)
            {
               System.out.print("You lose");
               break;
            }
            else if (sum2 == sum)
            {
               System.out.print("You win");
               break;
            }
            
             
         }while(sum2 != sum || sum2 != 7);
          
         
            
                 
         
            
            
          
            
      }
        
   }               
   
   
   
   
   
   public static int rollDie(int dice)
   {
      int result;
      
      
      result = (int)(Math.random() * 7);
      
      
      return result;
      
   
   }

}