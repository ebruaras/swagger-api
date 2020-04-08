package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;

public class Person {
    @ApiModelProperty(notes = "Id of the person",name = "id")
    private int id;
    @ApiModelProperty(notes = "Name of the person",name = "name")
    private String name;
    @ApiModelProperty(notes = "Surname of the person",name = "surname")
    private String surname;

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
