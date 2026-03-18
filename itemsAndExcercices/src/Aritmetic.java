public class Aritmetic {
    int operation1;
    int operation2;

    public Aritmetic() {
        System.out.println("Creating aritmetic object...");
    }

    public void sum() {
        int result = operation1 + operation2;
        System.out.println("Sum: " + result);
    }

    public void rest() {
        int result = operation1 - operation2;
        System.out.println("Rest: " + result);
    }

    public static void main(String[] args) {
        Aritmetic sum = new Aritmetic();
        sum.operation1 = 20;
        sum.operation2 = 10;
        sum.sum();
        sum.rest();
        System.out.println("\n----------------------\n");
        // ----------------------//

        Aritmetic challenge = new Aritmetic();
        challenge.operation1 = 12;
        challenge.operation2 = 16;

        challenge.sum();
        challenge.rest();
    }
}
