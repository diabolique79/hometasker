package com.hometasker.mk.repository;

import com.hometasker.mk.model.Person;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class PersonRepository {

   List<Person> personList = new ArrayList<>();

    public void createNewPerson(String personName) {

        personList.add(new Person("Ania"));
        personList.add(new Person("Kasia"));
        personList.add(new Person("Mamusia"));
        personList.add(new Person("Tatuś"));

    }
    public List<Person> getAll(){

        return personList;
    }


}


