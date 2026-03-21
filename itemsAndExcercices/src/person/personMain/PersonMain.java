package person.personMain;

import person.personClass.Person;

public class PersonMain {
    public static void main(String[] args) {

        Person person1 = new Person("Jacinnto", "Gomez");
        System.out.println("Person created: " + person1.getName() + " " + person1.getSurName());

        person1.setName("Pepe");
        person1.setSurName("Perez");

        System.out.print("Person edited: " + person1.getName() + " " + person1.getSurName() + "\n");

        System.out.println(" To string method: " + person1.toString()); // This will call the toString method of the
                                                                        // Person class.

        // System.out.println("Show father method toString: " + super.toString());

        // print static variable personCount
        System.out.println("Number of people created: " + person1.personCount());

        System.out.println(" ----------------------------------------------- ");

        Person person2 = new Person("Pepe", "Pepazo");

        System.out.println("Creating person...2   " + person2.getName() + " " + person2.getSurName());

        person2.setName("Juan");
        person2.setSurName("Gomez");

        person2.toString();

        person2.showPerson();
        System.out.println("Number of people created: " + person2.personCount());

    }
}
