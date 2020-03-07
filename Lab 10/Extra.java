
public class ArrayMethods
{
   public static void main(String[] args)
   {
   
      int[] myList = new int[5];
      for (int i = 0; i < myList.length; i++)
         myList[i] = 1 + ((int)(Math.random() * (1000 - 1) + 1));
   
     
   }
}



// int temp;

// for(int i = 0) i < testArray.length / 2; i++)
// {
// temp = testArray[i];
//
// testArray[i] = testArray(testArray.length - i -1];
// testArray(testArray.length - i -1] = temp;