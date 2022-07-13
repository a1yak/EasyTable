package com.example.easytableapp.Service;

import com.example.easytableapp.Models.Person;
import com.example.easytableapp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> showPeople(){
        return personRepository.findAll();
    }

    public void addPerson(Person person) {
        personRepository.save(person);

    }
}
