/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 14
Program:    1
ProgramName:TestMyInteger
Purpose:    To test each method within the MyInteger class
Operation:  Create  objects to test each method. Then call each
            method from MyInteger to test if they work as intended or not
Input(s):   none
Output(s):  An example of what each method from MyInteger returns when called
            with specific parameters
Methodology:Declare variables, let computer do the math/ sorting
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
import java.util.Scanner;
public class TestMyInteger
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      MyInteger even = new MyInteger(4);
      MyInteger odd = new MyInteger(9);
      MyInteger prime = new MyInteger(3);
      
      // getter method
      System.out.println("Getter Method: " + even.getValue());
      
      // is even calling
      System.out.println("Is Even with even number " + even.isEven());
      System.out.println("Is Even with odd number " + odd.isEven());
      // odd method calling
      System.out.println("Is Odd with even number " + even.isOdd());
      System.out.println("Is Odd with odd number " + odd.isOdd());
      // prime method calling
      System.out.println("Is Prime with prime number " + prime.isPrime());
      System.out.println("Is Prime with normal number " + even.isPrime());
      
      System.out.println();
      
      // static calling
      System.out.println("Static even with even number " + even.isEven(4));
      System.out.println("Static even  with odd number " + even.isEven(3));
      System.out.println("Static odd with even number " + odd.isOdd(6));
      System.out.println("Static odd with odd number " + odd.isOdd(7));
      System.out.println("Static prime with prime number " + prime.isPrime(7));
      System.out.println("Static prime with normal number " + even.isPrime(6));
      
      System.out.println();
      
      // Object passing
      System.out.println("Even import with even " + MyInteger.isEven(even));
      System.out.println("Even import with odd " + MyInteger.isEven(odd));
      System.out.println("Odd import with odd  " + MyInteger.isOdd(odd));
      System.out.println("Odd import with even " + MyInteger.isOdd(even));
      System.out.println("Prime import with prime " + MyInteger.isPrime(prime));
      System.out.println("Prime import with normal number " + MyInteger.isPrime(even));
      
      System.out.println();
      
      // Equals
      System.out.println("Equals two same " + even.equals(4));
      System.out.println("Equals two differen't " + even.equals(25));
      System.out.println("Equals MyInteger object same " + MyInteger.isEven(4));
      System.out.println("Equals MyInteger object differen't " + MyInteger.isEven(25));
      
      System.out.println();
      
      // write out a char array Ex: 123
      char[] myList = new char[3];
      myList[0] = '1';
      myList[1] = '2';
      myList[2] = '3';
      System.out.println("Parse int for char array: " + MyInteger.parseInt(myList));
      System.out.println("String terst: " + MyInteger.parseInt("456"));
     
   }
}