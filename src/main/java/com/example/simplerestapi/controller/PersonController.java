package com.example.simplerestapi.controller;

import com.example.simplerestapi.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    List<Person> personList = new ArrayList<>();

    @GetMapping("/{name}")
    public Person getPersonByName(@PathVariable("name") String name) {
        for (Person person : personList) {
            if (person.getName().equalsIgnoreCase(name)) {
                return person;
            }
        }

        return null;
    }

    @PostMapping("/")
    public Person addPerson(Person person) {
        personList.add(person);
        return person;
    }

    @GetMapping("/")
    public List<Person> getPersonList() {
        return personList;
    }
}
