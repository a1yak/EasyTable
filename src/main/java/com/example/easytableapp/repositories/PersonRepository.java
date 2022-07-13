package com.example.easytableapp.repositories;

import com.example.easytableapp.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
