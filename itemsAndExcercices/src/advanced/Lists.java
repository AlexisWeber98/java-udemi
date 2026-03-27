package advanced;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // List myList = new List(); //not possible because List is an interface
        List<String> myList = new ArrayList<>(); // teiene accesso a todos los metodos de Collection y List

        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");
        myList.add("Saturday");
        myList.add("Sunday");
        myList.add("Sunday"); // List allows duplicate elements

    /*
    for (String element : myList) {
    System.out.println(element);
    }*/
        myList.forEach(element -> {
            System.out.println("Element Day: " + element);
        });

        myList.forEach(System.out::println);


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        System.out.println("\nNames in the list:\n");
        names.forEach(System.out::println);
    }

}
