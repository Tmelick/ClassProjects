/**************************************************************************
Class:         CS1301
Section:       05
Term:          Spring 2017
Name:          Tarrin Melick
Instructor:    Mr. Robert Thorsen
Lab:           1
Exercise:      6
ProgramName:   Lab1Exercise6
Purpose:       To show the different kinds of erros
Operation:     When the program is run, it outputs the information codedin the program.
Input(s):      None
Output(s):     Differen't errors.
Methodology:   Coppied and pasted from book.
References:    none
Time Spent:    10minuets coppying, and 5 minues reading why.
*******************************************************************************/

public class Lab1Exercise6 {
     public static main(String[] args) {
      System.out.println("Welcome to Java);
      }
   }
   // Missing void from the second line, and missing the closing quotation mark.
public class ShowRuntimeErrors {
   public static void main(String[] args) {
      System.out.println(1 / 0);
   }
 }
 // Dividing by 0 with integer divison
   
public class ShowLogicErrors {
      public static void main(String[] args) {
         System.out.println("Celsius 35 is Fahrenheit degree ");
         System.out.println((9 / 5) * 35 + 32);
   }
 }
 
// logical error due to there being no .0 after the nine of the five