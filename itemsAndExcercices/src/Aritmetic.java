public class Aritmetic {
    int operation1;
    int operation2;

    public Aritmetic() {
        System.out.println("Creating aritmetic object...\n");
    }

    public Aritmetic(int opt1, int opt2) {

        operation1 = opt1;
        operation2 = opt2;
        System.out.println("Creating aritmetic object...\n");

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
        Aritmetic sum = new Aritmetic(5, 7);
        // sum.operation1 = 20;
        // sum.operation2 = 10;
        sum.sum();
        sum.rest();
        System.out.println("\n----------------------\n");

        Aritmetic aritmetic2 = new Aritmetic();
        aritmetic2.sum();

        aritmetic2.operation1 = 15;
        aritmetic2.operation2 = 5;
        aritmetic2.sum();

    }

}
