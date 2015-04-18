import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

  public static void main (String args[])
  {
    ArrayList<Cat> cats = new ArrayList<Cat>();

    Cat Garfield = new Cat("Garfield");
    Cat Felix = new Cat("Felix");
    Cat Bob = new Cat("Bob");
    Cat Tiger = new Cat("Tiger");
    Cat Rigby = new Cat("Rigby");

    cats.add(Garfield);
    cats.add(Felix);
    cats.add(Bob);
    cats.add(Tiger);
    cats.add(Rigby);

    for(int i = 0; i < cats.size() ; i++)
    {
      System.out.println(cats.get(i));
    }

    HashMap<String, Integer> pod = new HashMap<String, Integer>();

    pod.put("Anthony",26);
    pod.put("Tasha",24);
    pod.put("Ramona",27);
    pod.put("Hans",25);
    pod.put("Jose", 24);

    for(String name:pod.keySet())
    {
      System.out.println(pod.get(name));
    }
    System.out.println(canRentACar(pod));

    ArrayList<Integer> ints = new ArrayList<Integer>();
    ints.add(2);
    ints.add(3);
    ints.add(4);
    ints.add(4);
    mostFrequentElement(ints);

    sortingSentences("I have twelve cats, they all have tails.");
  }

  // Write a method called mostFrequentElement that takes an ArrayList of Integers and finds the most frequently occurring element in the ArrayList. At the end print the element and its number of occurrences. If there is more than one such element, any one of them may be printed.
  public static void mostFrequentElement(ArrayList<Integer> ints ){
    HashMap<Integer,Integer> nums = new HashMap<Integer, Integer>();

    for(int i = 0; i < ints.size() ; i++) {
      if(!nums.containsKey(ints.get(i)))
      nums.put(ints.get(i),1);
      else if(nums.containsKey(ints.get(i)))
        nums.put(ints.get(i),nums.get(ints.get(i))+1);
    }
    int freq = 0;
    int mostFreq = 0;
    for(Integer n : nums.keySet()){
     if(nums.get(n) > freq){
       freq = nums.get(n);
       mostFreq = n;
     }
    }
    System.out.println(mostFreq + " is the most frequent element, it appears " + freq + " times");
  }

  // Write a method called canRentACar that takes the Pod HashMap as a parameter and returns whether or not the Pod can rent a car. If one or more studetns is over 25, it should return true. If no one in the Pod is over 25, it should return false.
  public static boolean canRentACar(HashMap<String,Integer> pod){
    for(String name:pod.keySet()){
      if(pod.get(name) >= 25){
        return true;
      }
    }
    return false;
  }

  // Given an array of strings and an integer, write a method that returns an ArrayList where all the strings of the given length are omitted.
  public static ArrayList<String> wordsWithoutList(Array[][] string, int n){
    ArrayList<String> wordsWithout = new ArrayList<String>();

    for(int i= 0; i < string.length; i++) {
      if(string[i].length != n)
        wordsWithout.add(string[i].toString());
    }
    return wordsWithout;
  }

  // Say that a "clump" in an ArrayList is a series of 2 or more adjacent elements of the same value. Write a method that returns the number of clumps in the given ArrayList.
  public static int howManyClumps(ArrayList<Integer> list){
    int clumps = 0;
    for(int i = 1; i <= list.size(); i++) {
      int current = list.get(i);
      if (current == list.get(i+1))
        continue;
      else if (current == list.get(i+1) && current == list.get(i-1))
        clumps++;
      else continue;
    }
    return clumps;
  }

  // Write a method that takes a String sentence, breaks it up into an ArrayList of Strings (one word per ArrayList element), and prints out the words in alphabetical order.
  public static void sortingSentences(String sentence){
    String newSentence = "";
    // Lowercase sentence to avoid capital letter issues
    sentence = sentence.toLowerCase();
    //Use for loop with conditional statements to remove punctuation marks
    for(int i = 0; i < sentence.length(); i++) {
      if(sentence.charAt(i) != ',' && sentence.charAt(i) != '?'
                                   && sentence.charAt(i) != '!'
                                   && sentence.charAt(i) != ';'
                                   && sentence.charAt(i) != '.'){
        // Create new sentence without punctuation marks
        newSentence += sentence.charAt(i);
      }
    }
    // Create new ArrayList for new sentence words
    ArrayList<String> words = new ArrayList<String>();

    // Split new sentence into words
    String[] newWords = newSentence.split(" ");

    //Use for loop to add words into ArrayList
    for(int i = 0; i < newWords.length; i++) {
      words.add(newWords[i]);
    }

    // Sort ArrayList alphabetically
    Collections.sort(words);

    // print sorted ArrayList
    for(String n : words){
      System.out.println(n);
    }
  }
}
