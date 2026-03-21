package person.personClass;

public class Person {
    private String name;
    private String surName;
    static int personCount = 0;
    private int uniqueId;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
        this.uniqueId = ++Person.personCount;
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

    public String personCount() {
        return "Number of people created: " + Person.personCount;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Surname: " + this.surName + " Unique ID: " + this.uniqueId;
    }

    public int getUniqueId() {
        return this.uniqueId;
    }
}