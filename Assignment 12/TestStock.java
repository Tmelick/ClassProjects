public class TestStock
{
public static void main(String[] args)
{
   Stock OracleStock = new Stock("ORCL", "Oracle Corporation");
   OracleStock.setPreviousClosingPrice = 34.5;
   OracleStock.setCurrentPrice = 34.35;
   System.out.print("Price change Percentage: " + OracleStock.getChangePercent());
}
}