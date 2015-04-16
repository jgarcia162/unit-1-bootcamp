/**
 * Created by Joe on 4/16/15.
 */
public class BonusProblems {
    public static void main(String[] args) {
        fizzBuzzEuler1();

    }

    // If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.Find the sum of all the multiples of 3 or 5 below 1000.
    public static void projectEuler1(){
        int sum = 0;
        for(int i = 0; i < 1000 ; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        System.out.println("The sum of all multiples of 3 and 5 from 1 to 1000 is " + sum);
    }

    // Modify this code to write FizzBuzz. Print out each of the numbers from 1 to 1000. If the number is divisible by 3 then print "Fizz" instead of the number. If the number is divisible by 5 then print "Buzz" instead of the number. If the number is divisible by both then print "Fizzbuzz".
    public static void fizzBuzzEuler1(){
        for(int i = 1; i <= 1000 ; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 5 == 0) {
                System.out.println("Buzz");
            }else if(i % 3 == 0) {
                System.out.println("Fizz");
            }
            else System.out.println(i);
        }
    }

    // Modify this code again: instead of replacing numbers if they are divisible by 3 and 5, print "Fizz" if the number contains a 3 and "Buzz" if the number contains a 5, and "Fizzbuzz" if it contains both.
    public static void fizzBuzzContains(){
        for(int i = 1; i < 1000; i++) {
            if(((i - 3)%10==0) && ((i-5)%10==0)){
                System.out.println("FizzBuzz");
            }
        }
    }
}
