package animals;

public class Animals {

    protected void eat() {
        System.out.println("Eating...");
    }

    protected void sleep() {
        System.out.println("Sleeping...");
    }

    protected String makeSound(String sound) {
        return sound;
    }

}

class Dog extends Animals {

    public void bark() {
        System.out.println("Woof!");
    }

    @Override
    protected void sleep() {
        System.out.println("I need sleep...");
        System.out.println("method pather method: ");
        super.sleep(); // This calls the sleep method of the parent class (Animals).
    }

    @Override
    protected String makeSound(String sound) {
        return "Dog says: " + sound;

    }
}

class Cat extends Animals {
    @Override
    protected String makeSound(String sound) {
        return "Cat says: " + sound;
    }
}

class animalTest {
    void printSound(Animals animal) {
        System.out.println(animal.makeSound("Some sound"));
    }
}

class AnimalMain {
    public static void main(String[] args) {
        System.out.println(" example of inheritance...");
        System.out.println("father class: Animals");

        Animals animal1 = new Animals();
        animal1.eat();
        animal1.sleep();

        // animal1.bark(); This will cause a compile-time error because the Animals
        // class does not have the bark method.

        // ---------------------------- DOG ----------------------------------//

        System.out.println("\nchild class: Dog");

        Dog dog1 = new Dog();

        System.out.println("methods inherited from the Animals class:");
        dog1.eat();
        dog1.sleep();
        System.out.println(dog1.makeSound("Whooff!"));

        System.out.println("own method of the Dog class:");
        dog1.bark();

        // ------------------------------- Animal 2 ----------------------------------//

        // Animals animal2 = new Animals();
        // System.out.println(animal2.makeSound("grrr"));
        // }

        // Animals animal2 = new Dog();
        // System.out.println(animal2.makeSound("Whooff!")); // This will call the
        // makeSound method of the Dog class due to
        // polymorphism.

        Animals animal2 = new Cat();
        System.out.println(animal2.makeSound("Meow!")); // This will call the makeSound method of the Cat class due to
                                                        // polymorphism.
    }
}