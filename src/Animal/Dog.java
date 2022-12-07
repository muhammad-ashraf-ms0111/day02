package Animal;

public class Dog extends Animal {

  private String earShape;
  private String tailShape;

  public Dog() {
      super("Mutt", "Big", 50); //super calls the constructor on the super class
  }                                               //need to have a default constructor in the parent class

  public Dog(String type, double weight) {
      this(type, weight, "Perky", "Curled");
  }//make it simpler to create a dog object which has two parameters

  public Dog(String type, double weight, String earShape, String tailShape) {
      super(type, weight <  15 ? "small" : (weight < 35 ? "medium" : "large"),
              weight);
      this.earShape = earShape;
      this.tailShape = tailShape;
  } //more specific dog constructor (from parent class) with the one with parameters
  //modify the constructor to create a dog object easily
  //add the two dog attributes and remove the parameter size
  //call super to set some of the fields based on the animal fields


  @Override
  public String toString() {
      return "Dog{" +
              "earShape='" + earShape + '\'' +
              ", tailShape='" + tailShape + '\'' +
              "} " + super.toString(); //<-calls upon the toString in Animal class
  }

  //overide the makeNoise method on the Animal class
  @Override
  public void makeNoise() {

      if (type == "Wolf") {
          System.out.print("Ow Wooooo! ");
      }
      bark();
      System.out.println();
  }

  @Override
  public void move(String speed) {
      super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");
      if (speed == "slow") {
          walk();
          wagTail();
      } else {
          run();
          bark();
      }
      System.out.println();
  }
  //private to be called internally in the same class
  private void bark() {
      System.out.print("Woof! ");
  }

  private void run() {
      System.out.print("Dog Running ");
  }

  private void walk() {
      System.out.print("Dog Walking ");
  }

  private void wagTail() {
      System.out.print("Tail Wagging ");
  }
}
