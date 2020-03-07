/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 13
Program:    2
ProgramName:SummerStats
Purpose:    To create methods for another class to utalize
Operation:  Creating multiple methods for which another class
            can call
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the math/ sorting
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Random;
class SummerStats
{
   double[][] salary;

   public SummerStats(int people, int years) 
   {
      salary = new double[people][years];
   
      
      for(people = 0; people < salary.length; people++)
      {
         for(years = 0; years < salary[people].length; years++)
         {
            salary[people][years] = (int)(1 + (Math.random()* 10));
         }
      }
      
   } 
   public String toString()
   {
      String output = "";
      for(int people = 0; people < salary.length; people++)
      {
         for( int years = 0; years < salary[people].length; years++)
         {
            output += (salary[people][years] + " ");
         }
         output += "\n";
      }
      return output; 
      
   }
   public int getIndexOfMostMoney()
   { 
      double sum;
      int indexMostMoney = 0;
      double mostMoney = 0;
      for(int people = 0; people < salary.length; people++)
      {
         sum = 0;
         for(int years = 0; years < salary[people].length; years++)
         {
            sum += salary[people][years];
            
         }
         if(mostMoney < sum)
         {
            mostMoney = sum;
            indexMostMoney = people; 
         }
      }
      return indexMostMoney;
   
   }

   public int getIndexOfYearHighestSalary()
   {
      int indexOfYearHighestSalary = 0;
      double highestSalary = 0;
   
      for(int people = 0; people < salary.length; people++)
      {
         for(int years = 0; years < salary[people].length; years++)
         {
            if(highestSalary < salary[people][years])
            {
               highestSalary = salary[people][years];
               indexOfYearHighestSalary = years;
            }
         }
          
      }
      return indexOfYearHighestSalary;
   }
   public double getTotalAmountOfMoneyMadeByOnePerson()
   {
      double sum = 0;
      for(int years = 0; years < salary[1].length; years++)
      {
         sum += salary[1][years];
      }
      return sum;
   }
   public double getTotalAmountOfMoneyMadeByAll()
   {
      double sum = 0;
      for(int people = 0; people < salary.length; people++)
      {
         for(int years = 0; years < salary[people].length; years++)
         {
            sum += salary[people][years];
         }
      }
      return sum; 
   }
   public int getHighestSalaryInAGivenYear()
   {
      int highestIndex = 0;
      double max = 0;
      for(int people = 0; people < salary.length; people++)
      {
         if(max < salary[people][0])
         {
            max = salary[people][0];
            highestIndex = people;
         }
      }
      return highestIndex;
      
   }
   public double[] getAverageSalaryPerYear()
   {
      double[] averageSalary = new double[salary[0].length];
      double sum = 0;
      double totalSum = 0;
      for(int years = 0; years < salary[0].length; years++)
      {
         for(int people = 0; people < salary.length; people++)
         {
            sum += salary[people][years];
         }
        
         averageSalary[years] = (sum / salary.length);
         sum = 0;
      }
      return averageSalary;
   }
   public double[][] sortArrayByEarnings()
   {
      double[][] output = new double[salary.length][salary[0].length];
      
      for(int people = 0; people < salary.length; people++)
      {
         for(int years = 0; years < salary[0].length; years++)
         {
            output[people][years] = salary[getIndex()][years];
         }
      }
      return output;
   }
   public double[] getRowSum()
   {
      double[] rowSum = new double[salary[0].length];
      for(int people = 0; people < salary.length; people++)
      {
         for(int years = 0; years < salary[0].length; years++)
         {
            rowSum[people] += salary[people][years];
            
         }
         
      }
      return rowSum;
   }
   public int getIndex()
   {
      int max = 0;
      double[] rowSum = new double[salary[0].length];
      for(int years = 0; years < getRowSum().length; years++)
      {
         rowSum = getRowSum();
      }
      for (int i = 0; i < getRowSum().length; i++)
      {
         if(rowSum[i] > max)
            max = i;
      }
      rowSum[max] = -1;
      return max;
      
   }
      
          // public double[] getRowSum()
 //  {
   
}
// use sumRows to get the sum of each row
// then return the array from SumRows. Then call that array into findMaxIndex. 
// using findMaxIndex locate the largest and return it. After the return statement
// set the maxindex = -1
// make sure the calling of findMaxIndex is a loop set to fill up the array.
// output array in original set equal to find maxIndex for output[0];
/*for(int i = 0; i < salary[people].length; i++)
            {
               if(rowSum[people] > max)
               {
                  output[people][years] = salary[people][years];
                  
               }
               max = rowSum[people];
            }
            
            
            for(int i = 0; i < salary.length; i++)
      {
         for(int j = 0; j < rowSum.length; j++)
         {
            if(rowSum[i] > max)
            {
               max = i;  
            }
         }
      
         for(int people = 0; people < salary.length; people++)
         {
            for(int years  = 0; years < salary[0].length; years++)
            {
               output[people][years] = salary[max][years];
            }
         }
         
      }
        
      
      return output;
    
   }
 
            
      */