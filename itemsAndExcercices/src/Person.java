public class Person {
    String name;
    String surName;

    public void showPerson() {
        System.out.printf("""
                Name: %s Surname: %s
                """, name, surName);
    }

    public static void main(String[] args) {
        System.out.println("Creating person...");

        Person person1 = new Person();
        person1.name = "Pepe";
        person1.surName = "Perez";

        System.out.print("Person created: " + person1.name + " " + person1.surName + "\n");

        Person person2 = new Person();
        person2.name = "Juan";
        person2.surName = "Gomez";
        System.out.println("Creating person...");

        System.out.print("Person created: " + person2.name + " " + person2.surName + "\n");
    }
}
