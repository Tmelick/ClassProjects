 /**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Lab:        13
Exercise:   2
ProgramName:Stock
Purpose:    To create methods for another class to use
Operation:  creates multiple methods for other classes to use
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the sorting / math
References: Internet / you
Time Spent: 40 minutes
*******************************************************************************/
class Stock
{
String symbol;
String name;
double previousClosingPrice;
double currentPrice;

Stock(String symbol, String name)
{
   this.symbol = symbol;
   this.name = name;
}

public double getChangePercent()
{
return (currentPrice - previousClosingPrice) / previousClosingPrice;
}
public void setCurrentPrice(double currentPrice)
{
   this.currentPrice = currentPrice;
}
public void setPreviousClosingPrice(double previousClosingPrice)
{
   this.previousClosingPrice = previousClosingPrice;
}
public double getCurrentPrice()
{
   return currentPrice;
}
public double getPreviousClosingPrice()
{
   return previousClosingPrice;
}
}

