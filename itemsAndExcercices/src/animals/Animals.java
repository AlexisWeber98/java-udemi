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
}