/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  public static void main (String args[]) {
    // Create 3 cats named Garfield, Pink Panther, and Catwoman.
    Cat Garfield = new Cat("Garfield");
    Cat PinkPanther = new Cat("PinkPanther");
    Cat Catwoman = new Cat("Catwoman");

    // Assign each of them a favorite food (Garfield's favorite food should be Lasagna).
    Garfield.setFavoriteFood("Lasagna");
    PinkPanther.setFavoriteFood("Pizza");
    Catwoman.setFavoriteFood("Burritos");

    // Assign each of them an age
    Garfield.setAge(11);
    PinkPanther.setAge(13);
    Catwoman.setAge(9);

    System.out.println(isOlder(Catwoman, Garfield));
  }

  // Write a method called isOlder that takes 2 Cats as parameters and returns whether or not the first Cat is older than the second.
  public static boolean isOlder(Cat a, Cat b){
    if(a.getAge() > b.getAge()){
      return true;
    }else return false;
  }

  // Write a method called makeBestFriends that takes 2 Cats as parameters and sets both of their favorite foods to the same thing.
  public static void makeBestFriends(Cat a, Cat b){
    a.setFavoriteFood(b.getFavoriteFood());
  }

  // Write a method called makeKitten that takes 2 Cats as parameters and returns a new Cat with a name that is the combination of the 2 parent Cats' names. The age of the new Cat should be 0.
  public static Cat makeKitten(Cat a, Cat b){
    Cat kitten = new Cat(a.getName() + b.getName());
    kitten.setAge(0);
    return kitten;
  }

  // Write a method called adoption that takes 1 Cat and 1 Person as a paramater and sets the Cat's owner to be the Person.
  public static void adoption(Person a, Cat b){
    // If the Cat's name is Catwoman, don't set the owner, but instead print: "Catwoman will never be anyone's pet!"
    if(b.getName().equalsIgnoreCase("Catwoman")){
      System.out.println("Catwoman will never be anyone's pet!");
    }else b.setOwner(a);
  }

  // Write a method called isFree that checks whether or not a Cat has an owner.
  public static boolean isFree(Cat a){
    if(a.getOwner().equals(null)){
      return true;
    }else return false;
  }

  // Write a method called areSiblings that checks whether or not 2 Cats have the same owner.
  public static boolean areSiblings(Cat a, Cat b){
    if(a.getOwner().equals(b.getOwner())){
      return true;
    }else return false;
  }
}
