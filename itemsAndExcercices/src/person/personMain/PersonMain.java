package person.personMain;

import person.personClass.Person;

public class PersonMain {
    public static void main(String[] args) {

        System.out.println("Creating person...");

        Person person1 = new Person("Jacinnto", "Gomez");
        System.out.println("Person created: " + person1.getName() + " " + person1.getSurName());

        person1.setName("Pepe");
        person1.setSurName("Perez");

        System.out.print("Person edited: " + person1.getName() + " " + person1.getSurName() + "\n");

        // --------------------------------------------------------------------------------------------------------//

        Person person2 = new Person("Pepe", "Pepazo");

        System.out.println("Creating person..." + person2.getName() + " " + person2.getSurName());

        person2.setName("Juan");
        person2.setSurName("Gomez");

        System.out.print("Person edited: " + person2.getName() + " " + person2.getSurName() + "\n");

        person2.showPerson();

    }
}
