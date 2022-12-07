package Animal;

public class Animal {
  protected String type;//type initially has a private access and no classes/subclasses can access in their method. but type is inherited by dog. change to protected to allow access by subclasses (conditional encapsulation)
  private String size;
  private double weight;

  public Animal() {

  }

  public Animal(String type, String size, double weight) {
      this.type = type;
      this.size = size;
      this.weight = weight;
  }

  @Override
  public String toString() {
      return "Animal{" +
              "type='" + type + '\'' +
              ", size='" + size + '\'' +
              ", weight=" + weight +
              '}';
  }

  public void move(String speed) {
      System.out.println(type + " moves " + speed);
  }

  public void makeNoise() {
      System.out.println(type + " makes some kind of noise");
  }
}


