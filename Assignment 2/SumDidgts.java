import java.util.Scanner;
public class SumDidgts
{
   public static void main(String[] args)
   {
      int number;
      int firstNumber;
      int A;
      int secondNumber;
      int thirdNumber;
      int sum;
      
      Scanner input = new Scanner(System.in);
      System.out.println(" Please enter a number between 0 and 1000:");
      number = input.nextInt();
      firstNumber = ( number / 100); 
      secondNumber = (( number / 10 ) % 10 );
      thirdNumber = ( number % 10);
      sum = ( firstNumber + secondNumber + thirdNumber );
      System.out.println(" The sum of the digits is " + sum );
      }
      }
      
      