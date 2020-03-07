/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        13
Exercise:   2
ProgramName:TestStock
Purpose:    To Test methods created by Stock
Operation:  Create an object that calls from the specified class. Then calls
            methods
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the sorting / math
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/
public class TestStock
{
   public static void main(String[] args)
   {
      Stock OracleStock = new Stock("ORCL", "Oracle Corporation");
      OracleStock.setPreviousClosingPrice(34.5);
      OracleStock.setCurrentPrice(34.35);
      System.out.print("Price change percentage: " + OracleStock.getChangePercent() + " \n " );
      
      Stock MS = new Stock("MS", "Microsoft");
      MS.setPreviousClosingPrice(24.8);
      System.out.print("\nPrevious closing price of MS is = " + MS.getPreviousClosingPrice());
      MS.setCurrentPrice(22.3);
      System.out.print("\nCurrent closing price of MS is = " + MS.getCurrentPrice());
      System.out.print("\nPrice change percentage for MS: " + MS.getChangePercent() + "\n");
      
      Stock Google = new Stock("G", "Google");
      Google.setPreviousClosingPrice(10.3);
      System.out.print("\nPrevous closing price of Google is = " + Google.getPreviousClosingPrice());
      Google.setCurrentPrice(15.3);
      System.out.print("\nCurrent closing price of Google is = " + Google.getCurrentPrice());
      System.out.print("\nPrice change percentage for Google: " + Google.getChangePercent());
   }
}