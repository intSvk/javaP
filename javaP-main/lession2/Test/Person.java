package lession2.Test;

public class Person {

    // personName is a instance variable

    private Name personName;
    private static int personCounter;

    // This is a constructor

    public Person(Name personName) {
        this.personName = personName;
    }

    // hello is a instance method

    public String hello() {
        return "Hello World";
    }

    // This is a default constructor

    public Person() {

        personCounter++;
        // empty on purpose
    }

    public Name returnName() {
        return personName;
    }

    public String helloPerson(String name) {
        return "Hello " + name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}