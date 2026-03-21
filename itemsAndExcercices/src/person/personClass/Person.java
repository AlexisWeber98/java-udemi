package person.personClass;

public class Person {
    private String name;
    private String surName;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public void showPerson() {
        System.out.printf("""
                Name: %s Surname: %s
                """, name, surName);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Surname: " + this.surName;
    }
}