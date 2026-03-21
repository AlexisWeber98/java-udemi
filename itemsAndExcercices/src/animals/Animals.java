package animals;

public class Animals {

    protected void eat() {
        System.out.println("Eating...");
    }

    protected void sleep() {
        System.out.println("Sleeping...");
    }

    protected void makeSound() {
        System.out.println("Some generic animal sound");
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
    protected void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

class Cat extends Animals {
    @Override
    protected void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

class animalTest {
    void printSound(Animals animal) {
        animal.makeSound();
    }
}

// --------------------------- MAIN --------------------------- //

class AnimalMain {
    public static void main(String[] args) {
        System.out.println(" example of inheritance...");
        System.out.println("father class: Animals");

        Animals animal1 = new Animals();
        animal1.eat();
        animal1.sleep();
        animal1.makeSound();

        // animal1.bark(); This will cause a compile-time error because the Animals
        // class does not have the bark method.

        // ---------------------------- DOG ----------------------------------//

        System.out.println("\nchild class: Dog");

        Dog dog1 = new Dog();

        System.out.println("methods inherited from the Animals class:");
        dog1.eat();
        dog1.sleep();
        dog1.makeSound();

        System.out.println("own method of the Dog class:");
        dog1.bark();

        // ------------------------------- Cat ----------------------------------//

        // Animals animal2 = new Animals();
        // animal2.makeSound();
        // }

        // Animals animal2 = new Dog();
        // animal2.makeSound(); // This will call the
        // makeSound method of the Dog class due to
        // polymorphism.

        Animals cat = new Cat();
        cat.makeSound(); // This will call the makeSound method of the Cat class due to
                         // polymorphism.
    }
}