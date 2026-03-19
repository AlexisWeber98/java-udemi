public class Aritmetic {
    int operation1;
    int operation2;

    public Aritmetic() {
        System.out.println("Creating aritmetic object...\n");
    }

    public Aritmetic(int operation1, int operation2) {

        this.operation1 = operation1;
        this.operation2 = operation2;
    }

    public void sum() {
        int result = this.operation1 + this.operation2;
        System.out.println("Sum: " + result);
    }

    public void rest() {
        int result = this.operation1 - this.operation2;
        System.out.println("Rest: " + result);
    }

    public static void main(String[] args) {
        Aritmetic sum = new Aritmetic(5, 7);
        // sum.operation1 = 20;
        // sum.operation2 = 10;
        sum.sum();
        sum.rest();
        System.out.println("\n----------------------\n");

    }

}
