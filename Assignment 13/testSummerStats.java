/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 13
Program:    2
ProgramName:testSummerStats
Purpose:    To create an object that that calls each method from the other class
Operation:  Create the object then call each method in the other class
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the math/ sorting
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
public class testSummerStats
{
   public static void main(String[] args)
   {
   
      SummerStats test = new SummerStats(2, 3);
      double[] yearlyAverage;
      double[][] sumOfRows;
   
      System.out.print(test.toString());
      System.out.println("\nIndex of Most Money ");
      System.out.print(test.getIndexOfMostMoney());
      System.out.println("\nIndex of year Highest Salary");
      System.out.print(test.getIndexOfYearHighestSalary());
      System.out.println("\nMoney earned by index 1");
      System.out.print(test.getTotalAmountOfMoneyMadeByOnePerson());
      System.out.println("\nMoney earned by all");
      System.out.print(test.getTotalAmountOfMoneyMadeByAll());
      System.out.println("\nHighest income by a person in the 0 index");
      System.out.print(test.getHighestSalaryInAGivenYear());
      System.out.println("\nAverage Salary per year");
      yearlyAverage = test.getAverageSalaryPerYear();
      for(int year = 0; year < yearlyAverage.length; year++)
         System.out.print(yearlyAverage[year] + " ");
      System.out.println("\nTesting row Sum");
      sumOfRows = test.sortArrayByEarnings();
      for(int people = 0; people < sumOfRows.length; people++)
      {
         for(int year = 0; year < sumOfRows[people].length; year++)
         {
            System.out.print(sumOfRows[people][year] + " ");
         }
         System.out.println();
      }
   
   }
}