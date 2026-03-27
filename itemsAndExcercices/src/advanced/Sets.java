package advanced;

import java.util.TreeSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> mySet = new TreeSet<>();

        mySet.add("Carlos");
        mySet.add("Carlos");
        mySet.add("Karla");
        mySet.add("Victoria");

        System.out.println("Elements :\n");

    mySet.forEach(System.out::println);

    // Eliminar un elemento del conjunto
    mySet.remove("Victoria");
    //removeAll elimina todos los elementos de un conjunto que esten en otro conjunto
    //mySet.removeAll(otroConjunto);
    System.out.println("\nElements after removing Victoria:\n");
    mySet.forEach(System.out::println);

    }
;}
