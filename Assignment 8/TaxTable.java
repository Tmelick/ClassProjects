/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 8
Program:    2
ProgramName:TaxTable
Purpose:    To practice methods
Operation:  When the program is run, it outputs the information coded
            in the program.
Input(s):   The ammount, annual percentage, number of months
Output(s):  Tax table for each specific filing
Methodology:Declare variables, let computer do the math
References: none
Time Spent: 20 minutes
*******************************************************************************/
public class TaxTable
{
   public static void main(String[] args)
   {
      int taxableIncome = 50000;
      int status = 0;
      
      System.out.print("Taxable \t Single \nIncome\n---------------\n");
      
      
      for (taxableIncome = 50000; taxableIncome <= 60000; taxableIncome = taxableIncome + 500)
      {
         status = 0;
         System.out.println((taxableIncome)+ "      " + Math.round((computeTax(status, taxableIncome))));
      }
      
      System.out.println("\n\nTaxable \tMarried Joint \nIncome   Or Qualifying \n\t\t\tWidow(er)\n---------------\n");
      
      for (taxableIncome = 50000; taxableIncome <= 60000; taxableIncome = taxableIncome + 500)
      {
         status = 1;
         System.out.println((taxableIncome) + "     " + Math.round((computeTax(status, taxableIncome))));
      }
      
      System.out.println("\n\nTaxable \t Married  \nIncome \tSeparate\n---------------\n");
      
      for (taxableIncome = 50000; taxableIncome <= 60000; taxableIncome = taxableIncome + 500)
      {
         status = 2;
         System.out.println((taxableIncome)+ "      " + Math.round((computeTax(status, taxableIncome))));
      }
      
      System.out.println("\n\nTaxable \t Head of  \nIncome\t a House\n---------------\n");
      
      for (taxableIncome = 50000; taxableIncome <= 60000; taxableIncome = taxableIncome + 500)
      {
         status = 3;
         System.out.println((taxableIncome)+ "     " + Math.round((computeTax(status, taxableIncome))));
      }
   
   }
   
   public static double computeTax(int status, double income)
   {
      double taxDue;
   
      if (status == 0)
         taxDue = Single(income);
      else if (status == 1)
         taxDue = Joint(income);
      else if (status == 2)
         taxDue = Separate(income);
      else
         taxDue = Head(income);
      
      return taxDue;
   }
  


   public static double Single(double income)
   {
   
      double taxSingle;
      
      final double FIRST_RATE = .10;
      final double SECOND_RATE = .15;
      final double THIRD_RATE = .25;
      final double FORTH_RATE = .28;
      final double FIFTH_RATE = .33;
      final double SIXTH_RATE = .35;
      final double THRESHOLD_10 = 8350;
      final double THRESHOLD_15 = 33950; 
      final double THRESHOLD_25 = 82250;
      final double THRESHOLD_28 = 171550; 
      final double THRESHOLD_33 = 372950;
      
   
      if (income <= THRESHOLD_10)
         taxSingle = income * FIRST_RATE;
      else if (income <= THRESHOLD_15)
         taxSingle = THRESHOLD_10 * FIRST_RATE + (income - THRESHOLD_10) * SECOND_RATE;
      else if (income <= THRESHOLD_25)
         taxSingle = THRESHOLD_10 * FIRST_RATE + (THRESHOLD_15 - THRESHOLD_10) * SECOND_RATE +
                 (income - THRESHOLD_15) * THIRD_RATE;
      else if (income <= THRESHOLD_28)
         taxSingle = THRESHOLD_10 * FIRST_RATE + (THRESHOLD_15 - THRESHOLD_10) * SECOND_RATE +
                 (THRESHOLD_25 - THRESHOLD_15) * THIRD_RATE + (income - THRESHOLD_25) * FORTH_RATE;
      else if (income <= THRESHOLD_33)
         taxSingle = THRESHOLD_10 * FIRST_RATE + (THRESHOLD_15 - THRESHOLD_10) * SECOND_RATE +
                 (THRESHOLD_25 - THRESHOLD_15) * THIRD_RATE + (THRESHOLD_28 - THRESHOLD_25) * FORTH_RATE +
                 (income - THRESHOLD_28) * FIFTH_RATE;
      else 
         taxSingle = THRESHOLD_10 * FIRST_RATE + (THRESHOLD_15 - THRESHOLD_10) * SECOND_RATE +
                 (THRESHOLD_25 - THRESHOLD_15) * THIRD_RATE + (THRESHOLD_28 - THRESHOLD_25) * FORTH_RATE +
                 (THRESHOLD_33 - THRESHOLD_28) * FIFTH_RATE + (income - THRESHOLD_33) * SIXTH_RATE;  
   
      return taxSingle;
        
   }
   
   public static double Joint(double income)
   {
      double taxJoint;
      
      final double FIRST_RATE = .10;
      final double SECOND_RATE = .15;
      final double THIRD_RATE = .25;
      final double FORTH_RATE = .28;
      final double FIFTH_RATE = .33;
      final double SIXTH_RATE = .35;
      final double THRESHOLD_10 = 16700;
      final double THRESHOLD_15 = 67900; 
      final double THRESHOLD_25 = 137050;
      final double THRESHOLD_28 = 208850; 
      final double THRESHOLD_33 = 372950;
      
   
            if (income <= THRESHOLD_10)
         taxJoint = income * FIRST_RATE;
      else if (income <= THRESHOLD_15)
         taxJoint = THRESHOLD_10 * FIRST_RATE + (income - THRESHOLD_10) * SECOND_RATE;
      else if (income <= THRESHOLD_25)
         taxJoint = THRESHOLD_10 * FIRST_RATE + (THRESHOLD_15 - THRESHOLD_10) * SECOND_RATE +
                 (income - THRESHOLD_15) * THIRD_RATE;
      else if (income <= THRESHOLD_28)
         taxJoint = THRESHOLD_10 * FIRST_RATE + (THRESHOLD_15 - THRESHOLD_10) * SECOND_RATE +
                 (THRESHOLD_25 - THRESHOLD_15) * THIRD_RATE + (income - THRESHOLD_25) * FORTH_RATE;
      else if (income <= THRESHOLD_33)
         taxJoint = THRESHOLD_10 * FIRST_RATE + (THRESHOLD_15 - THRESHOLD_10) * SECOND_RATE +
                 (THRESHOLD_25 - THRESHOLD_15) * THIRD_RATE + (THRESHOLD_28 - THRESHOLD_25) * FORTH_RATE +
                 (income - THRESHOLD_28) * FIFTH_RATE;
      else 
         taxJoint = THRESHOLD_10 * FIRST_RATE + (THRESHOLD_15 - THRESHOLD_10) * SECOND_RATE +
                 (THRESHOLD_25 - THRESHOLD_15) * THIRD_RATE + (THRESHOLD_28 - THRESHOLD_25) * FORTH_RATE +
                 (THRESHOLD_33 - THRESHOLD_28) * FIFTH_RATE + (income - THRESHOLD_33) * SIXTH_RATE;
      return taxJoint;
    
    
   }
   
   public static double Separate(double income)
   {
      double taxSeparate;
      
      final double FIRST_RATE = .10;
      final double SECOND_RATE = .15;
      final double THIRD_RATE = .25;
      final double FORTH_RATE = .28;
      final double FIFTH_RATE = .33;
      final double SIXTH_RATE = .35;
      final double THRESHOLD_10 = 8350;
      final double THRESHOLD_15 = 33950; 
      final double THRESHOLD_25 = 68525;
      final double THRESHOLD_28 = 104425; 
      final double THRESHOLD_33 = 186475;
      
   
           if (income <= THRESHOLD_10)
         taxSeparate = income * FIRST_RATE;
      else if (income <= THRESHOLD_15)
         taxSeparate = THRESHOLD_10 * FIRST_RATE + (income - THRESHOLD_10) * SECOND_RATE;
      else if (income <= THRESHOLD_25)
         taxSeparate = THRESHOLD_10 * FIRST_RATE + (THRESHOLD_15 - THRESHOLD_10) * SECOND_RATE +
                 (income - THRESHOLD_15) * THIRD_RATE;
      else if (income <= THRESHOLD_28)
         taxSeparate = THRESHOLD_10 * FIRST_RATE + (THRESHOLD_15 - THRESHOLD_10) * SECOND_RATE +
                 (THRESHOLD_25 - THRESHOLD_15) * THIRD_RATE + (income - THRESHOLD_25) * FORTH_RATE;
      else if (income <= THRESHOLD_33)
         taxSeparate = THRESHOLD_10 * FIRST_RATE + (THRESHOLD_15 - THRESHOLD_10) * SECOND_RATE +
                 (THRESHOLD_25 - THRESHOLD_15) * THIRD_RATE + (THRESHOLD_28 - THRESHOLD_25) * FORTH_RATE +
                 (income - THRESHOLD_28) * FIFTH_RATE;
      else 
         taxSeparate = THRESHOLD_10 * FIRST_RATE + (THRESHOLD_15 - THRESHOLD_10) * SECOND_RATE +
                 (THRESHOLD_25 - THRESHOLD_15) * THIRD_RATE + (THRESHOLD_28 - THRESHOLD_25) * FORTH_RATE +
                 (THRESHOLD_33 - THRESHOLD_28) * FIFTH_RATE + (income - THRESHOLD_33) * SIXTH_RATE;  
      return taxSeparate;
   
   
   
   
   }
   public static double Head(double income)
   {
      double taxHead;
      
      final double FIRST_RATE = .10;
      final double SECOND_RATE = .15;
      final double THIRD_RATE = .25;
      final double FORTH_RATE = .28;
      final double FIFTH_RATE = .33;
      final double SIXTH_RATE = .35;
      final double THRESHOLD_10 = 11950;
      final double THRESHOLD_15 = 45500; 
      final double THRESHOLD_25 = 117450;
      final double THRESHOLD_28 = 190200; 
      final double THRESHOLD_33 = 372950;
      
   
           if (income <= THRESHOLD_10)
         taxHead = income * FIRST_RATE;
      else if (income <= THRESHOLD_15)
         taxHead = THRESHOLD_10 * FIRST_RATE + (income - THRESHOLD_10) * SECOND_RATE;
      else if (income <= THRESHOLD_25)
         taxHead = THRESHOLD_10 * FIRST_RATE + (THRESHOLD_15 - THRESHOLD_10) * SECOND_RATE +
                 (income - THRESHOLD_15) * THIRD_RATE;
      else if (income <= THRESHOLD_28)
         taxHead = THRESHOLD_10 * FIRST_RATE + (THRESHOLD_15 - THRESHOLD_10) * SECOND_RATE +
                 (THRESHOLD_25 - THRESHOLD_15) * THIRD_RATE + (income - THRESHOLD_25) * FORTH_RATE;
      else if (income <= THRESHOLD_33)
         taxHead = THRESHOLD_10 * FIRST_RATE + (THRESHOLD_15 - THRESHOLD_10) * SECOND_RATE +
                 (THRESHOLD_25 - THRESHOLD_15) * THIRD_RATE + (THRESHOLD_28 - THRESHOLD_25) * FORTH_RATE +
                 (income - THRESHOLD_28) * FIFTH_RATE;
      else 
         taxHead = THRESHOLD_10 * FIRST_RATE + (THRESHOLD_15 - THRESHOLD_10) * SECOND_RATE +
                 (THRESHOLD_25 - THRESHOLD_15) * THIRD_RATE + (THRESHOLD_28 - THRESHOLD_25) * FORTH_RATE +
                 (THRESHOLD_33 - THRESHOLD_28) * FIFTH_RATE + (income - THRESHOLD_33) * SIXTH_RATE;  
      return taxHead;
      
   }
      
      
}