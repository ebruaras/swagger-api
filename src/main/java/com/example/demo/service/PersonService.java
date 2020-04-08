package com.example.demo.service;

import com.example.demo.model.Person;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {
    private List<Person> personList;
    @PostConstruct
    public void init(){
        personList=new ArrayList<>();
        personList.add(new Person(1,"Ebru","Aras"));
        personList.add(new Person(2,"İpek","Dinc"));
        personList.add((new Person(3,"Fatma","Gül")));
        personList.add(new Person(4,"Ahmet","Emin"));
        personList.add(new Person(5,"Ali","Faruk"));
    }
    public List<Person> findAllPersonByName(String name){
        List<Person> personListByName=personList.stream().filter(person -> person.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
        return personListByName;
    }
    public List<Person>getAllPerson(){
        return personList;
    }
    public void savePerson(Person person){
        personList.add(person);
    }
}
