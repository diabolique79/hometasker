package com.hometasker.mk.controller;

import com.hometasker.mk.model.Person;
import com.hometasker.mk.repository.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PersonController {

   private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping("/")
    public String getPersons(Model model){
        List<Person> allPersons = personRepository.getAll();
        model.addAttribute("persons", allPersons);
        return "persons";
    }

    @RequestMapping("/person")
    public String getPerson(@RequestParam(value = "id") Integer id, Model model){
       // Person person = personRepository.getPersonById(id);
        //model.addAttribute("person", person);
        return "person";
    }
}
