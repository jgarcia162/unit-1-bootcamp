/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

  public static void main (String args[]) {

  }

  // Write a method isOdd that takes in an int n. Returns a true if n is odd, and false otherwise.
  public static boolean isOdd(int n){
    if(n % 2 != 0)
      return true;
    return false;
  }

  // Write a method isMultipleOfThree that takes in an int n. Returns true if n is a multiple of three, and false otherwise
  public static boolean isMultipleOfThree(int n){
    if(n % 3 == 0)
      return true;
    return false;
  }

  // Write a method isOddAndIsMultipleOfThree that takes in an int n. Returns true if n is both odd and a multiple of three, and false otherwise.
  public static boolean isOddAndMultipleOfThree(int n){
    if(n % 2 != 0 && n % 3 == 0)
      return true;
    return false;
  }

  // Write a method isOddAndIsMultipleOfThree2 - if you used isOdd and isMultipleofThree in your last solution, don't use it this time. If you did not, write this method building on your last methods.
  public static boolean isOddAndMultipleOfThree2(int n){
    if(isOdd(n) && isMultipleOfThree(n))
      return true;
    return false;
  }

  // Write a method fizzMultipleofThree that takes in an int n and prints "Fizz" if n is a multiple of three, and prints n otherwise.
  public static void fizzMulipleOfThree(int n){
    if(n % 3 == 0)
    {
      System.out.println("Fizz");
    }else System.out.println(n);
  }

  // Write a method that takes in a Person and returns true if the person is from London, and false otherwise.
  public static boolean isFromLondon(Person person){
    if(person.getCity().equalsIgnoreCase("London"))
      return true;
    return false;
  }

  // Write a method that takes in a Person and prints the name if the person has a name longer than 5 characters, and otherwise prints "Name is too short."
  public static void nameLongerThan5Characters(Person person){
    if(person.getName().length() > 5)
    {
      System.out.println(person.getName());
    }
    else
      System.out.println("Name is too short.");
  }
}
