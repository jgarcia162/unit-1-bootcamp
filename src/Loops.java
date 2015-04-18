/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

  public static void main (String args[]) {
    sumOf1to10();
    sumOf1toN(13);
    sumOf1to10000();
    printStringNtimes(5, "Dogs");
    printStringNtimesConcatenated(5, "Cats");
    printFirstNFibonacci(12);
  }

  // Write a method that prints the numbers 1 through 10 using a loop.
  public static void print1to10(){
    for(int i = 1; i <= 10 ; i++)
    {
      System.out.println(i);
    }
  }

  // Write a method that prints the numbers 1 through 10 using a different kind of loop.
  public static void print1to10differentLoop(){
    int i=1;
    while(i <= 10){
      System.out.println(i);
      i++;
    }
  }

  // Write a method that takes in an int n and prints the numbers 1 through n.
  public static void print1toN(int n){
    for(int i = 1; i <= n; i++)
    {
      System.out.println(i);
    }
  }

  // Write a method that takes in an int n and prints the even numbers 2 through n.
  public static void print2toNeven(int n){
    for(int i = 2; i <= n ; i++)
    {
      if(i % 2 == 0)
        System.out.println(i);
    }
  }

  // Write a method that prints the sum of 1 through 10 using a loop.
  public static void sumOf1to10(){
    int sum = 0;
    for(int i = 0; i <=10 ; i++)
    {
      sum += i;
    }
    System.out.println(sum);
  }

  // Write a method that takes in an int n and prints the sum of the numbers 1 through n using a loop.
  public static void sumOf1toN(int n){
    int sum = 0;
    for(int i = 1; i <= n ; i++)
    {
      sum += i;
    }
    System.out.println(sum);
  }

  // Use the method you wrote in part 6 to print the sum of the numbers from 1 through 10000.
  public static void sumOf1to10000(){
    sumOf1toN(10000);
  }

  // Write a method that takes in an int n and a String s and prints out s on its own line, n times. If n is negative, print "".
  public static void printStringNtimes(int n, String s){
    if(n < 0)
    {
      System.out.println("");
    }else {
     for(int i = 1; i <= n; i++) {
       System.out.println(s);
      }
    }
  }

  // Modify the method to print out the string concatenated with itself n times.
  public static void printStringNtimesConcatenated(int n, String s){
    String result = "";
    if(n < 0){
      System.out.println("");
    }else {
      for(int i = 1; i <= n ; i++) {
        result += s;
      }
    }
    System.out.println(result);
  }

  // Write a method that prints the first ten Fibonnaci numbers.
  public static void printFirstTenFibonacci(){
    int f0 = 0, f1 = 1, f2 = 0;
    int sum =0;

    System.out.println("The first 10 Fibonacci numbers are: ");

    for(int i = 0; i <= 10 - 1; i++){
      System.out.print(f2 + " ");
      f2 = f0 + f1;
      f0 = f1;
      f1 = f2;
      sum += f2;
    }
    System.out.println("");
    // Modify the method to sum the first ten Fibonnaci numbers.
    System.out.println("The sum of the first 10 Fibonacci numbers is " + sum);
  }

  // Modify the method to take in an int n and sum the first n Fibonnaci numbers.
  public static void printFirstNFibonacci(int n){
    int f0 = 0, f1 = 1, f2 = 0;
    int sum =0;

    System.out.println("The first " + n + " Fibonacci numbers are: ");

    for(int i = 0; i <= n - 1; i++){
      System.out.print(f2 + " ");
      f2 = f0 + f1;
      f0 = f1;
      f1 = f2;
      sum += f2;
    }
    System.out.println("");
    // Modify the method to sum the first N Fibonnaci numbers.
    System.out.println("The sum of the first " + n + " Fibonacci numbers is " + sum);
  }
}
