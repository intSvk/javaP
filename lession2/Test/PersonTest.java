package lession2.Test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    // declared with final cannot fix the data so we dont use the final static
    // string array
    // insted we use enums
    final static String[] MY_STATIC_VALUES = { "PENDING", "PROCESSING", "PROCESSED" };

    @Test
    public void returnMethod() {
        Person shauvik = new Person();
        assertEquals("Hello World", shauvik.hello());
    }

    @Test
    public void returnName() {
        Person avik = new Person();
        assertEquals("Hello avik", avik.helloPerson("avik"));
    }

    @Test
    public void returnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        assertEquals(3, Person.numberOfPersons());

    }

    @Test
    public void returnNumberOfPersonsLoop() {
        Person person1;
        for (int i = 0; i < 4; i++) {
            person1 = new Person();
        }
        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void returnArray() {
        Person[] persons = new Person[4];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
        }
        for (Person person : persons) {
            person.hello();
        }
        for (Person i : persons) {
            i = new Person();
        }

        Person myperson = new Person();
        Person myperson2 = new Person();

        Person[] persons2 = { myperson, myperson2 };

        // Checking with the arrays

        for (String state : MY_STATIC_VALUES) {
            if (state.equals("PENDIONG")) {
                // myMethod();
            }
            if (state.equals("PROCESSING")) {
                // myMethod();
            }
        }

        // Checking with enums
        
        for (LoggingLevel state : LoggingLevel.values()) {
            if (state == LoggingLevel.PENDING) {
                // myMethod();
            }
            if (state == LoggingLevel.PENDING) {
                // myMethod();
            }
        }
    }
}