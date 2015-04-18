import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

  public static void main (String args[]) {
    prettyInteger(5);
    System.out.println(random(2,30));
  }

  // Write a method called calculateSquare that takes an int as a parameter and returns the square of that integer
  public static int calculateSquare(int x){
    return x * x;
  }

  // Write a method called calculateSquareRoot that takes an int as a parameter and returns the square root of that integer.
  public static double calculateSquareRoot(double x){
    return Math.sqrt(x);
  }

  // Write a method called toLowerCase that takes a String as a parameter and returns the String in lower case.
  public static String toLowerCase(String word){
    return word.toLowerCase();
  }

  // Write a method called isMultiple that takes 2 int parameters and determines if the second is a multiple of the first
  public static boolean isMultiple(int a, int b){
    if(a % b == 0)
      return true;
    return false;
  }

  // Write a method called prettyInteger that takes an int as a parameter and prints the integer surrounded by asterisks with the length of each side equal to the given integer.
  public static void prettyInteger(int a){
    String stars ="";
    for(int i = 0; i < a; i++)
    {
    stars += "*";
    }
    System.out.println(stars + " " + a + " " + stars);
  }

  // Write a method called random that takes 2 ints as parameters and returns a random int within that range.
  public static int random(int a, int b){
    Random rn = new Random();
    int random = rn.nextInt(b-a+1) + a;
    return random;
  }
}
