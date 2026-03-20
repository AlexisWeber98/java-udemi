package aritmetic.aritmethicClass;

public class Aritmetic {
    private int operation1;
    private int operation2;

    // constructors //

    public Aritmetic() {

    }

    public Aritmetic(int operation1, int operation2) {

        this.operation1 = operation1;
        this.operation2 = operation2;

    }

    // methods //

    public int getOperation1() {
        return operation1;
    }

    public void setOperation1(int opt1) {
        this.operation1 = opt1;
    }

    public int getOperation2() {
        return operation2;
    }

    public void setOperation2(int opt2) {
        this.operation2 = opt2;
    }

    public void sum() {
        int result = this.operation1 + this.operation2;
        System.out.println("Sum: " + result);
    }

    public void rest() {
        int result = this.operation1 - this.operation2;
        System.out.println("Rest: " + result);
    }

}
