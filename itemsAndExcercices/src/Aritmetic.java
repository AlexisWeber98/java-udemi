public class Aritmetic {
    int operation1;
    int operation2;

    // constructors //

    public Aritmetic() {
        System.out.println("Creating aritmetic object...\n");
    }

    public Aritmetic(int operation1, int operation2) {

        this.operation1 = operation1;
        this.operation2 = operation2;

        System.out.println("THIS: " + this);
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

    // -------------------------- MAIN --------------------------/
    public static void main(String[] args) {
        Aritmetic aritmetic = new Aritmetic(5, 7);
        // aritmetic.operation1 = 20;
        // aritmetic.operation2 = 10;

        aritmetic.sum();
        aritmetic.rest();
        System.out.println("\n----------------------\n");

        System.out.println("memory path : " + aritmetic);

        //

        Aritmetic aritmetic2 = new Aritmetic(10, 15);
        aritmetic2.sum();
        System.out.println("memory path : " + aritmetic2);

    }

}
