package com.example.simplerestapi;

import com.example.simplerestapi.entity.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTests {
    @Test
    public void createPersonTest() {
        Person person = new Person("a", "m");
        assertTrue(person.getName().equalsIgnoreCase("A"));
    }
}
