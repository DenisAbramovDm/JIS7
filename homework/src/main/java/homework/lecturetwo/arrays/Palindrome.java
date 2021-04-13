package homework.lecturetwo.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
   private static Scanner in = new Scanner(System.in);
   public void swap(char[] array){

      char temp = 0;
      for (int i = 0; i < (array.length/2); i++){
         temp = array[i];
         array[i] = array[array.length - (i + 1)];
         array[array.length - (i + 1)] = temp;
      }

   }

   public boolean isPalindrome(String text){
      String lettersOnly = text.replaceAll("[\\W]", "");
      String lowerCase = lettersOnly.toLowerCase();
      char[] inputArray = lowerCase.toCharArray();
      char[] verificationArray = Arrays.copyOf(inputArray, inputArray.length);
      swap(verificationArray);
      if (Arrays.equals(inputArray, verificationArray)){
         return true;
      }
      else
         return false;

   }
}
