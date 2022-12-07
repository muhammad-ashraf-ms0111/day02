package Animal;

public class Main {
  public static void main(String[] args) {

    Animal animal = new Animal("Generic Animal", "Huge", 400);
    doAnimalStuff(animal, "slow");

    Dog dog = new Dog();
    doAnimalStuff(dog, "fast"); //it's ok for dog to be the animal variable as dog inherits from animal and it is a type of animal

    Dog yorkie = new Dog("Yorkie", 15);
    doAnimalStuff(yorkie, "fast");

    Dog retriever = new Dog("Labrador Retriever", 65,"Floppy", "Swimmer");
    doAnimalStuff(retriever, "slow");

    Dog wolf = new Dog("Wolf", 70);
    doAnimalStuff(wolf, "fast");

    Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
    doAnimalStuff(goldie, "fast");
}
//method for any animals
public static void doAnimalStuff(Animal animal, String speed) {

    animal.makeNoise();
    animal.move(speed);
    System.out.println(animal);//use the toString method on the child class as it is more specific
    System.out.println("_ _ _ _");
}
}
//inheritance allows code reuse

