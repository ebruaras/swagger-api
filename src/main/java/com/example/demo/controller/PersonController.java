package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.awt.*;

@Api(value = "Person Controller")
@RestController
public class PersonController {
    @Autowired
    PersonService personService;
    @RequestMapping(value = "/findByName/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Find person by name", notes = "return all persons by name",response = Person.class)
    public List<Person> findAllPersonByName(@PathVariable(value = "name") String name){
        return personService.findAllPersonByName(name);
    }
    @RequestMapping(value = "/getPersons",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Get all persons", notes = "return all persons",response = Person.class)
    public List<Person>getAllPerson(){
        return personService.getAllPerson();
    }
    @RequestMapping(value = "/insertPerson",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "insert person", notes = "insert person")
    public void savePerson(@RequestBody Person person){
        personService.savePerson(person);
    }

}
