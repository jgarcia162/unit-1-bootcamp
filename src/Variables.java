import java.util.ArrayList;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {

  public static void main (String args[]) {
    int a;
    double b;
    String c;

    a = 113;
    b = 2.718128;
    c = "Computer Science";

    System.out.println("This is room # " + a);
    System.out.println("e is close to " + b);
    System.out.println("I am learning a bit about " + c);

  }

  // Consider a method isOdd. What type should it return? What type(s) should it take in? Create the method signature.
  public static boolean isOdd(int a){
    if(a % 2 != 0)
      return false;

    return true;
  }

  // Consider a method printHelloWorld. What type should it return? What type(s) should it take in? Create the method signature
  public static void printHelloWorld(){
    System.out.println("Hello World");
  }

  // Consider a method greatestCommonFactor. What type should it return? What type(s) should it take in? Create the method signature.
  public static int greatestCommonFactor(ArrayList<Integer> list){
    int gcf=0;

    return gcf;
  }
}
