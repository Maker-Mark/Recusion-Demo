import java.util.*;
import java.io.*;

public class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int[] arr = {0, 2, 7, 8, 2, 99, 200, 0, 4};
    System.out.println("Enter a number to factorial:");
    int n = sc.nextInt();
    System.out.println("Factorial of " + n +" is: "  + fact(n));
    System.out.println("Enter a world that you want to check as a palindrome:");
    String str = sc.next();
    if((isPalindrome(str)) == true){
    System.out.println(str + " is a palindrome!");
    }else {
        System.out.println(str + " is not a paindrome :(");
    }
    System.out.println("Max of your array is : " + max(arr, arr.length));
  
  }
  
  
  //Palendrone: The first and last must equal
  //And the the next ones to the left of it need to match too!
  
  public static boolean isPalindrome(String str){
    //Base case
    if(str.length() <= 1)
    return true;
    //Tail recurion: The last thing you do is the recursive step
    //One line 
    //Short curcit eval: in an or statement if the forst part is true the rest is ignored
    // return str.charAt(0) == str.charAt(str.lenth()-1) || isPalindrome(1, str.length()-1));
    
    //If both are true, it will return
    //                  Here and on is its own eval
   return (str.charAt(0)  == str.charAt(str.length()-1)) && isPalindrome(str.substring(1,                     str.length()- 1));
  }
  
  //Method max goes through an array and returns the max using a recursive call
  //n is the lenght of the array
  public static int max(int[] arr, int n) {
    //Base
    // if(n == 0) throw new Exception("ERROR");
    if(n == 1) return arr[0]; // The max must be the only element
    // max(arr, arr.length);
    //in an array with n = 5, to calc maxRest we 
    //need to check the first 4 numbers then compare it to the last spot.
  
    //Whatever is bigger 
    int maxRest = max(arr, n-1); //Now I only want to look at the n-1 numbers
    ///Math.max returns the bigger of two numbers
    return Math.max(maxRest , arr[n-1]);
  
  }
  
  public static int fact(int n){
    //Base case
    // First it checks if n == 0 or 1
    if (n == 1 || n == 0)
      return 1;
    //If not, it knows it need to take n and multiply with 
    //Factorial represents the ways you can organize things, so zero is one
    // n! = n * (n-1)!, All recursion need a base case
    return n * fact(n-1);
    
  }  
  
}
