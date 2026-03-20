package aritmetic.aritmeticMain;

import aritmetic.aritmethicClass.Aritmetic;

public class AritmethicTry {

    public static void main(String[] args) {

        System.out.println("\n--------Aritmetic------\n");
        Aritmetic aritmetic = new Aritmetic(5, 7);

        aritmetic.sum();
        aritmetic.rest();

        System.out.println("\n---------Aritmetic 2-------------\n");

        Aritmetic aritmetic2 = new Aritmetic(15, 3);
        aritmetic2.sum();

        System.out.println(" operation 1: " + aritmetic2.getOperation1());
        System.out.println(" operation 2: " + aritmetic2.getOperation2());

        aritmetic2.setOperation1(20);
        aritmetic2.setOperation2(10);

        System.out.println(" operation 1 (after set): " + aritmetic2.getOperation1());
        System.out.println(" operation 2 (after set): " + aritmetic2.getOperation2());

        System.out.println("sum (after set): ");
        aritmetic2.sum();
    }
}