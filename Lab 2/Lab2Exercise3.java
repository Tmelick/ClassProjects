/**************************************************************************
Class:         CS1301
Section:       05
Term:          Spring 2017
Name:          Tarrin Melick
Instructor:    Mr. Robert Thorsen
Lab:           2
Exercise:      3
ProgramName:   Lab2Exercise3
Purpose:       to show the differen't forms of storage
Operation:     When the program is run, it outputs the information codedin the program.
Input(s):      the differen't varibles for the differen't forms of storage
Output(s):     the inputed varibles
Methodology:   Enter each varible for the differen't forms of storage then have
               it print out the line
References:    none
Time Spent:    10 minutes
*******************************************************************************/
import java.util.Scanner ;
public class Lab2Exercise3
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      byte byteValue;
      short shortValue;
      int intValue;
      long longValue;
      float floatValue;
      double doubleValue;
      boolean booleanValue;
      char charValue;
        
      System.out.print(" Enter byte value:\t");
      byteValue = input.nextByte();
      System.out.print(" Enter short value:\t");
      shortValue = input.nextShort();
      System.out.print(" Enter Int value:\t\t");
      intValue = input.nextInt();
      System.out.print(" Enter Long Value:\t");
      longValue = input.nextLong();
      System.out.print(" Enter Float Value\t");
      floatValue = input.nextFloat();
      System.out.print(" Enter Double Value\t");
      doubleValue = input.nextDouble();
      System.out.print(" Enter Boolean Value\t");
      booleanValue = input.nextBoolean();
      System.out.print(" Enter Character Value\t");
      charValue = input.next().charAt(0);
         
      System.out.print("\nThe byte value is:\t\t" + byteValue );
      System.out.print("\nThe short value is:\t\t" + shortValue);
      System.out.print("\nThe int value is:\t\t\t" + intValue);
      System.out.print("\nThe long value is:\t\t" + longValue);
      System.out.print("\nThe float value is:\t\t" + floatValue);
      System.out.print("\nThe double value is:\t\t" + doubleValue);
      System.out.print("\nThe boolean value is:\t" + booleanValue);
      System.out.print("\nThe char value is:\t\t" + charValue);
   }
}