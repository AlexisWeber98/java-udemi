package aritmethic;

public class Aritmetic {
    int operation1;
    int operation2;

    // constructors //

    public Aritmetic() {

    }

    public Aritmetic(int operation1, int operation2) {

        this.operation1 = operation1;
        this.operation2 = operation2;

    }

    // methods //

    public void sum() {
        int result = this.operation1 + this.operation2;
        System.out.println("Sum: " + result);
    }

    public void rest() {
        int result = this.operation1 - this.operation2;
        System.out.println("Rest: " + result);
    }

}
