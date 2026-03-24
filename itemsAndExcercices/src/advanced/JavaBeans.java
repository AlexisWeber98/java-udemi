package advanced;

import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Pepe");
        person1.setLastName("Perez");
        System.out.println("\n");

        System.out.println(person1.toString());

        System.out.println("Name: " + person1.getName());
        System.out.println("Last Name: " + person1.getLastName());

    }
}

class Person implements Serializable {

    private String name;
    private String lastName;

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return "Person : {\n\tname='" + name + "',\n\tlastName='" + lastName + "'\n}";
    }

}
