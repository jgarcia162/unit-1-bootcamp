import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

  public static void main (String args[]) {
    prettyInteger(5);
    System.out.println(random(2,30));
  }

  public static int calculateSquare(int x){
    return x * x;
  }

  public static double calculateSquareRoot(double x){
    return Math.sqrt(x);
  }

  public static String toLowerCase(String word){
    return word.toLowerCase();
  }

  public static boolean isMultiple(int a, int b){
    if(a % b == 0)
      return true;
    return false;
  }

  public static void prettyInteger(int a){
    String stars ="";
    for(int i = 0; i < a; i++)
    {
    stars += "*";
    }
    System.out.println(stars + " " + a + " " + stars);
  }

  public static int random(int a, int b){
    Random rn = new Random();
    int random = rn.nextInt(b-a+1) + a;
    return random;
  }
}
