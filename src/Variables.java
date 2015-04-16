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

  public static boolean isOdd(int a){
    if(a % 2 != 0)
      return false;

    return true;
  }

  public static void printHelloWorld(){
    System.out.println("Hello World");
  }

  public static int greatestCommonFactor(ArrayList<Integer> list){
    int gcf=0;

    return gcf;
  }
}
