package animals;

public class Animals {

    protected void eat() {
        System.out.println("Eating...");
    }

    protected void sleep() {
        System.out.println("Sleeping...");
    }

}

class Dog extends Animals {

    public void bark() {
        System.out.println("Woof!");
    }

    @Override
    protected void sleep() {
        System.out.println("I need sleep...");
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

        System.out.println("\nchild class: Dog");

        Dog dog1 = new Dog();

        System.out.println("methods inherited from the Animals class:");
        dog1.eat();
        dog1.sleep();

        System.out.println("own method of the Dog class:");
        dog1.bark();

    }
}