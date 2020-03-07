public class Chapter6Quiz 
{
   public static void main (String[] args)
   {
      int a = 3;
      int b = 2;
      int k;
      String greeting = "Hello World!";
 
      k = m1(a, b);      
      System.out.println(k);
      m2(greeting, k); 
   }

   public static int m1(int x, int y)
   { 
      return (x * y);
   }

   public static void m2(String message, int n)
   {
      for (int i = 1; i <= n; i++)
         System.out.println(message);
   }
}