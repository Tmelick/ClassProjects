/**************************************************************************
Class:      CS 1301
Section:    05
Term:       Spring 2017
Name:       Tarrin Melick
Instructor: Mr. Robert Thorsen
Assignment: 14
Program:    1
ProgramName:MyInteger
Purpose:    To create methods for another class to utalize
Operation:  Creating multiple methods for which another class
            can call to solve the prbolem presented in that class
Input(s):   none
Output(s):  none
Methodology:Declare variables, let computer do the math/ sorting
References: internet/ you
Time Spent: 40 minutes
*******************************************************************************/
public class MyInteger
{
   private int value;
   
   public MyInteger(int value)
   {
      this.value = value;
   }
   public int getValue()
   {
      return value;
   }
   
   public static int parseInt(char[] array)
   {
      int value = 0;
      for(int i = 0; i < array.length; i++)
         value = value * 10 + (array[i] - '0');
   
      return value;
   }
   public static int parseInt(String string)
   {
      int length = string.length();
       char[] charArray  = new char[length];
      for(int i = 0; i < length; i++)
       charArray[i] = string.charAt(i); //value = value * 10 + (string.charAt(i) - '0');
    
      return parseInt(charArray);
   }
   
   // IS EQUALS
   public boolean equals(int passedOverValue)
   {
      return (this.value == passedOverValue);
   }
   public boolean equals(MyInteger obj)
   {
      return (this.value == obj.value);
   }
   
   
   // IS EVEN
   
   // MyInteger version
   public static boolean isEven(MyInteger obj)
   {
      return (0 == (obj.value %2));
   }
   // static method of is Even
   public static boolean isEven(int value)
   {
      return (0 == (value %2));
   }
   // regular is Even
   public boolean isEven()
   {
      return (0 == (value %2));
   }
   
   // IS ODD
  
   // my integer is odd
   public static boolean isOdd(MyInteger obj)
   {
      return (1 == (obj.value % 2));
   }
   // static method of is Odd
   public static boolean isOdd(int value)
   {
      return (1 == (value % 2));
   }
   // regular is Odd
   public boolean isOdd()
   {
      return (1 == (value % 2));
   }
   
   // IS PRIME
   
   // is prime myInteger
   public static boolean isPrime(MyInteger obj)
   {

      return isPrime(obj.value);
   }
   // static method of is Prime
   public static boolean isPrime(int value)
   {
      if ( isEven(value) && value != 2)
         return false;
      
      int tempValue = (int)Math.sqrt(value);
      
      for(int i = 3; i  <= tempValue; i++)
      {
         if (value % i == 0)
            return false;
      }
       
            
      return true;
   }
   // Regular method of is Prime
   public boolean isPrime()
   {

            
      return isPrime(this.value);
   }
}