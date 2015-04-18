import java.util.Calendar;

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

  // When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Write a method called cigarParty that takes an int (the number of cigars) and boolean (whether or not it is the weekend) as parameters, and returns true if the party with the given values is successful, or false otherwise.
  public static boolean cigarParty(int cigars, boolean weekend){
    if(weekend && cigars >= 40) {
      return true;
    }else if(cigars >= 40
             && cigars <=60
             && !weekend){
      return true;
    }else return false;
  }

  // You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
  public static int caughtSpeeding(int speed, boolean bday){
    int ticket=0;
    while(!bday){
    if(speed > 60 && speed <=80)
      ticket = 1;
    else if(speed > 80)
      ticket = 2;
      return ticket;
    }
    if(speed > 65 && speed <= 85)
        ticket = 1;
    else if(speed > 85)
        ticket = 2;

    return ticket;
  }

  // Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
  public static String alarmClock(int weekday, boolean vacation){
    String alarm="";
    if(weekday >= 1 && weekday <= 5 && !vacation)
      alarm ="7:00";
    else if(weekday == 0 || weekday == 6 && !vacation)
      alarm = "10:00";
    else if(vacation && weekday >= 1 && weekday <= 5)
      alarm = "10:00";
    else alarm = "off";
    return alarm;
  }

  // You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10. Write a method that takes 3 ints as parameters and returns the correct result.
  public static int lotteryTicket(int a, int b, int c){
    int result;

    if(a != b && a != c && b != c)
      result = 0;
    else if(a == b && a == c && b == c)
      result = 20;
    else
      result = 10;

    return result;
  }

  // Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
  public static int blackJack(int a, int b){
    do{
    if(a > b && a <= 21)
      return a;
    else if(a < b && b <= 21)
      return b;
    else if(a > 21 && b > 21)
      return 0;
    else return 0;
    }while(a > 0 && b > 0);
    }

  // Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.
  public static boolean evenlySpaced(int a, int b, int c){
    do{
      if((b - a)==(c - b))
        return true;
      else return false;
    }while(a > 0 && b > 0 && c > 0);
  }
}
