package advanced;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> person = new HashMap<>();

        person.put("name", "John");
        person.put("lastName", "Lennon");
        person.put("age", "40");
        //person.put("age", "40");// Map does not allow duplicate keys, but it allows duplicate values. If you try to add a key that already exists, it will update the value associated with that key.
        person.put("age", "31"); // Si se agrega una clave que ya existe, se actualiza el valor asociado a esa clave
        person.remove("age"); // Eliminar un elemento del mapa por su clave
        System.out.println("\nPerson Information:");
        person.entrySet().forEach(System.out::println);

        System.out.println("\ngetting name: elements");
        person.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
}

