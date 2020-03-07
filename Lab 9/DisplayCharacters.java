/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        9
Exercise:   3
ProgramName:DisplayCharacters
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   none
Output(s):  list of characters from 1 to Z
Methodology:Declare variables, let computer print
References: Internet
Time Spent: 20 minutes
*******************************************************************************/
public class DisplayCharacters
{
   public static void main(String[] args)
   {
   
      char ch1 = '1';
      char ch2 = 'Z';
      int numberPerLine = 10;
      printChars(ch1, ch2, numberPerLine);
   
   
   }

   public static void printChars(char ch1, char ch2, int numberPerLine)
   {
      int count = 0;
   
      for (char characterToPrint = ch1; characterToPrint <= ch2; characterToPrint++)
      {
         System.out.print(characterToPrint + " ");
         count++;
         if(count % numberPerLine == 0)
         {
            System.out.println();
            
         } 
      }
   
   
   
   /*
      int count;
      ch1 = '1';
      ch2 = 'A';
      numberPerLine = 10;
   
      count = 0;
      while (count != 35)
      {
         while ( count != 9)
         {
            System.out.print(ch1 + " ");
            ch1++;
            
            
            count++;
         }
         while ( count != 35)
         {System.out.print(ch2 + " ");
            ch2++;
            if ((count == 9)|| (count == 19) || (count == 29))
               System.out.print("\n");
            count++;*/
         
   }
}
   

