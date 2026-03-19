package proof;

import aritmethic.Aritmetic;

public class AritmethicTry {

    public static void main(String[] args) {
        Aritmetic aritmetic = new Aritmetic(5, 7);

        aritmetic.sum();
        aritmetic.rest();
        System.out.println("\n----------------------\n");

        Aritmetic aritmetic2 = new Aritmetic(15, 3);
        aritmetic2.sum();

    }
}