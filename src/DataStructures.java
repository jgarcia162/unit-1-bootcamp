import java.util.ArrayList;
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
  }

  public static void mostFrequentElement(ArrayList<Integer> ints ){

  }

  public static boolean canRentACar(HashMap<String,Integer> pod){
    for(String name:pod.keySet()){
      if(pod.get(name) >= 25){
        return true;
      }
    }
    return false;
  }
}
